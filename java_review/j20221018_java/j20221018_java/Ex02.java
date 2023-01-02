public class Ex02 {
  public static void main(String[] args){
    int number1 = 100;
    int result = 0;

    for(int i = 0; i < 10; i++){
      System.out.printf("-- %d 회 --%n", i+1);
      int number2 = (int)(Math.random() * 10);
      System.out.println("number2 : " + number2);
      result = number1 / number2;
      System.out.println("result : " + result);
      System.out.println("---------------------");
    }

    /*
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	  at Ex02.main(Ex02.java:10)
    */
  }
}
