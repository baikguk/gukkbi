
/*
  enum 에 있는 상수들은 해당 enum 의 객체들임
  index 가 부여됨 : (order(순서))가 있음
*/

enum Direction {EAST, SOUTH, WEST, NORTH}

public class Ex09 {
  public static void main(String[] args){
    Direction d1 = Direction.EAST;
    Direction d2 = Direction.valueOf("WEST");
    Direction d3 = Enum.valueOf(Direction.class, "SOUTH");
    // Direction d4 = Direction.WEST;
    // Direction d5 = Direction.NORTH;

    System.out.println("d1 : " + d1);
    System.out.println("d2 : " + d2);
    System.out.println("d3 : " + d3);

    // == : 객체의 주소를 비교하므로 false 가 됨
    System.out.println("d1 == d2 : " + (d1 == d2));
    System.out.println("d1 == d3 : " + (d1 == d3));

    // equals() : toString() 이 반환하는 문자열을 비교하는데
    //            이 문자열은 각 객체의 주소를 할당받고 있는 상수를 문자열이고
    //            EAST, SOUTH, WEST, NORTH 에 가지가 있음
    //              ㄴ 서로 다른 문자열을 비교하므로 false 가 됨
    System.out.println("d1.equals(d2) : " + d1.equals(d2));
    System.out.println("d1.equals(d3) : " + d1.equals(d3));


    System.out.println("d1.compareTo(d2) : " + d1.compareTo(d2));
    System.out.println("d1.compareTo(d3) : " + d1.compareTo(d3));

    System.out.println("d1.ordinal() : " + d1.ordinal()); // 0
    System.out.println("d2.ordinal() : " + d2.ordinal()); // 2
    System.out.println("d3.ordinal() : " + d3.ordinal()); // 1

  }
}
