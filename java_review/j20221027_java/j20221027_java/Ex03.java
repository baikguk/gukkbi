enum Transportation{

  BUS(100){int fare(int distance){ return distance * BASIC_FARE; }},
  TRAIN(150){int fare(int distance){ return distance * BASIC_FARE; }},
  SHIP(200){int fare(int distance){ return distance * BASIC_FARE; }},
  AIRPLANE(300){int fare(int distance){ return distance * BASIC_FARE; }};

  protected final int BASIC_FARE;
  Transportation(int basicFare){
    BASIC_FARE = basicFare;
  }

  // getter : BASIC_FARE
  public int getBASIC_FARE(){
    return BASIC_FARE;
  }

  // 추상 메소드 -  여기서는 접근제한자를 default 로 함
  // 거리를 파라미터로 받아서 운임을 반환함
  abstract int fare(int distance);

} // enum Transportation

public class Ex03 {
  public static void main(String[] args){
    System.out.println("버스 요금   : " + Transportation.BUS.fare(100) + " 원");
    System.out.println("기차 요금   : " + Transportation.TRAIN.fare(100) + " 원");
    System.out.println("배 요금     : " + Transportation.SHIP.fare(100) + " 원");
    System.out.println("비행기 요금 : " + Transportation.AIRPLANE.fare(100) + " 원");
  }
}
