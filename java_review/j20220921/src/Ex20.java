public class Ex20 {
  public static void main(String[] args){

    /*
      비트 연산자 : &, |, ^(배타적 논리합), ~

      비트 AND 연산자 : &
       bit1  & bit2 : bit1 과 bit2 가 모두 1 일 때만 1을 반환함
                      하나라도 0 이면 0을 반환함

      비트 OR 연산자 : |
       bit1 | bit2 : bit1 과 bit2 가 모두 0 일 때만 0을 반환함
                      하나라도 1 이면 1을 반환함

      비트 (배타적 논리합) 연산자 : ^
       bit1 ^ bit2 : bit1 과 bit2 가 서로 다를 때만 1을 반환함
                      서로 같으면 0을 반환함

      비트 ~ 연산자 : 비트를 반대로 바꿔줌 : 0 -> 1 / 1 -> 0

    */

    int n1 = 10;  // 1 0 1 0
    int n2 = 5;   // 0 1 0 1
    int result = 0;

    // 비트 AND 연산자 : &
    result = n1 & n2;
    System.out.println("result : " + result);

    // 비트 OR 연산자 : |
    result = n1 | n2;
    System.out.println("result : " + result);

    // 비트 ^ 연산자 : ^
    result = n1 ^ n2;
    System.out.println("result : " + result);

    n1 = 10;  // 1 0 1 0  ->  0 1 0 1
    n2 = 5;   // 0 1 0 1      0 1 0 1
    // 비트 ~ 연산자 : ~
    result = ~n1 & n2;
    System.out.println("result : " + result);

  }
}
