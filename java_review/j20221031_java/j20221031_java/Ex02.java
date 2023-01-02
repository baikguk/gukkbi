import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    // data 를 읽는 Stream 준비하기
    OutputStream out = null;

    try {
      out = new FileOutputStream("C:/test/writeString.txt");

      while(true){
        System.out.print("문자열을 입력하세요 : ");
        String str1 = sc.nextLine();
        System.out.println("입력한 문자열 : " + str1);

        // exit 입력시 while 문 종료함
        if(str1.equalsIgnoreCase("exit")){
          break;
        }
        // String -> byte array
        byte[] data = str1.getBytes();
        // byte 배열에 있는 data 를 OutputStream 에 써서 내보내기
        out.write(data);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }catch (IOException e) {
      e.printStackTrace();
    } finally{
      // 출력 Stream 을 닫음
      try {
        if(out != null) { out.close(); }
      } catch (IOException e) { }
    }

     System.out.println("프로그램 종료");
  } // main
}
