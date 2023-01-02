import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    // 입력하는 숫자들의 합계 구하기
    // boolean 변수 사용하기

    int count  = 0;
    int number = 0;
    int sum    = 0;

    boolean flag = true;

    while(flag){
      System.out.print(++count + " 번째 숫자를 입력하세요 (종료 - 0) : ");
      number = sc.nextInt();

      // 0 을 입력한 경우, while 반복문을 종료하는 조건
      if (number != 0){
        sum += number;
      }else{
        flag = false;
      }
    }
    System.out.println("입력한 숫자들의 합계 : " + sum);

  }
}
