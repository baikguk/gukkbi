import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class Ex01Client {
  public static void main(String[] args){

    try {
      // Client 에서 Socket 객체를 생성하면
      // Server 로 연결요청을 하게 됨
      String serverIp = "127.0.0.1";
      Socket cSocket = new Socket(serverIp, 9999);
      System.out.println("Server 에 연결됨");

      Sender sender = new Sender(cSocket);
      Receiver receiver = new Receiver(cSocket);

      sender.start();
      receiver.start();

    } catch (ConnectException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  } // main
} // Client
