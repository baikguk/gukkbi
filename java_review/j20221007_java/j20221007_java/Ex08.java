
class Data{
  int x;
}
public class Ex08 {
  public static void main(String[] args){
    Data d = new Data();

    System.out.println("-- change(int x) 호출 전 --");
    System.out.println("d.x in main() : " + d.x);
    d.x = 10;
    System.out.println("d.x in main() : " + d.x);

    change(d.x);
    System.out.println("-- change(int x) 호출 후 --");
    System.out.println("d.x in main() : " + d.x);
  }
  // parameter 의 type 이 primitive type  이면
  // Call by Value
  public static void change(int x){
    x = 123456;
    System.out.println("-- change() 메소드의 scope --");
    System.out.println("x in change(int x) : " + x);
  }
}
