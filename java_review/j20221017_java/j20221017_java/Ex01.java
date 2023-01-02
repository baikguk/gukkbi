public class Ex01 {
  public static void main(String[ ]args){
    /*
      Fighter1 을 (10, 20) 좌표로 이동하기
      Fighter2 를 (30, 50) 좌표로 이동하기
    */
    Fighter1 f1 = new Fighter1();
    f1.move(10, 20);

    Fighter2 f2 = new Fighter2();
    f2.move(30, 50);

    f1.attack(f2);
    f2.attack(f1);

  }
}
class Unit extends Object{
  int currentHP;
  int x, y;
  @Override
  public String toString() {
    return "Unit";
  }
}
interface Movable{ void move(int x, int y); }
interface Attackable{ void attack(Fightable f); }
interface Fightable extends Movable, Attackable{ }
class Fighter1 extends Unit implements Fightable{
  int x, y;
  @Override
  public void move(int x, int y){
    this.x = x; this.y = y;
    System.out.printf("%s 이 (%d, %d) 좌표로 이동합니다%n", this, x, y);
  }
  @Override
  public void attack(Fightable f){
    System.out.printf("%s 이 %s를 공격합니다%n", this, f);
  }
  public Fighter1 method1(){
    Fighter1 f1 = new Fighter1();
    return f1;
  }
  public Fighter2 method2(){
    Fighter2 f2 = new Fighter2();
    return f2;
  }
  public Fightable method4(){
    Fighter1 f1 = new Fighter1();
    return f1;
  }
  @Override
  public String toString(){
    return "Fighter1";
  }
}
class Fighter2 extends Unit implements Fightable{
  public void move(int x, int y){
    System.out.printf("%s 가 (%d, %d) 좌표로 이동합니다%n", this, x, y);
  }
  @Override
  public void attack(Fightable f){
    System.out.printf("%s 가 %s을 공격합니다%n", this, f);
  }
  public String toString(){
    return "Fighter2";
  }
}
