import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    int operation = 0;
    Scanner sc = new Scanner(System.in);

    // 무한반복 조건을 부여한 후
    // break 를 사용해서 반복을 종료함
    while (true) {
      System.out.println("1 - 덧셈");
      System.out.println("2 - 뺄셈");
      System.out.println("3 - 곱셈");
      System.out.println("4 - 나눗셈");
      System.out.println("5 - 나머지 연산");
      System.out.print("원하는 연산을 선택하세요 (종료는 0) : ");
      operation = sc.nextInt();

      if (operation == 0) {
        System.out.println("프로그램을 종료합니다");
        break;
        
      }else if (1 <= operation && operation <= 5) {

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int number1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int number2 = sc.nextInt();

        if (operation == 1) {
          System.out.printf("%d + %d = %d%n", number1, number2, number1 + number2);
        } else if (operation == 2) {
          System.out.printf("%d - %d = %d%n", number1, number2, number1 - number2);
        } else if (operation == 3) {
          System.out.printf("%d * %d = %d%n", number1, number2, number1 * number2);
        } else if (operation == 4) {
          System.out.printf("%d / %d = %d%n", number1, number2, number1 / number2);
        } else if (operation == 5) {
          System.out.printf("%d %% %d = %d%n", number1, number2, number1 % number2);
        }
      } else {
        System.out.println("1 ~ 5 중에서만 선택하세요");
        break;
      }
    } // while
    System.out.println("프로그램 종료");


  } // main
} // class
