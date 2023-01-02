class Outer2{
  private int outerIv = 0;
  static int  outerCv = 0;

  // instance 내부 클래스에서는
  // 외부 클래스의 instance 멤버변수, static 멤버변수
  // 모두 접근이 가능함
  class InstanceInner2{
    int iiv = outerIv;
    int iiv2 = outerCv;
  }
  // static 내부 클래스에서는
  // 외부 클래스의 instance 멤버변수에 접근하지 못함
  static class StaticInner2{
    // int siv = outerIv;
    static int scv = outerCv;
  }
  void myMethod(){
    // lv 는 지역변수
    int lv = 0;
    // JDK 1.8 부터는 final 을 생략할 수 있음
    // LV 는 지역상수
    final int LV = 0;

    // local 내부 클래스에서는
    // 지역상수에만 접근이 가능했으나
    // JDK 1.8 부터는 지역변수에도 접근이 가능함
    class LocalInner{
      int liv = outerIv;
      int liv2 = outerCv;
      int liv3 = lv;
      int liv4 = LV;
    }

  }
}

public class Ex09 {

}
