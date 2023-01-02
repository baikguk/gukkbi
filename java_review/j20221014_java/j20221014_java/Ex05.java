abstract class Super{
  public abstract void test1();
  public abstract void test2();
  public abstract void test3();
  public abstract void test4();
  public abstract void test5();
  public abstract void test6();
  public abstract void test7();
  public abstract void test8();
  public abstract void test9();
  public abstract void test10();
}
class AdapterClass extends Super{
  @Override
  public void test1(){}
  @Override
  public void test2(){}
  @Override
  public void test3(){}
  @Override
  public void test4(){}
  @Override
  public void test5(){}
  @Override
  public void test6(){}
  @Override
  public void test7(){}
  @Override
  public void test8(){}
  @Override
  public void test9(){}
  @Override
  public void test10(){}
}

/*
  추상클래스 Super 를 상속받아서
  test3() 메소드와 test5() 메소드를
  호출해 보세요
  현재 필요한 메소드는 test3(), test5()
  뿐이어서 이 두개의 메소드만
  Overriding 하려고 했으나....
  나머지 8 개의 메소드도
  강제적으로 Overriding 해야 함...

  Super 클래스와 Sub 클래스 사이에
  Super 클래스를 상속받는
  일반클래스를 작성한 후
  (이 경우에 작성하는 일반클래스를
   Adapter class 라고 함)
  Sub 클래스에서 이 클래스를
  상속받는 방법으로 하면
  Sub 클래스에서는
  사용하고자 하는
  메소드들만 Overriding 하면 됨
*/
class Sub extends AdapterClass{
  @Override
  public void test3(){
    System.out.println("test3() in Sub");
  }
  @Override
  public void test5(){
    System.out.println("test5() in Sub");
  }
}
public class Ex05 {
  public static void main(String[] args){
    Sub sub = new Sub();
    sub.test3();
    sub.test5();
  }
}
