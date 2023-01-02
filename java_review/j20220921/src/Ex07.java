import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("두 자리 정수를 하나 입력해 주세요 : ");

    String inputNumber = sc.nextLine();

    // 입력받은 문자열을 int type 으로 변환함
    int number = Integer.parseInt(inputNumber);

    System.out.println("입력 내용 : " + inputNumber);

    System.out.printf("number : %d%n", number);
  }
}
