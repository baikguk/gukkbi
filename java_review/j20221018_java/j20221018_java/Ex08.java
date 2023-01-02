public class Ex08 {
  public static void main(String[] args){
    System.out.println("main() 시작 - 프로그램 시작");
    method1();
    System.out.println("main() 종료 - 프로그램 종료");
  }
  static void method1(){
    System.out.println("method1() 시작");
    method2();
    System.out.println("method1() 종료");
  }
  static void method2(){
    System.out.println("method2() 시작");
    try {
      // 예외가 발생됨
      throw new Exception("Exception 발생 !!!");
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
    System.out.println("method2() 종료");
  }
}
