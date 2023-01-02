/*
  this()  :  같은 클래스 안에서
             생성자가 다른 생성자를 호출하는 code
             parameter 를 선언할 수도 있고 안 할 수도 있음에 따라서
             argument 를 넣어 줄 수도 있고 넣지 않을 수도 있음
*/

public class Ex06 {
  public static void main(String[ ]args){
    Car2 c = new Car2();
    System.out.println(c);

    Car2 c2 = new Car2("yellow", "auto", 2);
    System.out.println(c2);

  }
}
class Car2{
  String color;
  String gearType;
  int door;
  public Car2(){
    this("white", "manual", 4);
  }
  public Car2(String color, String gearType, int door){
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }
  public String toString(){
    return String.format("%s - %s - %d%n", this.color, this.gearType, this.door);
  }

}











