public class Ex06 {

  // Call by Value
  // 메소드를 호출할 때 값을 전달(복사)하면서 호출함
  // method1() 의 parameter(지역변수 number) 의 값을 변경해도
  // main() 의 지역변수(number)에는 영향을 미치지 않음

  public static void method1(int number){
    number = 555;
    System.out.println("number in method1(int number) : " + number);
  }
  public static void main(String[] args){
    int number = 10;

    System.out.println("--- method1(int number) 호출 전 ---");
    System.out.println("number in main() : " + number);

    method1(number);
    System.out.println("--- method1(int number) 호출 후 ---");
    System.out.println("number in main() : " + number);
  }
}
