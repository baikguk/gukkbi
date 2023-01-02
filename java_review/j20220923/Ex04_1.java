public class Ex04_1 {
  public static void main(String[] args){

    // Math.random()
    // ㄴ 0부터 1미만의 임의의 실수를 반환함

    System.out.println(Math.random());

    // Math.random() 메소드를 사용해서
    // 1 부터 100 까지의 숫자 중에서 임의의 정수 출력하기
    /*
          0.0   <=   Math.random()   <   1.0
          0.0   <=  Math.random() * 100  < 100.0
          0   <=  (int)(Math.random() * 100)  < 100
      0 + 1   <=  (int)(Math.random() * 100) + 1  < 100 + 1
    */

    System.out.println( (int)(Math.random() * 100) + 1 );
    System.out.println( (int)(Math.random() * 10) + 1 );
    System.out.println( (int)(Math.random() * 5) + 1 );
    System.out.println( (int)(Math.random() * 3) + 1 );
    System.out.println( (int)(Math.random() * 2) + 1 );
  }
}
