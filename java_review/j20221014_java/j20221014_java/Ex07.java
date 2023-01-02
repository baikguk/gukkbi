abstract class Unit{
  int x, y;
  abstract void move(int x, int y);
  void stop(){ }
}
class Marine extends Unit{
  @Override
  void move(int x, int y){
    System.out.println("Marine 이 (" + x + ", " + y + ") 로 이동합니다");
  }
  void stimPack() { }
}
class Tank extends Unit{
  @Override
  void move(int x, int y){
    System.out.println("Tank 가 (" + x + ", " + y + ") 로 이동합니다");
  }
  void changeMode() { }
}
class DropShip extends Unit{
  @Override
  void move(int x, int y){
    System.out.println("DropShip 이 (" + x + ", " + y + ") 로 이동합니다");
  }
  void load() { }
  void unload() { }
}

public class Ex07 {
  public static void main(String[] args){
    Unit[] units = new Unit[5];

    units[0] = new Marine();
    units[1] = new Tank();
    units[2] = new DropShip();
    units[3] = new Marine();
    units[4] = new Tank();

    for(int i = 0; i < units.length; i++){
      units[i].move(100+i, 200*i);
    }

  }
}
