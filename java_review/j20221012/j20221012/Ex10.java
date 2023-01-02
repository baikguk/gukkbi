import sun.security.krb5.internal.crypto.Des;

public class Ex10 {
  public static void main(String[] args){

    // 실제로 할당받은 객체가 어느 것인가가 중요함

    BattleShip b1 = new BattleShip();
    Destroyer  d1 = new Destroyer();

    if (b1 instanceof Destroyer) {
      System.out.println("b1 은 Destroyer 객체의 주소를 할당 받았음");
      d1 = (Destroyer) b1;
    }else{
      System.out.println("b1 은 Destroyer 객체의 주소를 할당 받지 않았음");
    }

    BattleShip b2 = new Destroyer();
    Destroyer  d2 = new Destroyer();

    if (b2 instanceof Destroyer) {
      System.out.println("b2 는 Destroyer 객체의 주소를 할당 받았음");
      d2 = (Destroyer) b2;
    }else{
      System.out.println("b2 는 Destroyer 객체의 주소를 할당 받지 않았음");
    }

    BattleShip b3 = new BattleShip();
    Cruiser c1 = new Cruiser();

    if (b3 instanceof Cruiser) {
      System.out.println("c1 은 Cruiser 객체의 주소를 할당 받았음");
      c1 = (Cruiser) b3;
    }else{
      System.out.println("c1 은 Cruiser 객체의 주소를 할당 받지 않았음");
    }

    BattleShip b4 = new Cruiser();
    Cruiser c2 = new Cruiser();

    if (c2 instanceof Cruiser) {
      System.out.println("c2 는 Cruiser 객체의 주소를 할당 받았음");
      c2 = (Cruiser) b4;
    }else{
      System.out.println("c2 는 Cruiser 객체의 주소를 할당 받지 않았음");
    }

  }
}

class BattleShip{ }
class Destroyer extends BattleShip{ }
class Cruiser extends BattleShip{ }