class Point2{
  int x, y;
  Point2(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return "(x : " + this.x + ", y : " + this.y + ")";
  }
}
class Circle implements Cloneable{
  Point2 p;
  double radius;

  Circle(Point2 p, double radius){
    this.p = p;
    this.radius = radius;
  }
  public Circle shallowCopy(){
    Object obj = null;
    try {
      obj = super.clone();
    } catch (CloneNotSupportedException e) { }
    // 얕은 복사 - Circle 객체만 복사하고 Point2 객체는 새로 생성하지 않음
    return (Circle)obj;
  }

  public Circle deepCopy(){
    Object obj = null;

    try {
      obj = super.clone();
    } catch (CloneNotSupportedException e) {   }

    Circle c = (Circle)obj;
    // 깊은 복사 - Point2 객체를 생성하면서 이미 생성된 Circle 객체에 있는 x, y 값을 전달함
    c.p = new Point2(this.p.x, this.p.y);

    return c;
  }

  @Override
  public String toString() {
    return "[p : " + this.p + ", radius : " + this.radius + "]";
  }
}

public class Ex04 {
  public static void main(String[] args){
    Circle c1 = new Circle(new Point2(10, 10), 2.0);
    Circle c2 = c1.shallowCopy();
    Circle c3 = c1.deepCopy();

    System.out.println("-- c1 의 반지름 변경 전 --");
    System.out.println("c1.p : " + c1.p);
    System.out.println("c2.p : " + c2.p);
    System.out.println("c3.p : " + c3.p);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    c1.p.x = 3;
    c1.p.y = 3;
    System.out.println("-- c1 의 반지름 변경 후 --");
    System.out.println("얕은 복사 : Circle 만 복사하고 Point2 는 복사하지 않고 같은 것을 사용함");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println("깊은 복사 : Circle 도 복사하고 Point2 도 복사함");
    System.out.println(c3);


  }
}
