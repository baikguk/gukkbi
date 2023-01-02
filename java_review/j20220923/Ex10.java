public class Ex10 {
  public static void main(String[] args){

    // for <- 초기화식 ; 조건식 ; 증가(감소)식

    // int i = 0;

    for(int i = 1,  j = 10; i <= 10 && j >= 1; i++, j--){
      System.out.printf("%2d - %2d%n", i, j);
    }
    System.out.println("---------------------------");

    int k = 10;
    for(int i = 1, j = 10; k > 0; i++, j--){
      System.out.printf("%2d - %2d%n", i, j);
      k--;
    }

  }
}
