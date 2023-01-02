public class Ex06 {

  static int number1;
  int number2;

  public static void staticMethod1(){ }
  public static void staticMethod2(){
    int figure1 = 100;
    // 지역변수로 static 변수를 사용할 수 없음
    // static int figure2 = 200;

    number1 = 10;
    System.out.println(number1);
    // static method 에서는 instance member variable 을 사용 못함
    // number2 = 20;
    staticMethod1();
    // static method 에서는 instance method 를 호출하지 못함
    // instanceMethod1();

    // instance member 들은 객체를 생성한 이후에 사용 가능함
    Ex06 e6 = new Ex06();
    e6.number2 = 456;
    e6.instanceMethod1();
  }
  public void instanceMethod1(){

  }
  public void instanceMethod2(){
    // local variable (지역변수)
    int num = 1000;
    // 지역변수로 static 변수를 사용할 수 없음
    // static int num2 = 2000;

    number1 = 111;
    number2 = 222;
    System.out.println(number1);
    System.out.println(number2);
    staticMethod1();
    instanceMethod1();
  }

  public static void main(String[] args){

  }
}

