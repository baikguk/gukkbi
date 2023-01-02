import java.util.Scanner;

public class Ex20_1 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    // do-while 문 : do code block 에 있는 내용이 한 번 실행하고나서
    //               조건문의 조건이 참인 동안 반복함
    //      do code block 에 있는 명령문의 최소 한 번의 실행을 보장함
    do{
      System.out.print("정수를 입력하세요 (100-종료) : ");
    }while(sc.nextInt() != 100);

    System.out.println("프로그램 종료");
  }
}
