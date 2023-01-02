public class Ex02 {
  public static void main(String[] args){
    Point p1 = new Point();
    p1.x = 10;
    p1.y = 20;
    System.out.println("부모클래스 : " + p1);

    Point3D p3_1 = new Point3D();
    System.out.println("자식클래스 : " + p3_1);
    p3_1.x = 30;
    p3_1.y = 40;
    p3_1.z = 50;
    System.out.println("자식클래스 : " + p3_1);

  }
}

class Point{
  int x, y;
  public String toString(){
    return String.format("%d - %d%n", this.x, this.y);
  }
}
class Point3D extends Point{
  int z;
  public String toString(){
    return String.format("%d - %d - %d%n", this.x, this.y, this.z);
  }
}