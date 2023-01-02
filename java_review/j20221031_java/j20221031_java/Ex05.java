import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex05 {
  public static void main(String[] args){

    // InputStreamReader : 문자기반 보조스트림
    // byte stream 을 문자 stream 으로 변경함

    // 표준입력스트림 : 기반스트림
    // InputStreamReader isr = new InputStreamReader(System.in);

    // BufferedReader
    // buffer 를 사용해서 문자 stream 으로부터 data 를 읽어들임
    // BufferedReader br = new BufferedReader(isr);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.print("메세지를 입력하세요 : ");
      String message = br.readLine();
      System.out.printf("입력된 메세지 : %s%n", message);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        if(br != null){ br.close(); }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    System.out.println("프로그램 종료");
  }
}
