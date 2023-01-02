/*
  변수의 생명 주기 (variable life cycle)
  변수가 선언(생성)된 scope 에서 loading 됨
  자신이 선언된 scope 가 메모리에서 삭제되면
  이 변수도 자동으로 메모리에서 삭제됨(해제됨)

  1) 멤버변수 : 클래스의 instance(object) 가 메모리에 올라가 있는 동안
                자동 초기화를 지원함 : 각 type 의 기본값으로 자동 초기화됨
                객체와 연결된 참조변수의 연결을 끊으면
                Garbage Collector 가 이 객체를 메모리에서 삭제하려고
                스케쥴링에 들어감

  2) 지역변수1 : 메소드 내부에 선언된 변수
                 메소드가 실행될 때 메모리에 올라가고
                 메소드가 종료하면 메모리에서 자동으로 삭제됨
  3) 지역변수2 : 메소드 내부의 또다른 code block 안에서 선언된 변수
                                ㄴ if, switch, for, while...
                 해당 code block 이 생성되면 메모리에 올라가고
                 이 code block 이 메모리에서 삭제되면 자동으로 삭제됨
*/

public class Ex03 {
  // class scope
  int score;
  int stdNumber;
  int grade;

  public static void main(String[] args){

    String str1 = new String("java");

    Ex03 ex = new Ex03();
    ex = null;

    // main scope
    // number1 - local variable type 1
    int number1;
    number1 = 10;

    if(number1 == 10){
      // if scope
      // number2 - local variable type 2
      int number2 = 20;
    }

  }
}
