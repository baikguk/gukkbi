public class Ex11 {
  public static void main(String[ ]args){

  }
}

class Parent{
  void test1() throws Exception{ }
  void test2() throws ArrayIndexOutOfBoundsException{ }
}
class Child extends Parent{
  @Override
  void test1() throws Exception{ }
  /*
    자식클래스에서 overriding 한 메소드에서
    throws 한 예외는
    부모클래스에서 정의된 메소드에서 throws 한 예외와
    같거나 더 자식클래스 예외이어야 함
  */
  // @Override
  // void test2() throws Exception{ }
}