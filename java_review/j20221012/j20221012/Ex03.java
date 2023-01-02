public class Ex03 {
  public static void main(String[] args){
    Sonata s1 = new Sonata();
    System.out.println("s1 : " + s1);

    s1.gearType = "manual";
    s1.v1 = new Vehicle();
    s1.v1.wheel = 4;

    System.out.println("----------------------------");

    Car c1 = new Car();
    System.out.println("c1 : " + c1);

  }
}
class Car{
  String color = "white";
  int door = 4;
  int displacement = 4000;
  public String toString(){
    return String.format("%s - %d - %d%n", this.color, this.door, this.displacement);
  }
}
class Vehicle{
  int wheel;
}

// 자바에서는 단일상속만 가능함
// 상속받은 클래스 이외에
// 다른 클래스의 멤버변수도 사용하고자
// 하는 경우에는 멤버변수로 선언하면 됨
class Sonata extends Car{
  Vehicle v1;
  String gearType = "auto";
  public String toString(){
    return String.format("%s - %d - %d - %s%n", this.color, this.door, this.displacement, this.gearType);
  }
}