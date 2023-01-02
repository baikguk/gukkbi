package pac2;

import pac1.Pac02;

public class Pac05 extends Pac02 {
  public void method1(){
    this.num1 = 10;
    // private 이라서 접근 불가
    // this.num2 = 20;
    // default 라서 접근 불가
    // this.num3 = 30;
    // protected : package 가 달라도 상속관계라면 접근 가능
    this.num4 = 40;
  }
}
