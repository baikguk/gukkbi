/*
	 Override
	    : 부모 클래스에 정의된 메소드를 상속받아서
	      (자식 클래스에서)
	      선언부는 동일하게 작성하고 body 부분을 변형해서 사용하는 것

	 1) 부모클래스에서 정의된 메소드와 이름, 일치해야 함
	 2) 매개변수부(종류, 순서, 개수), 일치해야 함
	 3) return type :  일치해야 함
	                  (overloading 에서는 리턴타입 관계 없음)
	 4) 접근제한자(access modifier)의 범위는 부모와 같거나 넓어야 함
	    public - protected - default - private
	 5) throws 는 부모에서 정의된 Exception 하고 같거나
	              자손 Exception 으로 해야 함
*/
/*
 객체생성
  new + 생성자호출

(자바에서 생성자는 상속 받지 않음)
 자식객체를 생성하면
 먼저 부모객체가 생성되고
 같은 주소지에
 자식객체가 생성됨
  ㄴ 두 객체가 합해진 형태를
     자식객체라고 함
*/
public class Ex03 {
  public static void main(String[] args){
    Point p1 = new Point();
    System.out.println(p1.getLocation());

    Point3D p3d1 = new Point3D();
    System.out.println(p3d1.getLocation());

    Point3D p3d2 = new Point3D(10);
    System.out.println(p3d2.getLocation());

    Point3D p3d3 = new Point3D(22, 55, 77);
    System.out.println(p3d3.getLocation());
  }
}
class Point{
  int x, y;
  public Point(){
  }
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  String getLocation(){
    return "x : " + this.x + ", y : " + this.y;
  }
}
class Point3D extends Point{
  int z;

  // 자식클래스의 모든 생성자의 첫 번째 줄에는
  // 부모클래스의 기본생성자를 호출하는 code 가
  // 생략되어 있음 <- 자동으로 호출됨
  // 부모클래스의 매개변수 있는 생성자를 호출하는
  // code 는 자동으로 작성되지 않음
  //  ㄴ 명시적으로 작성해야 함

  public Point3D(){
    // super();
  }
  public Point3D(int z){
    // super();
    this.z = z;
  }
  public Point3D(int x, int y, int z){
    super(x, y);
    this.z = z;
  }
  @Override
  String getLocation(){
    return "x : " + this.x + ", y : " + this.y + ", z : " + this.z;
  }
}
