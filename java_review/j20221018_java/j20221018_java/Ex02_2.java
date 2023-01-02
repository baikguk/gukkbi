public class Ex02_2 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");

    int number1 = 100;
    int result = 0;

    for(int i = 0; i < 10; i++){
      System.out.printf("-- %d 회 --%n", i + 1);
      int number2 = (int) (Math.random() * 10);
      System.out.println("number2 : " + number2);
      if(number2 == 0) {
        System.out.println("숫자는 0 으로 나눌 수 없습니다");
      }else {
        result = number1 / number2;
      }
      System.out.println("result : " + result);
      System.out.println("---------------------");
    } // for
    System.out.println("프로그램 종료");
    /*
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	  at Ex02.main(Ex02.java:10)
    */
  } // main
} // class

