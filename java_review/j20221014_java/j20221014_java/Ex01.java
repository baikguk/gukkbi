public class Ex01 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");
    new ChildA(6.25F);
    System.out.println("프로그램 종료");
  }
}
class ParentA{
  public ParentA(){
    this(10);
    System.out.println("ParentA()-1");
  }
  public ParentA(int i){
    this(3.14F);
    System.out.println("ParentA(int i)-2");
  }
  public ParentA(float f){
    System.out.println("ParentA(float f)-3");
  }
}
class ChildA extends ParentA{
  // 자식클래스의 모든 생성자의 첫 번째 줄에는
  // 부모클래스의 기본생성자를 호출하는 code 가
  // 생략되어 있음
  public ChildA(){
    // super();
    System.out.println("ChildA()-4");
  }
  public ChildA(int i){
    this();
    System.out.println("ChildA(int i)-5");
  }
  public ChildA(float f){
    this(30);
    System.out.println("ChildA(float f)-6");
  }
}