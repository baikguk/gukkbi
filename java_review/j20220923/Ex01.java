import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args){
    // 현재 월이 어느 계절에 속해 있는지 알아보기

    int month = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("현재 월을 입력하세요 : ");
    month = sc.nextInt();
    String season = "";

    switch(month){
      case 3: case 4: case 5:
        season = "봄"; break;
      case 6: case 7: case 8:
        season = "여름"; break;
      case 9: case 10: case 11:
        season = "가을"; break;
      case 12: case 1: case 2:
        season = "겨울"; break;
      default:
        season = "?";
    }
    if (!season.equals("?")) {
      System.out.printf("현재 계절은 %s 입니다", season);
    }else{
      System.out.println("월은 1 ~ 12 사이의 숫자를 입력해 주세요");
    }
  }
}
