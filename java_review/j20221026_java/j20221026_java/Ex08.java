public class Ex08 {
  public static void main(String[] args){

  }
}
/*
  Enum (Enumeration) : 열거형
     관련된 상수들을 하나로 묶어 놓은 것
     모든 Enum 들의 최고 조상 클래스
       ㄴ java.lang.Enum

     [형식]
     enum 이름 {상수1, 상수2, 상수3, ....}
*/
class Card{
  static final int CLOVER = 0;
  static final int HEART = 1;
  static final int DIAMOND = 3;
  static final int SPADE = 4;

  static final int ONE = 0;
  static final int TWO = 1;
  static final int THREE = 2;
  static final int FOUR = 3;
  static final int FIVE = 4;

  final int KIND = 4;
  final int NUM = 5;
}

class Card2{
  enum Kind {CLOVER, HEART, DIAMOND, SPADE}
  enum Num {ONE, TWO, THREE, FOUR, FIVE}

  // final Kind kind;
  // final Num num;
}








