
class Data2{
  int x;
}
public class Ex08_1 {
  public static void main(String[] args){
    Data2 d = new Data2();

    System.out.println("-- change(int x) 호출 전 --");
    System.out.println("d.x in main() : " + d.x);
    d.x = 10;
    System.out.println("d.x in main() : " + d.x);

    // Data2 d = new Data2();
    change(d);
    System.out.println("-- change(int x) 호출 후 --");
    System.out.println("d.x in main() : " + d.x);
  }
  // parameter 의 type 이 reference type  이면
  // Call by Reference : 주솟값을 전달(복사) 해서 메소드를 호출함
  public static void change(Data2 d){
    d.x = 123456;
    //System.out.println("-- change() 메소드의 scope --");
    //System.out.println("d.x in change(int x) : " + d.x);
  }
}
