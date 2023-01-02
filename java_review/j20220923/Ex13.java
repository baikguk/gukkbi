import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args){
    // -- if 문만 사용해서 --
    // 정수 세 개를 입력받아서  <- Scanner
    // 합계, 최댓값, 최솟값 출력하기

    Scanner sc = new Scanner(System.in);

    //  입력 받는 정수 저장하는 변수
    int num1, num2, num3;

    // 합계, 최댓값, 최솟값 저장하는 변수
    int sum = 0;
    int max = 0;
    int min = 0;

    System.out.print("첫 번째 정수를 입력하세요 : ");
    num1 = sc.nextInt();
    System.out.print("두 번째 정수를 입력하세요 : ");
    num2 = sc.nextInt();
    System.out.print("세 번째 정수를 입력하세요 : ");
    num3 = sc.nextInt();

    // num1 이 최댓값인 조건 : num1 이 num2 와 num3 보다 크면 최댓값임
    // num2 이 최댓값인 조건 : num2 가 num1 과 num3 보다 크면 최댓값임
    // num3 이 최댓값인 조건 : num3 이 num1 과 num2 보다 크면 최댓값임

    if(num1 >= num2 && num1 >= num3){
      max = num1;
    } else if (num2 >= num3) {
      max = num2;
    } else{
      max = num3;
    }
    System.out.println("최댓값 : " + max);

    if(num1 <= num2 && num1 <= num3){
      min = num1;
    } else if (num2 <= num3) {
      min = num2;
    } else{
      min = num3;
    }
    System.out.println("최솟값 : " + min);
  }
}
