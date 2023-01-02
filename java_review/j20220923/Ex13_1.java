import java.util.Scanner;

public class Ex13_1 {
  public static void main(String[] args) {
    // -- for 문 (+ if 문) 을 사용해서 --
    // 정수 세 개를 입력받아서  <- Scanner
    // 합계, 최댓값, 최솟값 출력하기

    Scanner sc = new Scanner(System.in);

    // 합계, 최댓값, 최솟값 저장하는 변수
    int sum = 0;
    int max = 0;
    int min = 0;

    System.out.print("입력할 숫자는 몇 개인가요? ");
    int count = sc.nextInt();
    for (int i = 0, input; i < count; i++) {
      System.out.printf("%d 번째 정수를 입력하세요 : ", i + 1);
      input = sc.nextInt();
      sum += input;

      if(i == 0){
        max = min = input;
      }else{
        if(input > max){
          max = input;
        }else if(input < min){
          min = input;
        }
      }
    }
    System.out.println("합계 : " + sum);
    System.out.println("최댓값 : " + max);
    System.out.println("최솟값 : " + min);
  }
}
