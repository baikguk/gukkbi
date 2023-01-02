public class Ex07 {
  public static void main(String[] args){
    /*
      B 클래스의 기본 생성자를 통해서
      객체를 생성할 때
      각 생성자에 있는 println()의
      출력순서는?
    */
    System.out.println("프로그램 시작");
    new B();
    System.out.println("프로그램 종료");
  }
}
class B{
  // 같은 클래스의 생성자에서
  // 다른 생성자를 호출하는 code 는
  // 생성자의 맨 윗 줄에서만 작성할 수 있음
  public B(){
    this(123);
    System.out.println("B() - 1");
  }
  public B(int i){
    this(13.45F);
    System.out.println("B(int i) - 2");
  }
  public B(float f){
    this(6.25);
    System.out.println("B(float f) - 3");
  }
  public B(double d){
    System.out.println("B(double d) - 4");
  }
  // 일반 메소드에서는 this() 를 사용해서
  // 같은 클래스의 생성자를 호출할 수 없음
  // 생성자에서는 일반 메소드를 호출할 수 있음
  /*
  public void method1(){
    this.();
  }
  */

}
