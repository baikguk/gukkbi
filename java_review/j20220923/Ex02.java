import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args){
    // 달 수를 입력하고
    // 그 달이 며칠까지 있는지
    // 출력하는 code 를 작성하세요

    // switch 문 안에 if 문을 사용할 수도 있고
    // if 문 안에 switch 문을 사용할 수도 있음

    // 1, 3, 5, 7, 8, 10, 12 - 31
    // 4, 6, 9, 11 - 30
    // 2 - 28

    /*
      윤년
        4로 나누어 떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어지는 연도
         (year % 4 == 0  &&  year % 100 != 0) || year % 400 == 0
    */

    int month = 0;
    int date = 0;
    int year = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("연도를 입력하세요 : ");
    year = sc.nextInt();
    System.out.print("달 수를 입력하세요 : ");
    month = sc.nextInt();

    switch(month){
      case 1: case 3: case 5: case 7:
      case 8: case 10: case 12:
        date = 31; break;
      case 4: case 6: case 9: case 11:
        date = 30; break;
      case 2:
        if ((year % 4 == 0  &&  year % 100 != 0) || year % 400 == 0) {
          date = 29;
        }else{
          date = 28;
        }
        break;
      default:
        date = -1;
    }
    if (date != -1){
      System.out.printf("%d 년 %d 월은 %d 일까지 있습니다", year, month, date);
    }else{
      System.out.println("달 수를 정확하게 입력해 주세요");
    }

  }
}

