public class Ex02 {
  public static void main(String[] args){
    int hour = 10;
    int minute = 12;
    int second = 38;

    Time t1 = new Time();
    System.out.println("-- t1 주소지 --");
    System.out.println(t1.hour + "시 " + t1.minute + "분 " + t1.second + "초");
    System.out.println(t1.toString());
    // 참조변수를 출려하면 자동으로 toString() 메소드를 호출함
    System.out.println(t1);
    System.out.println("--------------------------------------");

    Time t2 = new Time();
    System.out.println("-- t2 주소지 --");
    System.out.println(t2.hour + "시 " + t2.minute + "분 " + t2.second + "초");
    System.out.println(t2.toString());
    System.out.println(t2);

    t2.hour = 3;
    t2.minute = 40;
    t2.second = 1;
    System.out.println("-- t2 주소지 --");
    System.out.println(t2.hour + "시 " + t2.minute + "분 " + t2.second + "초");
    System.out.println(t2.toString());
    System.out.println(t2);
    System.out.println("--------------------------------------");

    // 배열을 사용해서 시간을 표현하기
    int[] hours = new int[]{12, 5, 9};
    int[] minutes = new int[]{34, 21, 9};
    int[] seconds = new int[]{3, 6, 8};

    for(int i = 0; i < hours.length; i++){
      System.out.printf("%d시 %d분 %d초%n", hours[i], minutes[i], seconds[i]);
    }
    System.out.println("--------------------------------------");

    // 클래스(객체)를 사용해서 시간을 표현하기
    Time t3 = new Time();
    Time t4 = new Time();
    Time t5 = new Time();

    System.out.println(t3.toString());
    System.out.println(t4.toString());
    System.out.println(t5.toString());

  }
}

class Time{
  int hour = 10;
  int minute = 12;
  int second = 38;

  // 생성자 : 클래스이름하고 같은 이름의 메소드
  // constructor <- 클래스의 객체를 생성함
  //                new + 생성자 : 객체를 생성함
  // 주로 클래스의 멤버변수를 초기화하는 역할
  // 1) 모든 생성자는 값을 return 하지 않음  :
  //    return type 을 사용하지 않음
  //   void 라는 return type 도 사용하지 않음
  // 2) 이름이 클래스이름과 똑같음
  // 3) 객체를 생성할 때 new 연산자와 같이 호출함
  //     ㄴ 참조변수.생성자이름 <-- 이런 방식으로 호출할 수 없음
  // 4) 기본생성자 : default constructor
  //   ㄴ 매개변수(parameter)가 없는 생성자
  //   ㄴ 작성하지 않아도 자동으로 동작함

  // toString() : 멤버변수의 상태를 문자열로 반환함  
  // this : 현재 생성된 객체의 주소를 저장하고 있는 참조변수
  // ㄴ 모든 메소드(instance method) 에 있음
  // 같은 클래스의 정보로부터 생성된 객체들을 구분하는 용도로 사용함
  public String toString(){
    // return this.hour + "시 " + this.minute + "분 " + this.second + "초";
    // format specifier 를 사용하는 방법 : String.format() 메소드를 호출함
    return String.format("%d 시 %d 분 %d 초", this.hour, this.minute, this.second);
  }
}

