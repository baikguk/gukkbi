/*
  접근제한자 : access modifier

  public > protected > default > private

  public    : 접근제한이 없음
  protected : package 가 달라도 상속관계에 있으면 접근 가능함
  default   : 같은 package 안에서만 접근 가능함
  private   : 같은 클래스 안에서만 접근 가능함

*/
package pac1;

public class Pac02 {
  public int num1;
  private int num2;
  int num3;
  protected int num4;
}








