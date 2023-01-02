public class Ex05 {
  public static void main(String[] args){
    Dog d = new Dog();
    Animal a = d;
    d = (Dog)a;
    d.sound();
    // 자식과 같이 있는 부모권한으로 메소드를 호출하면
    // overriding 된 내용이 실행됨
    a.sound();

    // 부모 혼자 있을 때,
    // 부모권한으로 메소드를 호출하면
    // overriding 되기 전 내용이 실행됨
    Animal a2 = new Animal();
    a2.sound();
  }
}
class Animal{
  public void sound(){
    System.out.println("소리를 냅니다");
  }
}
class Dog extends Animal{
  @Override
  public void sound(){
    System.out.println("소리를 냅니다 멍멍");
  }
}
