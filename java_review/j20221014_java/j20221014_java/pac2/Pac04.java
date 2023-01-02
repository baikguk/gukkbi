package pac2;

import pac1.Pac02;

public class Pac04 {
  public static void main(String[] args){
    Pac02 p2 = new Pac02();
    p2.num1 = 10;
    // private 이라서 접근 불가
    // p2.num2 = 20;
    // default 는 같은 package 안에서만 접근 가능함
    // p2.num3 = 30;
    // protected 는 다른 package 에서도 접근 가능하지만
    // 상속관계에 있는 때만 가능함
    // p2.num4 = 40;


  }
}
