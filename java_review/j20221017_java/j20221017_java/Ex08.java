/*
  내부 클래스 : inner class
    ㄴ 클래스 안에서 클래스를 정의하는 것
  마치, 변수 선언과 비슷하게 생각하면 됨

  변수 : 멤버변수 : instance 멤버변수,
                    static 멤버변수
         지역변수 : local variable

  내부 클래스 : instance 내부 클래스
                static 내부 클래스
                local 내부 클래스

*/

class Outer{
  class InstanceInner{
    int iv = 100;
    // instance inner class 안에
    // static 멤버변수를 선언할 수 없음
    // static int cv = 100;
    // final static 멤버변수는 선언할 수 있음
    final static int CONST = 100;
  } // instance inner class
  static class StaticInner{
    int iv = 200;
    // static inner 클래스에서만
    // static 멤버변수를 선언할 수 있음
    static int cv = 200;
    final static int CONST = 200;
  } // static inner class

  // inner class type 의 멤버변수 선언
  InstanceInner iv = new InstanceInner();
  static StaticInner cv =  new StaticInner();

  // instance method
  void method1(){
    class LocalInner{
      int iv = 300;
      // 지역 내부 클래스에서는
      // static 멤버변수를 선언할 수 없음
      // static int cv = 300;
      // final static 멤버변수는 선언할 수 있음
      final static int CONST = 300;
    } // local inner class

    LocalInner lc = new LocalInner();


  }
  // static method
  static void staticMethod1(){
    StaticInner statciObj = new StaticInner();

    // static method 에서는 instance 내부 클래스를 사용할 수 없음
    // 단, 객체를 생성하고나서 사용할 수 있음
    // InstanceInner instanceObj = new InstanceInner();
    Outer outer = new Outer();
    InstanceInner instanceObj = outer.new InstanceInner();
  }
  // instance method
  void instanceMethod(){
    StaticInner staticObj = new StaticInner();
    InstanceInner instanceObj = new InstanceInner();
    // 다른 메소드 내에 선언된 내부 클래스에는
    // 접근할 수 없음
    // LocalClass lc = new LocalClass();
  }


}

public class Ex08 {
  public static void main(String[] args){
    System.out.println(Outer.InstanceInner.CONST);
    System.out.println(Outer.StaticInner.cv);
    System.out.println(Outer.StaticInner.CONST);
  }
}
