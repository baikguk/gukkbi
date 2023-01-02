public class Ex04_1 {
  public static void main(String[] args){
    /*
      ParentC 에서 작성한
      display()
      method1()
      add(int num1, int num2)
      이 3 개의 method 들을 호출해 보세요
    */
    GrandChildC gc = new GrandChildC();

    gc.display();
    gc.method1();
    gc.add(123, 456);
  }
}
abstract class ParentC{
  int number = 10;
  float f;
  public void display(){
    System.out.println("display() in ParentC");
  }
  public abstract void method1();
  public abstract int add(int num1, int num2);
}

// 추상클래스를 상속받는 자식클래스도 추상클래스인 경우에는
// 상속받은 추상메소드를 Overriding 해도 되도 안 해도 됨
abstract class ChildC extends ParentC{
  @Override
  public void display(){
    System.out.println("display() in ChildC");
  }
  @Override
  public void method1(){
    System.out.println("method1() in ChildC");
  }
}
class GrandChildC extends ChildC{
  @Override
  public int add(int num1, int num2){
    System.out.println("add(int num1, int num2) in GrandChildC");
    return num1 + num2 + 2000;
  }
  @Override
  public void display(){
    System.out.println("display() in GrandChildC");
  }
  @Override
  public void method1(){
    System.out.println("method1() in GrandChildC");
  }
}

// 추상클래스를 상속받는 자식클래스가 일반클래스인 경우에는
// 상속받은 추상메소드를 Overriding 해야만 함








