public class Ex02 {
  public static void main(String[ ]args){

    // 짝수단만 출력하는 구구단을 작성하세요
    // 1) 모든 단을 출력하는 구구단을 작성함
    // 2) code 의 적당한 위치에 조건문을 삽입함

    for(int dan = 2; dan <= 9; dan++){
      if(dan % 2 == 0) {
        for (int number = 1; number <= 9; number++) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");

    for(int dan = 2; dan <= 9; dan++){
        for (int number = 1; number <= 9; number++) {
          if(dan % 2 == 0) {
            System.out.printf("%d X %d = %d%n", dan, number, dan * number);
          }
        }
      System.out.println();
    }
    System.out.println("-----------------------------------");

    for(int dan = 2; dan <= 9; dan++){
      if(dan % 2 != 0) {
        for (int number = 1; number <= 9; number++) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");

    // 각(모든) 단에 짝수만 곱하는
    // 구구단을 출력하는
    // for 문을 작성하세요
    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        if(number % 2 == 0) {
          System.out.printf("%d X %d  = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");

    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        if(number % 2 == 1) {
          System.out.printf("%d X %d  = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");

    /*
      짝수 단에는 짝수만 곱하고
      홀수 단에는 홀수만 곱하는
      구구단을 출력하는 for 문을 작성하세요
    */
    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        // if문을 연속해서 사용하면 OR 논리연산을 함
        if(dan % 2 == 0 && number % 2 == 0) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
        if(dan % 2 == 1 && number % 2 == 1) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");

    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        // if문을 연속해서 사용하면 OR 논리연산을 함
        if((dan % 2 == 0 && number % 2 == 0) || (dan % 2 == 1 && number % 2 == 1)) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");

    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        if(dan % 2 == number % 2) {
          System.out.printf("%d X %d = %d%n", dan, number, dan * number);
        }
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");

  }
}






