/*
  상속 (inheritance)
          ㄴ extension(확장)

  부모(Super, Parent) - 자식(Sub, Child)
     default              extension

  생성자는 상속되지 않음

  자식객체를 생성할 때
  부모객체가 먼저 생성되어서 메모리에 올라가고
  같은 주소지에 자식클래스에 정의된 내용들이 같이 올라감

*/
class Calc4{
  int n1, n2;
  public int add(){
    return n1 + n2;
  }
  public int subtract(){
    return n1 - n2;
  }
  public int multiply(){
    return n1 * n2;
  }
  public int divide(){
    return n1 / n2;
  }
}
class Calc5 extends Calc4{
  public int mod(){
    return n1 % n2;
  }
}

public class Ex17 {
  public static void main(String[] args){
    Calc4 c4 = new Calc4();
    c4.n1 = 10;
    c4.n2 = 8;
    System.out.println(c4.add());
    System.out.println(c4.subtract());
    System.out.println(c4.multiply());
    System.out.println(c4.divide());
   // System.out.println(c4.mod());
    System.out.println("------------------------------");

    // 자식객체를 생성할 때
    // 부모객체가 먼저 생성되어서 메모리에 올라가고
    // 같은 주소지에 자식클래스에 정의된 내용들이 같이 올라감
    Calc5 c5 = new Calc5();
    c5.n1 = 10;
    c5.n2 = 8;
    System.out.println(c5.add());
    System.out.println(c5.subtract());
    System.out.println(c5.multiply());
    System.out.println(c5.divide());
    System.out.println(c5.mod());
  }
  
}
