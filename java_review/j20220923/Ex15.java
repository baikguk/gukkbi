/*
  중첩 for 문 :  nested for loop

  구구단 출력하기

    단수  X  곱하는 수
   (2 ~ 9)    (1 ~ 9)

*/

public class Ex15 {
  public static void main(String[] args){

    System.out.printf("2 X 1 = 2%n");
    System.out.printf("2 X 2 = 4%n");
    System.out.printf("2 X 3 = 6%n");
    System.out.printf("2 X 4 = 8%n");
    System.out.printf("2 X 5 = 10%n");
    System.out.printf("2 X 6 = 12%n");
    System.out.printf("2 X 7 = 14%n");
    System.out.printf("2 X 8 = 16%n");
    System.out.printf("2 X 9 = 18%n");

    System.out.println("=============================");

    for(int number = 1; number <= 9; number++) {
      System.out.printf("2 X %d = %d%n", number, (2 * number));
    }
    for(int number = 1; number <= 9; number++) {
      System.out.printf("3 X %d = %d%n", number, (3 * number));
    }
    for(int number = 1; number <= 9; number++) {
      System.out.printf("4 X %d = %d%n", number, (4 * number));
    }
    for(int number = 1; number <= 9; number++) {
      System.out.printf("5 X %d = %d%n", number, (5 * number));
    }
    for(int number = 1; number <= 9; number++) {
      System.out.printf("6 X %d = %d%n", number, (6 * number));
    }
    for(int number = 1; number <= 9; number++) {
      System.out.printf("7 X %d = %d%n", number, (7 * number));
    }
    for(int number = 1; number <= 9; number++) {
      System.out.printf("8 X %d = %d%n", number, (8 * number));
    }
    for(int number = 1; number <= 9; number++) {
      System.out.printf("9 X %d = %d%n", number, (9 * number));
    }

    System.out.println("=============================");

    /*
     단수  X  곱하는 수
    (2 ~ 9)    (1 ~ 9)  <- 증가하는 수 : 내부 for 문
      ㄴ 고정된 수 : 외부 for 문
    */
    for(int dan = 2; dan <= 9; dan++) {
      System.out.printf("-- %d 단 --%n", dan);
      for (int number = 1; number <= 9; number++) {
        System.out.printf("%d X %d = %d%n", dan, number, (dan * number));
      }
      System.out.println();
    }

    System.out.println("=============================");

    for(int i = 1; i <= 3; i++){
      for(int j = 1; j <= 3; j++){
        for(int k = 1; k <= 3; k++) {
          System.out.printf("%d - %d - %d%n", i, j, k);
        }
      }
    }

  }
}
