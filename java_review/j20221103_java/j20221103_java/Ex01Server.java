import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex01Server {
  public static void main(String[] args){
    ServerSocket serverSocket = null;
    Socket sSocket = null;

    try {
      // ServerSocket 을 생성해서 9999 번 port 와 연결(bind)시킴
      serverSocket = new ServerSocket(9999);
      System.out.println("서버 준비됨");

      // Client 가 올바른 ip 와 port 번호를 가지고 접근했을 때
      // serverSocket.accept() 메소드가 자동으로 호출됨
      sSocket = serverSocket.accept();

      Sender sender   = new Sender(sSocket);
      Receiver receiver = new Receiver(sSocket);

      sender.start();
      receiver.start();
    } catch (Exception e) {    }

  }
}

class Sender extends Thread{
  Socket senderSocket;
  DataOutputStream out;
  String name;

  Sender(Socket senderSocket){
    this.senderSocket = senderSocket;
    try {
      out = new DataOutputStream(senderSocket.getOutputStream());
      name = "[" + senderSocket.getInetAddress() + " : " + senderSocket.getPort() + "]";
    } catch (Exception e) { }
  } // 생성자

  @Override
  public void run(){
    Scanner sc = new Scanner(System.in);
    while(out != null){
      try {
        out.writeUTF(name + sc.nextLine());
      } catch (IOException e) { }
    }  // while
  } // run

} // Sender

class Receiver extends Thread{
  Socket receiverSocket;
  DataInputStream in;

  Receiver(Socket receiverSocket){
    this.receiverSocket = receiverSocket;
    try {
      in = new DataInputStream(receiverSocket.getInputStream());
    } catch (IOException e) {  }
  } // 생성자

  @Override
  public void run(){
    while(in != null){
      try {
        System.out.println(in.readUTF());
      } catch (IOException e) { }
    } // while
  } // run
} // Receiver






