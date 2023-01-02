import java.io.IOException;

public class Ex03 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");

    int number = 0;

    // 표준입력 Stream
    try {
      System.out.print("문자열을 입력하세요 : ");

      while(true) {
        // System.in.read() <-- 기본 입력 buffer 에서 가장 앞쪽의 1 byte 을 읽음
        number = System.in.read();

        // ASCII code 10 : line feed (줄바꿈)
        if(number == 10){
          break;
        }
        System.out.println("읽은 값 (int)  : " + number);
        System.out.println("읽은 값 (char) : " + (char) number);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("프로그램 종료");
  } // main
}
