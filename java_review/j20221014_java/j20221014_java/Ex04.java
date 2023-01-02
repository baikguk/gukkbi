/*

  추상 클래스
  추상 메소드가 하나 이상 있는 클래스
    추상 메소드 : 메소드의 선언부만 있고 { }(몸통(body)부분이 없는 메소드
                  선언부 : 접근제한자, return type, method 이름, 매개변수부
                  몸통(body) : 메소드의 구현 내용이 실제로 기술된 부분

  "Override 를 강제하기 위한 수단"
  <-- 자식클래스에서 기본적으로 어떤 선언부를 갖고 있는
      메소드를 작성해야 하는지를 안내해 주는 역할을 함

  추상클래스는 자기자신 타입의 instance 를 생성하지 못함
  <-- 추상메소드가 있기 때문
  <-- 추상클래스 타입의 참조변수가 저장할 수 있는 instance 의 주소?
      <-- 어떤 instance 의 주소를 저장할 수 있는가?
           <-- 자손클래스 타입의 instance 의 주소를 저장함
*/
public class Ex04 {
  public static void main(String[] args){
    ParentB pb = new ChildB1();
    pb.method1();
    System.out.println(pb.add(10, 20));

    pb = new ChildB1();
    pb.method1();
    System.out.println(pb.add(10, 20));

    pb = new ChildB2();
    pb.method1();
    System.out.println(pb.add(100, 200));

    System.out.println("--------------------------");

    ParentB[] p = new ParentB[3];
    p[0] = new ChildB1();
    p[1] = new ChildB2();
    p[2] = new ChildB1();

    for(int i = 0; i < p.length; i++){
      p[i].method1();
    }

    System.out.println("--------------------------");

    for(int i = 0; i < p.length; i++){
      System.out.println(p[i].add(11, 22));
    }

  }
}
abstract class ParentB{
  int number = 10;
  float f;
  public void display(){
    System.out.println("display() in ParentB");
  }
  public abstract void method1();
  public abstract int add(int num1, int num2);
}
class ChildB1 extends ParentB{
  @Override
  public void method1(){
    System.out.println("method1() in ChildB1");
  }
  @Override
  public int add(int num1, int num2){
    System.out.println("add(int num1, int num2) in ChildB1");
    return num1 + num2;
  }
}
class ChildB2 extends ParentB{
  @Override
  public void method1(){
    System.out.println("method1() in ChildB2");
  }
  @Override
  public int add(int num1, int num2){
    System.out.println("add(int num1, int num2) in ChildB2");
    return num1 + num2 + 1000;
  }
}







