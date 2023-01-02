public class Ex01 {
  public static void main(String[] args){

    // 2 차원 배열 : 배열 안에 배열이 있는 배열
    /*
        구구단 구조

        단 수 X  곱하는 수
        (2-9)      (1-9)
          2        (1-9)
          3        (1-9)
          4        (1-9)
    */

    System.out.println("2 X 1 = 2*1");
    System.out.println("2 X 2 = 2*2");
    System.out.println("2 X 3 = 2*3");
    System.out.println("2 X 4 = 2*4");
    System.out.println("2 X 5 = 2*5");
    System.out.println("2 X 6 = 2*6");
    System.out.println("2 X 7 = 2*7");
    System.out.println("2 X 8 = 2*8");
    System.out.println("2 X 9 = 2*9");

    System.out.println("-------------------------");


    for(int dan = 2; dan <= 9; dan++) {
      // System.out.println("-- " + dan + " 단 --");
      // System.out.printf("-- %d 단 --%n", dan);
      for (int i = 1; i <= 9; i++) {
        System.out.printf("%d X %d = %d%n", dan, i, dan * i);
      }
      System.out.println();
    }
    System.out.println("-------------------------");



  }
}
