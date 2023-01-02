public class Ex19 {
  public static void main(String[] args){
    /*
      for 문 : 반복횟수가 중요하거나 정해져있는 경우,
               또는 알 수 있는 경우에 주로 사용함

      while 문 : 반복횟수가 중요하지 않거나
                 알 수 없는 경우에 주로 사용함

                 형식]
                   while (조건식이나 변수){
                     반복할 명령문....
                   }
    */
    for(int i = 1; i <= 10; i++){
      System.out.printf("%d ", i);
    }
    System.out.println("\n------------------------------------");

    int i = 1;
    while(i <= 10){
      System.out.printf("%d ", i);
      i++;
    }
    System.out.println("\n------------------------------------");

    i = 0;
    while(i < 10){
      i++;
      System.out.printf("%d ", i);
    }
    System.out.println("\n------------------------------------");

    // 구구단을 while 문으로 작성하세요

    for(int dan = 2; dan <= 9; dan++){
      for(int number = 1; number <= 9; number++){
        System.out.printf("%d X %d = %d%n", dan, number, dan*number);
      }
      System.out.println();
    }
    System.out.println("\n------------while----------------");

    int dan = 2;
    int number = 0;
    while(dan <= 9){
      number = 1;
      while(number <= 9){
        System.out.printf("%d X %d = %d%n", dan, number, dan*number);
        number++;
      }
      System.out.println();
      dan++;
    }


  }
}
