public class Ex08_1 {
  public static void main(String[] args){
    Car3 c = new Car3();
    System.out.println("c.color    : " + c.color);
    System.out.println("c.gearType : " + c.gearType);
    System.out.println("c.door     : " + c.door);

    // 생성자를 이용한 객체(멤버변수 값)의 복사
    Car3 c2 = new Car3(c);
    System.out.println("c2.color    : " + c2.color);
    System.out.println("c2.gearType : " + c2.gearType);
    System.out.println("c2.door     : " + c2.door);
  }
}
class Car3{
  String color;
  String gearType;
  int door;
  public Car3(){
    this("navy", "auto", 4);
  }
  public Car3(String color, String gearType, int door){
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }
  public Car3(Car3 c){
    this.color = c.color;
    this.gearType = c.gearType;
    this.door = c.door;
  }

}