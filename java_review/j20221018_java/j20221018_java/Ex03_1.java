public class Ex03_1 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");
    System.out.println(1);
    System.out.println(2);
    try{
      System.out.println(3);
      // 예외가 발생하면 그 이후 code 가 실행되지 않고
      // 바로 catch 블럭으로 넘어감 :
      // 4 는 출력되지 않고
      // catch 블럭으로 넘어가서 5가 출력되고
      // try-catch 블럭이 실행완료되면
      // 그 아래에 있는 6 이 출력됨
      System.out.println(100/0);
      System.out.println(4);
    }catch(Exception e){
      // 발생한 예외는 ArithmeticException 이나
      // Exception 의 최고 조상클래스인 Exception type 의 변수를
      // catch 블럭에 선언하면 이 catch 블럭에서
      // ArithmeticException 객체를 받아서 실행됨

      // 예외가 발생하면 catch 블럭이 실행됨
      System.out.println(5);
    }
    System.out.println(6);
    System.out.println("프로그램 종료");
  }
}
