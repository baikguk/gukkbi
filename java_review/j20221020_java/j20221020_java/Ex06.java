
/*
    boolean    Boolean

    char       Character

    byte       Byte
    short      Short
    int        Integer
    long       Long

    float      Float
    double     Double
*/
public class Ex06 {
  public static void main(String[] args){
    int i1 = 100;
    Integer i2 = new Integer(100);

    System.out.println(i1);
    System.out.println(i2);

    i1 = 200;

    // 기본형 변수의 값을 참조형 변수에 할당함
    // boxing
    i2 = i1;
    System.out.println(i2);

    i2 = new Integer(300);
    // 참조형 변수의 값을 기본형 변수에 할당함
    // unboxing
    i1 = i2;
    System.out.println(i1);


    int i3 = 10;

    // 기본형을 참조형으로 형변환함(형변환 생략가능)
    // 이것을 boxing 이라고 하며, 형변환을 생략하면 자동형변환이 됨
    // 자동으로 boxing 된다 해서 auto boxing 이라고 함
    // 반대의 경우(참조형을 기본형으로 형변환)
    // auto unboxing 이라고 함

    // boxing
    Integer i4 = (Integer)i3;

    // auto boxing
    i4 = i3;

    Integer i5 = 300;

    // unboxing
    int i6 = (int)i5;

    // auto inboxing
    i6 = i5;

    // 참조형과 기본형과의 연산이 가능함
    int result = i5 + i6;
    System.out.println("result : " + result);

    Long l1 = 500L;

    // i5 (참조형)
    Long l2 = i5 + l1;
    System.out.println("l2 : " + l2);

    String strNumber = "1234";

    Integer intg1 = Integer.parseInt(strNumber);
    System.out.println("intg1 : " + intg1);

    String strNumber2 = "6.25";
    Float f1 = Float.parseFloat(strNumber2);
    System.out.println("f1 : " + f1);

    Double d1 = Double.parseDouble(strNumber2);
    System.out.println("d1 : " + d1);

    Integer intg2 = new Integer(100);
    Integer intg3 = new Integer(100);

    System.out.println(intg2 == intg3);
    System.out.println(intg2.equals(intg3));
    // intg1 : 1234,  intg2 : 100,  intg3 : 100
    System.out.println(intg1.compareTo(intg2));
    System.out.println(intg2.compareTo(intg1));
    System.out.println(intg3.compareTo(intg2));
    System.out.println(intg2);
    System.out.println(intg2.toString());

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.SIZE);
    System.out.println(Integer.BYTES);
    System.out.println(Integer.TYPE);


  }
}

