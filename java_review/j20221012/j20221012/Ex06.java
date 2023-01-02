public class Ex06 {
  public static void main(String[] args){
    Circle3 c1 = new Circle3();
    System.out.println(c1);

    // Circle3 의 매개변수 있는
    // 생성자를 호출해서 객체 생성하기
    // Circle3(Point4 center, int radius)
    Circle3 c2 = new Circle3(new Point4(10, 10), 20);
    System.out.println(c2);

    // 원의 색상 변경하기
    // Circle3(Point4 center, int radius, String color)
    Circle3 c3 = new Circle3(new Point4(30, 30), 50, "lightgreen");
    System.out.println(c3);

    // 삼각형의 색상 변경하기 : skyblue -> navy
    // 원의 색상 변경하기 를 참고해서 code 를 작성하세요



    System.out.println("---- Triangle ----");
    // Triangle 클래스의 기본생성자를 사용해서
    // 객체 생성하기
    Triangle t1 = new Triangle();
    System.out.println(t1);

    // Triangle(Point4[] p) 생성자를 사용해서
    // 객체 생성하기
    Triangle t2 = new Triangle(new Point4[]{new Point4(100, 112),
                                            new Point4(46, 68),
                                            new Point4(200, 198),});
    System.out.println(t2);

    // Triangle(Point4 p1, Point4 p2, Point4 p3) 생성자를 사용해서
    // 객체 생성하기
    Triangle t3 = new Triangle(new Point4(11, 22),
                               new Point4(34, 17),
                               new Point4(87, 113));
    System.out.println(t3);

    // 삼각형의 색상 변경하기 : skyblue -> navy
    // Triangle(Point4[] p, String color)
    Point4 p1 = new Point4(25, 37);
    Point4 p2 = new Point4(42, 89);
    Point4 p3 = new Point4(112, 156);
    Point4[] p = new Point4[]{p1, p2, p3};
    Triangle t4 = new Triangle(p, "navy");
    System.out.println(t4);

    Triangle t5 = new Triangle("cyan");
    System.out.println(t5);
  }
}
class Point4{
  int x, y;
  Point4(){
    this(0, 0);
  }
  Point4(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return String.format("x : %d, y : %d", this.x, this.y);
  }
}
class Shape{
  String color = "skyblue";
  void draw(){
    System.out.println("도형을 그린다");
  }
}
class Circle3 extends Shape{
  Point4 center;
  int radius;
  Circle3(){
    this(new Point4(), 30);
  }
  Circle3(Point4 center, int radius){
    this.center = center;
    this.radius = radius;
  }
  Circle3(Point4 center, int radius, String color){
    this.center = center;
    this.radius = radius;
    this.color = color;
  }
  public String toString(){
    return String.format("중점 : %s, 반지름 : %d, 색상 : %s", this.center, this.radius, this.color);
  }
}
class Triangle extends Shape{
  Point4[] p;
  Triangle() {
    this.p = new Point4[]{new Point4(10, 10),
                          new Point4(20, 20),
                          new Point4(30, 30),};
  }
  Triangle(Point4[] p){
    this(p, "navy");
  }
  Triangle(Point4 p1, Point4 p2, Point4 p3){
    this.p = new Point4[]{p1, p2, p3};
  }
  Triangle(Point4[] p, String color){
    this.p = p;
    this.color = color;
  }
  Triangle(String color){
    Point4 p1 = new Point4(20, 20);
    Point4 p2 = new Point4(30, 30);
    Point4 p3 = new Point4(50, 50);
    this.p = new Point4[]{p1, p2, p3};
    this.color = color;
  }
  public String toString(){
    return String.format("%s - %s - %s - %s%n", this.p[0], this.p[1], this.p[2], this.color);
  }

}