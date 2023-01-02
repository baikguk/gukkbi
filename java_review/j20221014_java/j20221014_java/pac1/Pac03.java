package pac1;

public class Pac03 {
  public static void main(String[] args){
    Pac02 p2 = new Pac02();
    p2.num1 = 100;
    // private 이라서 다른 클래스에서는 접근이 안 됨
    // p2.num2 = 200;
    p2.num3 = 300;
    p2.num4 = 400;
  }
}
