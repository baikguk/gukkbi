import java.util.Scanner;

public class Ex03 {
  public static void main(String[ ]args){
    // 연도를 입력하면
    // 윤년인지 아닌지를 출력하는
    // code 를 작성하세요

    // 1) 연도를 저장하는 변수 : year
    int year = 0;

    // 2) 연도 입력 받기 : Scanner
    Scanner sc = new Scanner(System.in);
    System.out.print("연도를 입력하세요 : ");
    year = sc.nextInt();
    String result = "";

    // 3) 윤년인지 아닌지 조건으로 따져보기 : if
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
      result = "윤년";
    }else{
      result = "평년";
    }

    // 4) 출력하기
    System.out.printf("입력하신 연도는 %s 입니다", result);


  }
}
