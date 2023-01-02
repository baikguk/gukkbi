public class Test {
  public static void main(String[] args) {
    String str1 = new String("global");
    String str2 = new String("global");
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    A a1 = new A(100);
    A a2 = new A(100);
    System.out.println(a1 == a2);
    System.out.println(a1.equals(a2));

  }
}
class A{
  int number;
  public A(int number){
    this.number = number;
  }
}
