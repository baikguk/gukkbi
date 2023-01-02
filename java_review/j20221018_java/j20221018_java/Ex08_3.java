public class Ex08_3 {
  // Runtime Error 발생함
  public static void main(String[] args) throws Exception {
    System.out.println("main() 시작 - 프로그램 시작");
    method1();
    System.out.println("main() 종료 - 프로그램 종료");
  }
  static void method1() throws Exception {
    System.out.println("method1() 시작");
    method2();
    System.out.println("method1() 종료");
  }
  static void method2() throws Exception {
    System.out.println("method2() 시작");
    // 예외가 발생됨 : 예외가 발생된 곳에서 처리하지 않고
    // 이 메소드를 호출한 곳으로 예외처리를 떠넘길 수 있음
    throw new Exception("Exception 발생 !!!");
    // Unreachable statement
    // System.out.println("method2() 종료");
  }
}
