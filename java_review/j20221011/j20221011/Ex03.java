/*
 constructor : 생성자 - 주로 멤버변수를 초기화하는 역할을 함
 1) 모든 클래스에는 생성자가 있음
    매개변수가 없는 생성자를 기본생성자(default constructor)라 함
    기본생성자는 생략할 수 있음 : compiler가 자동으로 만들어줌
   .java  -->  .class (byte code)
 *****************************************************
  매개변수 있는 생성자를 하나라도 정의하면
  기본 생성자를 compiler가 자동으로 만들어주지 않음
 *****************************************************
 2) 클래스이름하고 동일하므로 대문자로 시작함
 3) return 값이 없음 <-- void 키워드마저 사용하지 않음
 4) instance를 생성한 후 참조변수로 접근해서 사용할 수 없음
    <-- 항상 new 연산자와 같이 호출함 : new A();
       A a = new A();
       a.A(); <-- 이런 식으로 사용 못 함
 5) 메소드의 일종이므로 일반 메소드와 같이 overloading 가능함
 6) 같은 클래스 안에서 this() 형식으로 서로 호출할 수 있음
 7) this() 형식으로 다른 일반 메소드에서 호출할 수 없음
*/
public class Ex03 {
  public static void main(String[] args){
    A a = new A();
    System.out.println(a);

    // 생성자 호출하기
    //  생성자도 메소드의 일종이므로
    //  일반 메소드 호출하는 식으로 호출하면 됨
    //  단, 앞에 new 연산자를 붙여 줌
    A a1 = new A(1234);
    System.out.println(a1);

    A a2 = new A(45.67F);
    System.out.println(a2);

    A a3 = new A(123, 45.67F);
    System.out.println(a3);

    A a4 = new A(1, 2, 3);
    System.out.println(a4);
  }
}

class A{
  int i;
  float f;

  // 기본생성자 : default constructor
  public A(){
    System.out.println("A 클래스의 기본생성자");
  }
  // 생성자 overloading
  public A(int i){
    System.out.println("A 클래스의 매개변수 있는 생성자 - 1");
    this.i = i;
  }
  public A(float f){
    System.out.println("A 클래스의 매개변수 있는 생성자 - 2");
    this.f = f;
  }
  public A(int i, float f){
    System.out.println("A 클래스의 매개변수 있는 생성자 - 3");
    this.i = i;
    this.f = f;
  }
  public A(int num1, int num2, int num3){
    System.out.println("A 클래스의 매개변수 있는 생성자 - 4");
  }
  public String toString(){
    return String.format("i - %d, f - %.2f", this.i, this.f);
  }

}











