import java.util.Scanner;

public class Ex06_1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("성적을 입력하세요 : ");
    int score = sc.nextInt();
    char grade = ' ';
    char plus_minus = ' ';

    if (0 <= score && score <= 100) {
      switch (score / 10) {
        case 9: case 10:
          grade = 'A';
          if (score <= 93){
            plus_minus = '-';
          }else if(94 <= score && score <= 96){
            plus_minus = '0';
          }else{
            plus_minus = '+';
          }
          break;
        case 8:
          grade = 'B';
          if (score <= 83){
            plus_minus = '-';
          }else if(84 <= score && score <= 86){
            plus_minus = '0';
          }else{
            plus_minus = '+';
          }
          break;
        case 7:
          grade = 'C';
          if (score <= 73){
            plus_minus = '-';
          }else if(74 <= score && score <= 76){
            plus_minus = '0';
          }else{
            plus_minus = '+';
          }
          break;
        case 6:
          grade = 'D';
          if (score <= 63){
            plus_minus = '-';
          }else if(64 <= score && score <= 66){
            plus_minus = '0';
          }else{
            plus_minus = '+';
          }
          break;
        default:
          grade = 'F';
      }
      System.out.printf("당신은 %c%c 학점입니다%n", grade, plus_minus);
    }else{
      System.out.println("성적을 정확하게 입력해 주세요");
    }



  }
}
