public class Ex04 {
  public static void main(String[] args){
    ChildB chb = new ChildB();
    chb.method1();
    System.out.println("-------------------------");
    System.out.println("chb.x : " + chb.x);
    System.out.println("=========================");

    ParentB pb = new ParentB();
    System.out.println("pb.x  : " + pb.x);
    pb.x = 3333;
    System.out.println("pb.x  : " + pb.x);
    System.out.println("chb.x : " + chb.x);
    System.out.println("=========================");

    ChildB chb2 = new ChildB();
    ParentB pb2 = chb2;
    System.out.println("pb2.x  : " + pb2.x);
    pb2.x = 555555;
    System.out.println("pb2.x  : " + pb2.x);
    System.out.println("chb2.x : " + chb2.x);


  }
}
class ParentB{
  int x = 10;
}
class ChildB extends ParentB{
  int x = 20;
  void method1(){
    System.out.println("x       : " + x);
    System.out.println("this.x  : " + this.x);
    System.out.println("super.x : " + super.x);
  }
  /*
    this 키워드는 자신 클래스를 의미함
    super 키워드는 부모 클래스를 의미함
    this 나 super 를 사용하지 않은 경우,
    부모 클래스의 멤버변수 이름과
    자식 클래스의 멤버변수 이름이 같으면
    자식 클래스의 멤버변수를 의미함
    (this 가 생략된 형태임)
  */

}
