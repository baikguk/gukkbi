public class Ex14 {
  public static void main(String[] args){

    int num1 = 10;
    int num2 = 8;

    int result = num1 + num2;
    System.out.printf("result : %d%n", result);

    result = num1 - num2;
    System.out.printf("result : %d%n", result);

    result = num1 * num2;
    System.out.printf("result : %d%n", result);

    // 몫
    result = num1 / num2;
    System.out.printf("result : %d%n", result);

    // 나머지
    result = num1 % num2;
    System.out.printf("result : %d%n", result);
    System.out.println("---------------------");

    // 나머지 연산 결괏값의 부호는 나누어지는 수의 부호로 됨
    System.out.println(10 % 8);
    System.out.println(-10 % 8);
    System.out.println(10 % -8);
    System.out.println(-10 % -8);


  }
}
