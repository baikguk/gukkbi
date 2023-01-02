public class Ex09_1 {
  public static void main(String[] args){
    Number1 n1 = new Number1();
    n1.num1 = 100;
    n1.num2 = 200;

    ChildNumber cn1 = new ChildNumber();
    cn1.num3 = 30;
    cn1.num1 = 120;
    cn1.num2 = 130;

    // ChildNumber cn2 = new Number1();
    // Number1 - 부모
    // ChildNumber - 자식
    // 부모타입의 참조변수는 자식객체의 주소를 할당받을 수 있음
    Number1 n2 = new Number1();
    n2 = new ChildNumber();

    // 자식 타입의 참조변수는 부모객체의 주소를 할당받을 수 없음
    // ChildNumber cn2 = new Number1();

  }
}

// 참조변수가 할당받는 객체의 주소지에 접근했을 때,
// 참조변수의 type(클래스) 에서 작성한 멤버들이 다 있어야 함
// 해당 클래스에서 작성한 멤버변수와 (개수가)
// 똑같이 있거나 더 많은 경우는 괜찮으나
// 없거나 모자르면 오류가 발생함

class Number1{
  int num1;
  int num2;
}
class ChildNumber extends Number1{
  int num3;
}
