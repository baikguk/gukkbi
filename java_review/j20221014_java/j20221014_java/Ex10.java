/*
default 메소드
  interface 안에서 작성하며 body 부분까지 작성함
  접근제한자가 public 이므로 이를 overriding 한 메소드의
  접근제한자도 public 이 되어야 함

static 메소드
  기본적으로 일반 클래스에서 작성한 static 메소드와 동일함
  (interface 를 상속받은 일반클래스의 객체를 생성해서 호출하지 않고)
    ㄴ interface 이름으로 접근해서 호출함
*/

class ParentClass{
  public void method1(){
    System.out.println("method1() in Parent");
  }
}
interface ParentInterface1{
  // interface 에서
  // 추상메소드 이외에
  // default 메소드와 static 메소드를
  // 작성할 수 있음
  public default void method1(){
    System.out.println("default void method1() in ParentInterface1");
  }
  default void method2(){
    System.out.println("default void method2() in ParentInterface1");
  }
  static void staticMethod(){
    System.out.println("staticMethod() in ParentInterface1");
  }
}
interface ParentInterface2{
  default void method1(){
    System.out.println("default void method1() in ParentInterface2");
  }
  static void staticMethod(){
    System.out.println("staticMethod() in ParentInterface2");
  }
}

class Child extends ParentClass implements ParentInterface1, ParentInterface2{
  // 부모클래스와 부모인페이스에 같은 메소드가 있는 경우,
  // 부모클래스에 있는 메소드를 상속받음
  @Override
  public void method1(){
    System.out.println("method1() overriding in Child (Parent 클래스의 method1()을 상속받음)");
  }
}

public class Ex10 {
  public static void main(String[] args){
    Child ch = new Child();
    ch.method1();
    // method2() 는 Child 에서 overriding 하지 않았으므로
    // 조상인 ParentInterface1 에서 정의된 내용이 실행됨
    ch.method2();
    ParentInterface1.staticMethod();
    ParentInterface2.staticMethod();

  }
}


