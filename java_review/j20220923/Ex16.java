public class Ex16 {
  public static void main(String[] args){

    // 홀수 단만 출력하는 구구단을 작성하세요
    for(int dan = 2; dan <= 9; dan++){
      if (dan % 2 == 1) {
        for (int number = 1; number <= 9; number++) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("=============================");

    // 홀수 단만 출력하는 구구단을 작성하세요
    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        if (dan % 2 == 1) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("=============================");

    // 짝수 단만 출력하는 구구단을 작성하세요
    for(int dan = 2; dan <= 9; dan++){
      if (dan % 2 == 0) {
        for (int number = 1; number <= 9; number++) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("=============================");

    // 홀수만 곱하는 구구단을 출력하세요
    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        if(number % 2 == 1) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("=============================");

    // 짝수만 곱하는 구구단을 출력하세요
    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        if(number % 2 == 0) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("=============================");


    /*
      짝수단에는 짝수만 곱하고
      홀수단에는 홀수만 곱하는
      구구단을 출력하세요
    */
    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        // if 문을 연달아서 사용하면 or 조건으로 동작함
        if(dan % 2 == 0 && number % 2 == 0) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
        if(dan % 2 == 1 && number % 2 == 1) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("=============================");

    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        if(dan % 2 == 0 && number % 2 == 0 || dan % 2 == 1 && number % 2 == 1) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("=============================");

    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        if(dan % 2 == number % 2) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("=============================");


  }
}





