/*
  Singleton Pattern
    객체를 하나만 생성해서 사용함
*/

final class Singleton{
  private static Singleton s;
  private Singleton(){ }
  public static Singleton getInstance(){
    if(s == null) {
      s = new Singleton();
    }
    return s;
  }
}
public class Ex03 {
  public static void main(String[] args){
    Singleton s1 =  Singleton.getInstance();
    Singleton s2 =  Singleton.getInstance();
    Singleton s3 =  Singleton.getInstance();
    Singleton s4 =  Singleton.getInstance();
    Singleton s5 =  Singleton.getInstance();

    System.out.println(s1 == s2);
    System.out.println(s3 == s2);
    System.out.println(s5 == s3);
    System.out.println(s1 == s4);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);


  }
}
