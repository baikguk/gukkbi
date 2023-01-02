class Figure{
  int figure;
}
// Call by Reference
public class Ex02 {
  public static void main(String[] args){
    Figure f1 = new Figure();
    System.out.println("-- method1(Figure f) 호출 전 --");
    System.out.println("f1.figure : " + f1.figure);

    method1(f1);
    System.out.println("-- method1(Figure f) 호출 후 --");
    System.out.println("f1.figure : " + f1.figure);
  }
  public static void method1(Figure f){
    f.figure = 1000;
  }
}
