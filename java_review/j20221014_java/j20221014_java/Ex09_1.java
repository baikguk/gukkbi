class A2{
  public void methodA2(I i){
    i.method();
  }
}
// interface 활용하기
interface I{
  public abstract void method();
}
class B2 implements I {
  @Override
  public void method(){
    System.out.println("method() overriding in B2");
  }
}
class C2 implements I{
  @Override
  public void method(){
    System.out.println("method() overriding in C2");
  }
}
class D2 implements I{
  @Override
  public void method(){
    System.out.println("method() overriding in D2");
  }
}
class E2 implements I{
  @Override
  public void method(){
    System.out.println("method() overriding in E2");
  }
}
class F2 implements I{
  @Override
  public void method(){
    System.out.println("method() overriding in F2");
  }
}

public class Ex09_1 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");

    A2 a2 = new A2();

    B2 b2 = new B2();
    C2 c2 = new C2();
    a2.methodA2(b2);
    a2.methodA2(c2);
    a2.methodA2(new D2());
    a2.methodA2(new E2());
    a2.methodA2(new F2());

    System.out.println("프로그램 종료");
  }
}
