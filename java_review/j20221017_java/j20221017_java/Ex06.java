public class Ex06 {
  public static void main(String []args){
    // 수리 받을 Unit 들
    Tank tank = new Tank();
    DropShip dropShip = new DropShip();
    Marine marine = new Marine();
    Terran terran = new Terran();

    // 수리하는 Unit : SCV
    SCV scv = new SCV();

    scv.repair(tank);
    scv.repair(dropShip);
    scv.repair(marine);
    scv.repair(terran);

  }
}
interface Repairable{ }
class Unit2{
  int hitPoint;
  final int MAX_HP;
  public Unit2(int hp){
    MAX_HP = hp;
  }
}
class GroundUnit extends Unit2{
  // 기본 생성자를 작성하지 않으면
  // java compiler 가 자동으로 작성해 줌
  // 자식 클래스의 모든 생성자의 첫 째줄에서는
  // 부모클래스의 기본생성자를 호출하는 code 가 있음
  public GroundUnit(int hp){
    super(hp);
  }
}
class AirUnit extends Unit2{
  public AirUnit(int hp){
    super(hp);
  }
}
class Tank extends GroundUnit implements Repairable{
  public Tank(){
    super(150);
    this.hitPoint = this.MAX_HP;
  }
  @Override
  public String toString(){
    return "Tank";
  }
}
class DropShip extends AirUnit implements Repairable{
  public DropShip(){
    super(125);
    this.hitPoint = this.MAX_HP;
  }
  @Override
  public String toString(){
    return "DropShip";
  }
}
class Marine extends GroundUnit implements Repairable{
  public Marine(){
    super(40);
    this.hitPoint = this.MAX_HP;
  }
  @Override
  public String toString(){
    return "Marine";
  }
}

class Terran extends GroundUnit{
  public Terran(){
    super(60);
    this.hitPoint = this.MAX_HP;
  }
  @Override
  public String toString(){
    return "Terran";
  }
}


class SCV extends GroundUnit implements Repairable{
  public SCV(){
    super(60);
    this.hitPoint = MAX_HP;
  }
  // parameter 로 들어로는 객체만 수리가 가능함
  //   ㄴ Unit2 을 상속받은 객체
  void repair(Unit2 u){
    // parameter 로 전달받은 객체(r)가
    //  ㄴ Unit2 을 상속받은 객체 중에서
    // Repairable 클래스를 상속받은 객체인지 확인하기
    if(u instanceof Repairable){
      Repairable r = (Repairable)u;
       while(u.hitPoint != u.MAX_HP){
         // u 객체의 hitPoint 가 MAX_HP 하고
         // 같아질 때까지 반복함
         u.hitPoint++;
       }
       System.out.println(u + " 의 수리를 마쳤습니다");
    }else{
      System.out.println(u + " 의 수리를 못했습니다");
    }


  }
}







