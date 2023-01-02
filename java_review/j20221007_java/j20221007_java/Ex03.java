import java.util.Arrays;

class A{
  int num1;
  int num2;
}
class B { }

public class Ex03 {

  static int[] arr1 = {1, 2, 3, 4, 5};

  public static void main(String[] args){
    System.out.println("프로그램 시작");
    A a = methodA();
    System.out.println("-- methodA() 호출 후 --");
    System.out.println("a.num1 : " + a.num1);
    System.out.println("a.num2 : " + a.num2);

    B b = methodB(a);
    System.out.println("-- methodB(A a) 호출 후 --");
    System.out.println("a.num1 : " + a.num1);
    System.out.println("a.num2 : " + a.num2);
    System.out.println("-----------------------");

    int[] returnValue = method1();
    for(int number : returnValue){
      System.out.printf("%d ", number);
    }
    System.out.println("\n-----------------------");

    returnValue = method2(arr1);
    for(int number : returnValue){
      System.out.printf("%d ", number);
    }
    System.out.println("\n-----------------------");


    returnValue = method2(new int[]{11, 22, 33, 44, 55});
    for(int number : returnValue){
      System.out.printf("%d ", number);
    }
    System.out.println("\n-----------------------");


    System.out.println("프로그램 종료");
  }
  public static A methodA(){
    A a = new A();
    a.num1 = 111;
    a.num2 = 222;
    return a;
  }
  public static B methodB(A a){
    B b = new B();
    a.num1 = 10;
    a.num2 = 20;
    return b;
  }
  public static int[] method1(){
    return arr1;
  }
  public static int[] method2(int[] arr){
    arr[0] = 100;
    return arr;
  }

}
