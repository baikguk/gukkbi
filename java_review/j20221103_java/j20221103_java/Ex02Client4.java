import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Ex02Client4 {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("대화명을 입력하세요");
      System.out.println("프로그램을 종료합니다");
      System.exit(0);
    }
    try {
      String serverIp = "127.0.0.1";
      Socket socket = new Socket(serverIp, 9999);
      System.out.println("서버에 연결됨");

      Thread sender = new Thread(new Ex02Client.ClientSender(socket, args[0]));
      Thread receiver = new Thread(new Ex02Client.ClientReceiver(socket));

      sender.start();
      receiver.start();

    }catch(ConnectException ce){
      ce.printStackTrace();
    }catch (Exception e) { }

  } // main

  // static 내부 클래스 ClientSender
  static class ClientSender extends Thread{
    Socket socket;
    DataOutputStream out;
    String name;

    ClientSender(Socket socket, String name){
      this.socket = socket;
      try {
        out = new DataOutputStream(socket.getOutputStream());
        this.name = name;
      } catch (IOException e) { }
    } //  생성자

    @Override
    public void run(){
      Scanner sc = new Scanner(System.in);
      try {
        if(out != null){
          out.writeUTF(name);
        }
        while(out != null){
          out.writeUTF("[" + name + "] " + sc.nextLine());
        }
      } catch (IOException e) { }
    } // run
 } // ClientSender

  // static 내부 클래스 ClientReceiver
  static class ClientReceiver extends Thread{
    Socket socket;
    DataInputStream in ;

    ClientReceiver(Socket socket) {
      this.socket = socket;
      try {
        in = new DataInputStream(socket.getInputStream());
      } catch (IOException e) { }
    } // 생성자

    @Override
    public void run(){
      while(in != null){
        try {
          System.out.println(in.readUTF());
        } catch (IOException e) { }
      } // while
    } // run
  } // 내부 클래스 ClientReceiver

} // Ex02Client
