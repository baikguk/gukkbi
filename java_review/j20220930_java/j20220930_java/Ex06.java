import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args){
    // 단어 맞히기 게임
    // 영어단어와 한글뜻을 저장한 일차원 배열들로
    // 이루어진 이차원배열을 생성하고
    // 영어단어를 입력하면 한글뜻을 출려하는
    // 프로그램을 작성하세요

    String[][] words = {
                         {"school", "학교"},
                         {"teacher", "선생님"},
                         {"student", "학생"},
                         {"pencil", "연필"},
                         {"building", "건물"}
                       };

    for(int i = 0; i < words.length; i++){
      for(int j = 0; j < words[i].length; j++){
        System.out.printf("%s ", words[i][j]);
      }
      System.out.println("\n------------------------");
    }

    // 영어단어만
    for(int i = 0; i < words.length; i++){
      System.out.printf("%s ", words[i][0]);
    }
    System.out.println("\n------------------------");

    // 한글뜻만
    for(int i = 0; i < words.length; i++){
      System.out.printf("%s ", words[i][1]);
    }
    System.out.println("\n------------------------");

    Scanner sc = new Scanner(System.in);

    for(int i = 0; i < words.length ;i++){
      System.out.printf("%s 의 한글뜻을 입력하세요 : ", words[i][0]);
      String answer = sc.next();

      if(words[i][1].equals(answer)){
        System.out.println("정답입니다 !!!");
      }else{
        System.out.printf("정답이 아닙니다. 정답은 %s 입니다%n", words[i][1]);
      }
    } // for
    System.out.println("프로그램 종료");
  }
}
