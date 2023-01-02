import sun.text.normalizer.CharTrie;

public class Ex07 {
  public static void main(String[] args){
    FireEngine fire = new FireEngine();
    Ambulance ambul = new Ambulance();
    Car car = null;

    car = (Car)fire;
    fire  = (FireEngine) car;

    car = (Car)ambul;
    // fire  = (FireEngine) car;
    ambul = (Ambulance) car;

    FireEngine f1 = new FireEngine();
    FireEngine f2 = null;

    f1.water();
    car  = f1;
    f2 = (FireEngine) car;
    f2.water();

    System.out.println("======== instanceof =========");

    FireEngine f3 = new FireEngine();

    if(f3  instanceof FireEngine){
      System.out.println("f3 에 할당된 주소에는 FireEngine 객체가 있습니다.");
    }
    if(f3 instanceof Car){
      System.out.println("f3 에 할당된 주소에는 Car 객체가 있습니다.");
    }
    if(f3 instanceof Object){
      System.out.println("f3 에 할당된 주소에는 Object 객체가 있습니다.");
    }
    System.out.println("==================================");

    method1(car);
    method1(f1);
    method1(ambul);



  }

  public static void method1(Object obj){
    if(obj instanceof Car){
      Car c = (Car)obj;
      c.drive();
    }else if(obj instanceof FireEngine){
      FireEngine f = (FireEngine)obj;
      f.water();
    }else if(obj instanceof Ambulance){
      Ambulance a = (Ambulance)obj;
      a.siren();
    }
  }
}
class Car{
  String color;
  int door;
  void drive(){
    System.out.println("자동차가 출발합니다 ~~~");
  }
  void stop(){
    System.out.println("자동차가 멈춥니다");
  }
}
class FireEngine extends Car{
  void water(){
    System.out.println("소방차가 물을 뿌립니다");
  }
}
class Ambulance extends Car{
  void siren(){
    System.out.println("앰뷸런스가 사이렌을 울립니다");
  }
}






