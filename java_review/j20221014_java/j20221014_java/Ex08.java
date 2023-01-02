/*
  interface (인테페이스)
    ㄴ 모든 메소드가 public abstract 메소드임
        ㄴ 추상클래스 보다 추상화 정도가 더 높음
    ㄴ 모든 멤버변수가 public final static 변수임
  class 키워드가 아니라
  interface 라는 키워드를 사용해서 정의함

  자바에서는
  조상이 클래스인 경우에는 단일 상속만 허용함
  조상이 인터페이스인 경우에는 다중 상속을 허용함

  interface 는 클래스를 상속받을 수 없음
  interface 는 interface 만 상속받을 수 있음
*/
abstract class Test{
  abstract void test1();
  void test2(){
    System.out.println("test2() 메소드");
  }
}
interface Inter01{
  public static final int SPADE = 4;
  final int DIAMOND = 3;
  static int HEART = 2;
  int CLOVER = 1;

  public abstract void method1();
  abstract void method2();
  public void method3();
  void method4();
}
// interface 가 interface 를 상속받는 경우에는
// extends 키워드를 사용함
interface Inter02 extends Inter01{
  void method5();
}
class Test3 implements Inter02{
  @Override
  public void method5(){
    System.out.println("method5() in Test3");
  }
  @Override
  public void method1(){
    System.out.println("method1() in Test3");
  }@Override
  public void method2(){
    System.out.println("method2() in Test3");
  }@Override
  public void method3(){
    System.out.println("method3() in Test3");
  }@Override
  public void method4(){
    System.out.println("method4() in Test3");
  }
}
// 클래스가 interface 를 상속하는 경우에는
// extends 키워드가 아니라, implements 키워드를 사용함
class Test2 implements Inter01, Inter02{
  @Override
  public void method5(){
    System.out.println("method5() in Test2");
  }
  @Override
  public void method1(){
    System.out.println("method1() in Test2");
  }@Override
  public void method2(){
    System.out.println("method2() in Test2");
  }@Override
  public void method3(){
    System.out.println("method3() in Test2");
  }@Override
  public void method4(){
    System.out.println("method4() in Test2");
  }
}
public class Ex08 {

  final int number1 = 100;

  public void test1(){
    final int number2;
  }

  public static void main(String[ ]args){
    Test2 test2 = new Test2();
    test2.method1();
    test2.method2();
    test2.method3();
    test2.method4();
    test2.method5();

    Test3 test3 = new Test3();
    test3.method5();


  }
}
