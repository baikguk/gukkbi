import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex13 {
  public static void main(String []args){

    // InetAddress : ip 주소를 다루는 클래스
    InetAddress ip = null;
    InetAddress[] arrIP = null;

    try {
      // getByName() 메소드의 반환값 : InetAddress 객체
      ip = InetAddress.getByName("www.naver.com");

      System.out.println("getHostName :" + ip.getHostName());
      System.out.println("getHostAddress :" + ip.getHostAddress());
      System.out.println("toString() :" + ip.toString());

      byte[] ipAddress = ip.getAddress();
      System.out.println("getAddress : " + Arrays.toString(ipAddress));

      String result = "";
      for(int i = 0; i < ipAddress.length; i++){
        result += (ipAddress[i] < 0) ? ipAddress[i] + 256 : ipAddress[i];
        result += ".";
      }
      System.out.println("getAddress+256 : \n" + result);

    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

    try {
      ip = InetAddress.getLocalHost();
      System.out.println("getHostName : " + ip.getHostName());
      System.out.println("getHostAddress : \n" + ip.getHostAddress());

    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

    try {
      arrIP = InetAddress.getAllByName("www.naver.com");
      System.out.println("네이버의 ip 개수 : " + arrIP.length + " 개");

      for(int i = 0; i < arrIP.length; i++){
        System.out.println("ipArr[" + i + "] : " + arrIP[i]);
      }

    } catch (UnknownHostException e) {
      e.printStackTrace();
    }


  }
}
