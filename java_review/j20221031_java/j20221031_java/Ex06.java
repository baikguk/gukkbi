import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {
  public static void main(String[] args){

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.print("정수를 입력하세요 : ");
      String message = br.readLine();
      int number = Integer.parseInt(message);
      System.out.printf("입력된 정수 : %d%n", number);

      System.out.print("실수를 입력하세요 : ");
      message = br.readLine();
      float fNumber = Float.parseFloat(message);
      System.out.printf("입력된 실수 : %.2f%n", fNumber);

      System.out.print("문자를 입력하세요 : ");
      char ch = (char)br.read();
      System.out.printf("입력된 문자 : %c%n", ch);

    }catch(Exception e){
      e.printStackTrace();
    } finally{
      try {
        if(br != null) { br.close(); }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println("프로그램 종료");
  }
}
