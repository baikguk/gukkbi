public class Ex17 {
  public static void main(String[] args){
    /*
     **********
     **********   System.out.print("*");
     **********
     **********
     외부 for 문의 반복 :  4 회
     내부 for 문의 반복 : 10 회
    */
    for(int i = 1; i <= 4; i++){
      for(int j = 1; j <= 10; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("=======================");

    /*

     *
     **
     ***
     ****
     *****
     ******
     *******
     ********
     *********
     **********

    */

    for(int i = 1; i <= 10; i++){
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("=======================");

    /*

              *
             **
            ***
           ****     System.out.print(" ");
          *****     System.out.print("*");
         ******
        *******
       ********
      *********
     **********

     */

    for(int i = 1; i <= 10; i++){
      for(int j = 1; j <= 10 - i; j++){
        System.out.print(" ");
      }
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("=======================");

    /*

              *
             ***
            *****
           *******
          *********
         ***********
        *************
       ***************
      *****************
     *******************

     */
    for(int i = 1; i <= 10; i++){
      for(int j = 1; j <= 10 - i; j++){
        System.out.print(" ");
      }
      for(int j = 3; j <= i * 2 + 1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("=======================");


  }
}
