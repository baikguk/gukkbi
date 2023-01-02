public class Ex04 {
  public static void main(String[ ]args){

    String str1 = new String("hello");

    int[] nums = {1, 2, 3, 4, 5};
    System.out.println("nums.length : " + nums.length);

    /*
      2 차원 배열  {{}, {}, {}, {}, {}, {}}
    */
    int[][] number = {
                      { 1,  2,  3,  4,  5},
                      { 6,  7,  8,  9, 10},
                      {11, 12, 13, 14, 15},
                      {16, 17, 18, 19, 20},
                      {21, 22, 23, 24, 25},
                      {26, 27, 28, 29, 30},
                     };

    System.out.println("number.length : " + number.length);

    System.out.println("number[0].length : " + number[0].length);
    System.out.println("number[1].length : " + number[1].length);
    System.out.println("number[2].length : " + number[2].length);
    System.out.println("number[3].length : " + number[3].length);
    System.out.println("number[4].length : " + number[4].length);
    System.out.println("number[5].length : " + number[5].length);

    System.out.println("number[2] : " + number[2]);
    System.out.println("number[2][2] : " + number[2][2]);
    System.out.println("-------------------------");


    for (int i = 0; i < number[0].length; i++) {
      System.out.printf("%d ", number[0][i]);
    }
    System.out.println("\n-------------------------");

    for (int i = 0; i < number[1].length; i++) {
      System.out.printf("%d ", number[1][i]);
    }
    System.out.println("\n-------------------------");

    // number[2] <--  {11, 12, 13, 14, 15},
    for (int i = 0; i < number[2].length; i++) {
      System.out.printf("%d ", number[2][i]);
    }
    System.out.println("\n-------------------------");

    for (int i = 0; i < number[3].length; i++) {
      System.out.printf("%d ", number[3][i]);
    }
    System.out.println("\n-------------------------");

    for (int i = 0; i < number[4].length; i++) {
      System.out.printf("%d ", number[4][i]);
    }
    System.out.println("\n-------------------------");

    for (int i = 0; i < number[5].length; i++) {
      System.out.printf("%d ", number[5][i]);
    }
    System.out.println("\n===========================");



    for(int j = 0; j < 5; j++) {
      for (int i = 0; i < number[j].length; i++) {
        System.out.printf("%d ", number[j][i]);
      } // inner for
      System.out.println("\n-------------------------");
    } // outer for

    int[][] number2 = new int[][]{
                                  new int[]{ 1,  2,  3,  4,  5},
                                  new int[]{ 6,  7,  8,  9, 10},
                                  new int[]{11, 12, 13, 14, 15},
                                  new int[]{16, 17, 18, 19, 20},
                                  new int[]{21, 22, 23, 24, 25},
                                  new int[]{26, 27, 28, 29, 30},
                                };

    System.out.println("number2    : " + number2);
    System.out.println("number2[0] : " + number2[0]);
    System.out.println("number2[1] : " + number2[1]);
    System.out.println("number2[2] : " + number2[2]);
    System.out.println("number2[3] : " + number2[3]);
    System.out.println("number2[4] : " + number2[4]);
    System.out.println("number2[5] : " + number2[5]);

    System.out.println("number2[5][3] : " + number2[5][3]);
  } // main
} // class
