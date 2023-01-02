import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Ex02Server {
  HashMap clients;

  Ex02Server(){
    this.clients = new HashMap();
    Collections.synchronizedMap(clients);
  } // 생성자

  public void start(){
    ServerSocket serverSocket = null;
    Socket socket = null;

    try {
      serverSocket = new ServerSocket(9999);
      System.out.println("서버 시작됨");

      while(true){
        socket = serverSocket.accept();
        System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + "] 에서 접속함");
        ServerReceiver thrd = new ServerReceiver(socket);
        thrd.start();
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  } // start()

  void sendToAll(String message){
    Iterator iter = clients.keySet().iterator();

    while(iter.hasNext()){
      try {
        DataOutputStream out = (DataOutputStream) clients.get(iter.next());
        out.writeUTF(message);
      }catch(IOException e){ }
    } // while
  } // sentToAll

  public static void main(String[] args){
    Ex02Server server = new Ex02Server();
    server.start();
  }

  // 내부 클래스 ServerReceiver
  class ServerReceiver extends Thread{
    Socket socket;
    DataInputStream in;
    DataOutputStream out;

    ServerReceiver(Socket socket){
      this.socket = socket;
      try {
        in  = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
      } catch (IOException e) { }
    } // 생성자

    @Override
    public void run(){
      String name = "";
      try {
        name = in.readUTF();
        sendToAll("[" + name + "] 님 입장");

        clients.put(name, out);
        System.out.println("현재 서버 접속자 수 : " + clients.size() + " 명입니다");

        while(in != null){
          sendToAll(in.readUTF());
        }
      } catch (IOException e) {

      } finally {
        sendToAll("[" + name + "] 님 퇴장");
        clients.remove(name);
        System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + "] 에서 접속을 종료함");
        System.out.println("현재 서버 접속자 수 : " + clients.size() + " 명입니다");
      } // try - catch - finally
    } // run

  } // 내부 클래스 ServerRecever

} // Ex02Server class
