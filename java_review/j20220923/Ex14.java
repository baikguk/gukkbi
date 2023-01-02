import java.util.Scanner;

public class Ex14 {
  /*
     class scope
       ㄴ 여기서는 멤버변수를 선언하거나 초기화만 할 수 있고
          메소드를 작성할 수는 없음
  */
  public static void main(String[] args){
    // 사용자가 100 을 입력하면
    // 종료하는 프로그램을 작성하세요

    Scanner sc = new Scanner(System.in);
    int input;

    /*
      for 문을 무한반복문으로 설정하기
        ㄴ 초기화식, 조건식, 증가식 부분에
        ㄴ code 를 작성하지 않으면 무한 반복문이 됨
        ㄴ 이 경우에는 break 를 사용해서 종료함
    */
    for( ; ; ){
      System.out.print("정수 하나를 입력하세요 : ");
      if((input = sc.nextInt()) == 100){
        break;
      }  // if
    } // for

    System.out.println("프로그램 종료");
  } // main

} // class
