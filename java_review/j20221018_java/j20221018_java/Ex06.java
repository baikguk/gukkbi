import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[ ]args){
    System.out.println("프로그램 시작");

    try {
      // InputMisMatchException
      Scanner sc = new Scanner(System.in);
      System.out.print("정수를 입력하세요 : ");
      int number3 = sc.nextInt();
      System.out.println("number3 : " + number3);

      // ArithmeticException
      int number1 = 100;
      int number2 = 10;
      int result = number1 / number2;
      System.out.println("result : " + result);

      // ArrayIndexOutOfBoundsException
      int[] numbers = new int[5];
      numbers[5] = 222;
      System.out.println("numbers[4] : " + numbers[4]);

    }catch(InputMismatchException e){
      System.out.println("InputMismatchException 예외가 발생했습니다");
      System.out.println(e.getMessage());
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("ArrayIndexOutOfBoundsException 예외가 발생했습니다");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }catch(Exception e){
      System.out.println("예외가 발생했습니다");
      System.out.println(e.getMessage());
    }

    System.out.println("프로그램 종료");
  }
}
