import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요 (100-종료) : ");

    while(sc.nextInt() != 100){
      System.out.print("정수를 입력하세요 (100-종료) : ");
    }

    System.out.println("프로그램 종료");
  }
}
