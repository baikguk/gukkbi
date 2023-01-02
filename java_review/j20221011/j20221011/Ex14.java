public class Ex14 {

  // 1
  static int[] arrNum = new int[10];
  // 2
  static int a = 10;

  // 3
  // static 초기화 블럭이 main method 보다 먼저 실행됨
  static{
    for(int i = 0; i < arrNum.length; i++ ){
      arrNum[i] = (int)(Math.random() * 10) + 1;
    }
  }
  // 4
  public Ex14(){ }
  public static void main(String[] args){
    for(int i = 0; i < arrNum.length; i++ ){
      System.out.printf("%d ", arrNum[i]);
    } // for
    System.out.println("\n---------------------------------");
  } // main
} // class
