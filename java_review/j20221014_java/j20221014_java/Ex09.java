class A{
  public void methodA1(B b){
    System.out.println("A 클래스의 methodA1(B b) 에서 B 클래스의 methodB() 를 호출함");
    b.methodB();
  }
  public void methodA2(C c){
    System.out.println("A 클래스의 methodA2(C c) 에서 C 클래스의 methodC() 를 호출함");
    c.methodC();
  }
}
class B{
  public void methodB(){
    System.out.println("methodB() in class B");
  }
}
class C{
  public void methodC(){
    System.out.println("methodC() in class C");
  }
}
public class Ex09 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");

    A a = new A();
    B b = new B();
    C c = new C();
    a.methodA1(b);
    System.out.println("-------------------------------------");

    a.methodA2(c);

    System.out.println("프로그램 종료");
  }
}
