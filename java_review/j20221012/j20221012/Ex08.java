public class Ex08 {
  public static void main(String[] args){
    Animal a = new Animal();
    a.sound();
    Dog d = new Dog();
    d.sound();
    Cat c = new Cat();
    c.sound();
    System.out.println("---------------------");

    // overriding 과 다형성
    // (부모타입의 참조변수는 자식객체의 주소를 할당받을 수 있음)
    // Animal type 의 배열의 index 에는 Animal 객체의 주소를 저장함
    Animal[] anis = new Animal[5];
    anis[0] = new Animal();
    anis[1] = new Dog();
    anis[2] = new Animal();
    anis[3] = new Cat();
    anis[4] = new Animal();

    for(int i = 0; i < anis.length; i++){
      anis[i].sound();
    }
  }
}

/*
  Overriding  --> 다형성 구현하기 위함
  자식클래스에서 부모클래스에서 상속받은
  메소드의 선언부는 똑같이 사용하면서
  body 부분을 자신한테 맞도록 변형하는 문법

  선언부의 return type, 메소드이름,
  parameter 의 type, 순서, 개수가 모두 일치해야 함

  다형성 (polymorphism)
    같은 형태의 code 가
    실행시 어떤 객체가 실행하느냐에 따라서
    결과가 다르게 나타나는 것
*/

class Animal{
  public void sound(){
    System.out.println("소리를 냅니다");
  }
}
class Dog extends Animal{
  public void sound(){
    System.out.println("소리를 냅니다 멍멍");
  }
}
class Cat extends Animal{
  public void sound(){
    System.out.println("소리를 냅니다 야옹");
  }
}


