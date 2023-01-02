import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");

    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("정수를 입력하세요 : ");
      int number = sc.nextInt();
      System.out.println("number : " + number);
    }catch(InputMismatchException e) {
     System.out.println("정수만 입력해 주세요");
    }

    System.out.println("프로그램 종료");
  }
}
