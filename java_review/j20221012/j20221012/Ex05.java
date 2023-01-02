public class Ex05 {
  public static void main(String[] args){
    Circle c = new Circle();
    System.out.println(c);

    c.radius = 50;
    System.out.println(c);

    c.p.x = 100;
    c.p.y = 100;
    System.out.println(c);

  }
}

class Point2{
  int x, y;
  public Point2(){
    this(10, 20);
  }
  public Point2(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return String.format("x : %d, y : %d", this.x, this.y);
  }
}
class Circle{
  // 포함관계
  Point2 p;
  int radius;
  public Circle(){
    // 멤버변수 p 와 radius 초기화하기
    this.radius = 30;
    this.p = new Point2();
  }
  public String toString(){
    return String.format("%s, 반지름 : %d%n", this.p, this.radius);
  }
}

