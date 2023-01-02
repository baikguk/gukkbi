public class Ex03 {
  public static void main(String[ ]args){

    //  기본형 타입으로 만들어지는 배열 : int type
    // index 공간에 실제 literal data 가 저장됨
    int[] numbers = new int[3];

    for(int i = 0; i < numbers.length; i++){
      System.out.printf("numbers[%d] : %d%n", i, numbers[i]);
    }
    System.out.println("-----------------------");

    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;

    for(int i = 0; i < numbers.length; i++){
      System.out.printf("numbers[%d] : %d%n", i, numbers[i]);
    }
    System.out.println("-----------------------");

    // 참조형 타입으로 만들어지는 배열 : Time2 type
    // index 공간에 지정한 클래스의 객체의 주소가 저장됨
    int[] numbers2 = new int[3];
    numbers2[0] = 11;
    numbers2[1] = 22;
    numbers2[2] = 33;

    Time2[] time = new Time2[3];
    time[0] = new Time2();
    time[1] = new Time2();
    time[2] = new Time2();

    System.out.println("time[0].hour   : " + time[0].hour);
    System.out.println("time[0].minute : " + time[0].minute);
    System.out.println("time[0].second : " + time[0].second);
    System.out.println(time[0]);
    System.out.println("-----------------------");

    System.out.println("time[1].hour   : " + time[1].hour);
    System.out.println("time[1].minute : " + time[1].minute);
    System.out.println("time[1].second : " + time[1].second);
    System.out.println(time[1]);
    System.out.println("-----------------------");

    System.out.println("time[2].hour   : " + time[2].hour);
    System.out.println("time[2].minute : " + time[2].minute);
    System.out.println("time[2].second : " + time[2].second);
    System.out.println(time[2]);
    System.out.println("-----------------------");

    time[0].hour = 10;
    time[0].minute = 20;
    time[0].second = 30;
    System.out.println("time[0] : " + time[0]);
    System.out.println("time[1] : " + time[1]);
    System.out.println("time[2] : " + time[2]);

  }
}
class Time2{
  int hour;
  int minute;
  int second;

  public String toString(){
    return String.format("%d 시 %d 분 %d 초", this.hour, this.minute, this.second);
  }
}

