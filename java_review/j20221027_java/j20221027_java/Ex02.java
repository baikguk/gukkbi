enum Direction2{
  EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

  // Direction2[] arrDirect2 =  Direction2.values() <-- EAST, SOUTH, WEST, NORTH
  private static final Direction2[] arrDirect2 = Direction2.values();
  private final int number;
  private final String symbol;

  Direction2(int number, String symbol){
    this.number = number;
    this.symbol = symbol;
  }

  // getter
  public int getNumber(){ return this.number; }
  public String getSymbol(){ return this.symbol; }

  // Direction2[] arrDirect2 = {EAST, SOUTH, WEST, NORTH}
  public static Direction2 of(int direction){
    if(direction < 1 || 4 < direction){
      throw new IllegalArgumentException("invalid direction : " + direction);
    }
    return arrDirect2[direction - 1];
  }

  // direction 을 회전시키기 - num 의 값만큼 시계방향으로 90도 회전시키기
  public Direction2 rotate(int num){
    num = num % 4;

    // number 가 음수인 경우, 시계 반대 방향으로 회전시키기
    if(num < 0) { num += 4; }

    System.out.println("num    : " + num);
    System.out.println("number : " + number);

    return arrDirect2[(number - 1 + num) % 4];
  }

  public String toString(){
    return name() + " : " + getSymbol();
  }
} // enum Direction2

public class Ex02 {
  public static void main(String[] args){
    for(Direction2 d : Direction2.values()){
      System.out.printf("%s : %d%n", d.name(), d.getNumber());
    }
    System.out.println("-------------------------------");

    Direction2 d1 = Direction2.EAST;
    Direction2 d2 = Direction2.of(1);

    System.out.printf("d1 : %s, %d%n", d1.name(), d1.getNumber());
    System.out.printf("d2 : %s, %d%n", d2.name(), d2.getNumber());
    System.out.println("-------------------------------");

    System.out.println("Direction2.EAST.rotate(1) -> " + Direction2.EAST.rotate(1));
    System.out.println("Direction2.EAST.rotate(2) -> " + Direction2.EAST.rotate(2));
    System.out.println("Direction2.EAST.rotate(-1) -> " + Direction2.EAST.rotate(-1));
    System.out.println("Direction2.EAST.rotate(-2) -> " + Direction2.EAST.rotate(-2));

  }
}
