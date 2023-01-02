import java.io.IOException;

public class Ex04 {
  public static void main(String[] args){
    byte[] message = new byte[20];
  	/*
  	  System.in.read(message);

  	  기본 입력 버퍼의 내용을 byte 배열에 넣음
  	  argument 로 지정한 byte 배열의 0 번 째 index 부터 입력을 받음
  	  만약 버퍼의 내용이 byte 배열의 크기를 벗어난다면
  	  배열의 크기까지만 입력 받음

  	  byte배열을 매개변수로 받는 read() 메소드는
  	  읽어온 byte의 크기를 return함

      System.in.read(message, 3, 7);
  	  byte 배열 message 의 3 번째 index 부터 입력됨
  	  7 byte 만큼만 입력을 받는 read() 메소드
  	*/
    try {
      System.out.print("메세지를 입력하세요 : ");
      int size = System.in.read(message, 3, 7);
      System.out.println("size : " + size);

    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("프로그램 종료");
  }
}
