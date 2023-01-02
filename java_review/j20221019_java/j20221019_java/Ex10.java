import java.util.Random;

public class Ex10 {
  public static void main(String[] args){
    //  Random 클래스
    //  nextInt(숫자) - 0 부터 숫자 미만의 임의의 정수를 반환함
    //  nextInt() - 임의의 정수 반환(int type 범위 내에서)
    Random rint1 = new Random(1);
    Random rint2 = new Random(1);

    System.out.println("-- rint1 --");
    for(int i = 0; i < 5; i++) {
      System.out.println(i+1 + " : " + rint1.nextInt());
    }
    System.out.println("-------------------");

    System.out.println("-- rint2 --");
    for(int i = 0; i < 5; i++) {
      System.out.println(i+1 + " : " + rint2.nextInt());
    }


  }
}
