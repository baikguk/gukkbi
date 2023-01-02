/*
  Call Stack Memory
    메소드가 실행되는 공간
      (메소드 scope 에서 선언된)정적 변수들이 저장되는 공간
        ㄴ 지역변수 (local variable)
   1) 지역변수가 저장됨
   2) 메소드가 실행될 때 사용하는 공간
   3) 지역변수의 자동초기화를 지원하지 않음
       ㄴ 지역변수는 사용하기 전에 반드시 명시적으로 초기화해야 함
   4) 메소드가 종료되면 메소드의 실행을 위해서
      Call Stack Memory 내에서 확보되었던 공간이 삭제됨
       ㄴ 이때, 이 메소드의 scope 에서 선언된 지역변수들도 삭제됨
   5) 메소드의 매개변수(parameter)도 메소드의 지역변수(local variable)임
       ㄴ 역할상으로는 parameter 이고, 위치상로는 local variable 이 됨
*/
public class Ex04 {
  // class scope
  static int number5;

  public static void main(String[] args){
    // main method scope
    int number1 = 200;
    System.out.printf("number : %d%n1", number1);

    System.out.printf("number5 : %d%n1", number5);
  }
  public static int add(int number3){
    // add method scope
    int number2 = 20;
    return number3 + number2;
  }

}
