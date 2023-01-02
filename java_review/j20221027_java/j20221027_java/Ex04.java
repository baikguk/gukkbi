abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T>{
  static int id = 0;
  int ordinal;
  String name = "";
  MyEnum(String name){
    this.name = name;
    ordinal = id++;
  }
  public int ordinal() { return this.ordinal; }
  public int compareTo(T t) { return this.ordinal - t.ordinal(); }
}

abstract class MyTransportation extends MyEnum{
  static final MyTransportation BUS = new MyTransportation("BUS", 100) {
                                        int fare(int distance) { return distance * BASIC_FARE; }
                                      };
  static final MyTransportation TRAIN = new MyTransportation("TRAIN", 150) {
                                        int fare(int distance) { return distance * BASIC_FARE; }
                                      };
  static final MyTransportation SHIP = new MyTransportation("SHIP", 200) {
                                        int fare(int distance) { return distance * BASIC_FARE; }
                                      };
  static final MyTransportation AIRPLANE = new MyTransportation("AIRPLANE", 300) {
                                        int fare(int distance) { return distance * BASIC_FARE; }
                                      };
  abstract int fare(int distance);
  protected final int BASIC_FARE;
  private MyTransportation(String name, int basicFare){
    super(name);
    BASIC_FARE = basicFare;
  }
  public String name() { return this.name; }
  public String toString() { return this.name; }
}

public class Ex04 {
  public static void main(String[] args){
    MyTransportation trans1 = MyTransportation.BUS;
    MyTransportation trans2 = MyTransportation.BUS;
    MyTransportation trans3 = MyTransportation.TRAIN;
    MyTransportation trans4 = MyTransportation.SHIP;
    MyTransportation trans5 = MyTransportation.AIRPLANE;

    System.out.printf("trans1 : %s, %d%n", trans1.name(), trans1.ordinal());
    System.out.printf("trans2 : %s, %d%n", trans2.name(), trans2.ordinal());
    System.out.printf("trans3 : %s, %d%n", trans3.name(), trans3.ordinal());
    System.out.printf("trans4 : %s, %d%n", trans4.name(), trans4.ordinal());
    System.out.printf("trans5 : %s, %d%n", trans5.name(), trans5.ordinal());

    System.out.println("trans1 == trans2 : " + (trans1 == trans2));
    System.out.println("trans1.compareTo(trans3) : " + trans1.compareTo(trans3));

  }
}
