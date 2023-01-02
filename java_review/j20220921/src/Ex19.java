public class Ex19 {
  public static void main(String[] args){
    /*
      논리연산자
      논리 AND 연산자  :  &&
      논리 OR 연산자   :  ||
      논리 부정 연산자 :  !


      논리 AND 연산자  :  &&
      A && B - 모두 true 일 때만 true 를 반환함
               하나라도 false 이면 false 를 반환함

      논리 OR 연산자  :  ||
      A || B - 모두 false 일 때만 false 를 반환함
               하나라도 true 이면 true 를 반환함
    */

    System.out.printf("true  && true  : %b%n", true && true);
    System.out.printf("true  && false : %b%n", true && false);
    System.out.printf("false && true  : %b%n", false && true);
    System.out.printf("false && false : %b%n", false && false);

    System.out.println("-----------------------------------");

    System.out.printf("true  || true  : %b%n", true || true);
    System.out.printf("true  || false : %b%n", true || false);
    System.out.printf("false || true  : %b%n", false || true);
    System.out.printf("false || false : %b%n", false || false);

    System.out.println("-----------------------------------");

    System.out.println(true && true && true && true && true);
    System.out.println(false && true && true && true && true);
    System.out.println(true && false && true && false && true);
    System.out.println(false && false && false && false && false);

    System.out.println("-----------------------------------");

    System.out.println(true || true|| true|| true|| true);
    System.out.println(false || true|| true|| true|| true);
    System.out.println(true || false|| true|| true|| true);
    System.out.println(false || false || false || false || false);


  }
}
