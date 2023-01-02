public class Ex05 {
  public static void main(String[] args){
    Car c1 = new Car();
    System.out.println(c1);
    Car c2 = new Car("blue", "auto", 3);
    System.out.println(c2);
    Car c2_1 = new Car("white", "auto", 2);
    System.out.println(c2_1);

    // 매개변수의 type, 개수, 순서를 맞추어 주어야 해당 생성자가 호출됨
    Car c3 = new Car("red",  4, "manual");
    System.out.println(c3);
  }
}

class Car{
  String color;
  String gearType;
  int door;
  // 기본 생성자에서 멤버변수를 초기화하는 code 를
  // 작성하지 않으면, 객체를 생성한 후 초기화해서 사용함
  public Car(){ }
  // 매개변수 있는 생성자를 사용해서
  // 객체를 생성하면 객체를 생성할 때
  // 멤버변수를 초기화해서 사용함

  /*
    parameter 에 선언된 매개변수 이름과 멤버변수 이름이
    다르기 때문에 구분이 됨 - this 를 사용해도 되고 안 해도 됨
  */
  public Car(String c, String g, int d){
    this.color = c;
    this.gearType = g;
    this.door = d;
  }
  /* 일반적으로는 아래와 같이 하면서 this를 사용함
    parameter 에 선언된 매개변수 이름과 멤버변수 이름이
    같은 경우, 멤버변수 앞에 this 를 사용해서
    구분해 주는 것이 바람직함
  */
  public Car(String color, int door, String gearType){
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }
  public String toString(){
    return String.format("%s - %s - %d%n", this.color, this.gearType, this.door);
  }

}







