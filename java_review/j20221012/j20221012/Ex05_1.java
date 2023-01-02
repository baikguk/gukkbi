public class Ex05_1 {
  public static void main(String[] args){
    Circle2 c = new Circle2();
    System.out.println(c);


  }
}

class Point3{
  int x, y;
  public Point3(){
    this(10, 20);
  }
  public Point3(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString(){

    return String.format("x : %d, y : %d", this.x, this.y);
  }
}
/*
  자식객체를 생성할 때
  부모객체가 먼저 생성되어서 메모리에 올라가고
  같은 주소지에 자식클래스에 정의된 내용들이 같이 올라감
*/
class Circle2 extends Point3{
  // int x, y;
  int radius;
  public Circle2(){
    // 자식클래스의 (모든)생성자의 첫 째줄에서
    // 부모클래스의 생성자를 호출함
    // 명시적으로 code 를 작성하지 않으면
    // 부모클래스의 기본생성자를 자동으로 호출함
    // 자식클래스에서 부모클래스의 생성자를 호출하는 code
    // super();

    // 자식클래스에서 부모클래스의 기본생성자를 호출하는 code 는 생략할 수 있으나
    // 자식클래스에서 부모클래스의 매개변수 있는 생성자를 호출하는 code 는 생략할 수 없음
    //  ㄴ 작성해 주어야 함
    // super(33, 77);

    // 멤버변수 p 와 radius 초기화하기
    this.radius = 30;
  }
  public String toString(){
    return String.format("x : %d, y : %d, 반지름 : %d%n", this.x, this.y, this.radius);
  }
}

