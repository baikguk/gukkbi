/*
  final 키워드
  1) 클래스에 사용하는 경우
     상속을 금지함
       ㄴ final 클래스는 다른 클래스의 자식클래스가 될 수는 있어도
                         다른 클래스의 부모클래스가 될 수는 없음
*/
final class FinalA{ }
// class Child extends FinalA{ }

// 2) 메소드에 사용하는 경우
//    final 메소드는 다른 클래스(자식 클래스)에서
//    Overriding 할 수 없음
class FinalB{
  public final void display(){
    System.out.println("FinalB 클래스의 display() 메소드");
  }
}
class ChildFinalB extends FinalB{
  /*
  @Override
  public void display(){
    System.out.println("ChildFinalB 클래스의 display() 메소드");
  }
  */
}

// 3) 멤버변수에 사용하는 경우
//     ㄴ 멤버변수를 상수로 만드는 키워드
// Object 클래스는 모든 클래스의 최상위 부모클래스이며
// 자바에서 모든 클래스들은 Object 클래스를 상속받고 있음
// 모든 클래스의 선언부 맨 뒤에는 extends Object 가 생략되어 있음
class FinalC extends Object{
  // final 이 아닌 멤버변수는
  // 선언만 하거나
  // 선언과 초기화를 같이 하는 것 모두 가능함
  int num1;
  int num2 = 2;

  // final 멤버변수는 선언하면서 초기화해야 함
  final int num3 = 33;

  // final  멤버변수를 선언만 하고
  // 초기화는 생성자에서 해도 됨
  final int num4;
  FinalC(int num4){
    this.num4 = num4;
  }

  @Override
  public String toString(){
    return String.format("num1 : %d, num2 : %d, num3 : %d, num4 : %d%n",
                         this.num1, this.num2, this.num3, this.num4 );
  }
}
public class Ex06 {
  public static void main(String[] args){

    FinalC fc = new FinalC(10);
    System.out.println(fc);
  }
}


class A{
  @Override
  public String toString() {
    return super.toString();
  }
}






