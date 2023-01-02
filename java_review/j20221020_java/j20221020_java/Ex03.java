class Point implements Cloneable{
  int x, y;
  Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return "x : " + this.x + ", y : " + this.y;
  }
  @Override
  public Object clone(){
    Object obj = null;
    // Ctrl + Alt + T
    try {
      obj = super.clone();
    } catch (CloneNotSupportedException e) { }
    return obj;
  }
}

public class Ex03 {
  public static void main(String[] args){
    Point original = new Point(4, 8);
    // (Point)original.clone()
    // 생성된 Point 객체를 복사해서 
    // 새로운 객체를 생성함
    Point copy = (Point)original.clone();
    // toString 을 Overriding 하지 않고
    // 아래 code 를 실행하면 서로 다른 HashCode 를
    // 확인할 수 있음 <-- (둘 다 Point 클래스의 객체이나)
    // 서로 다른 객체임
    System.out.println(original);
    System.out.println(copy);
  }
}
