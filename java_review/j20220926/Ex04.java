public class Ex04 {
  public static void main(String[] args){
    /*
      1부터 차례대로 몇까지 더했을 때
      그 합계가 100 이 넘는지 알아보기
      (while 문 사용하기)
    */
    int sum = 0;
    int   i = 0;
    while((sum += ++i) <= 100){
     // System.out.printf("%2d - %2d%n", i, sum);
    }
    System.out.printf("\n1부터 %d까지 더하면 \n총합이 100이 넘고\n총합은 %d입니다%n", i, sum);




  }
}
