import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args){
    /*
      switch(변수){ }
              ㄴ int type 이하의 정수만 사용할 수 있음
              ㄴ byte short int + char + String type
      break 를 사용해서 case 문 별로 실행됨
      case 값 :  <- 값으로는 변수를 사용할 수 없음 : literal, 상수(final)만 됨
    */

    Scanner sc = new Scanner(System.in);
    System.out.println("성적을 입력하세요 : ");

    int score = sc.nextInt();

    char grade = ' ';

    switch(score / 10){
      case 9: case 10:
        grade = 'A';  break;
      case 8:
        grade = 'B';  break;
      case 7:
        grade = 'C';  break;
      case 6:
        grade = 'D';  break;
      default:
        grade = 'F';
    }
    System.out.printf("당신은 %c 학점입니다%n", grade);


  }
}
