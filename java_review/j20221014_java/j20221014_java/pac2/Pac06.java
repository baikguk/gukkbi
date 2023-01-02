package pac2;

import pac1.Pac02;

public class Pac06 extends Pac02{
  public static void main(String[] args){

    /*
      protected 라고 해도
      부모 type 의 참조변수로는 접근할 수 없고
      자식 type 의 참조변수로만 접근할 수 있음
    */

    Pac02 p2 = new Pac02();
    p2.num1 = 10;
    // p2.num2 = 10;
    // p2.num3 = 10;
    // p2.num4 = 10;

    Pac02 p2_1 = new Pac06();
    p2_1.num1 = 10;
    // p2_1.num2 = 20;
    // p2_1.num3 = 30;
    // p2_1.num4 = 40;

    Pac06 p6 = new Pac06();
    p6.num1 = 10;
    // p6.num2 = 20;
    // p6.num3 = 30;
    p6.num4 = 40;



    P p = new Ch();
    Ch ch = (Ch)p;

    P p1 = new P();


  } // main
}

class P{ }
class Ch extends P { }







