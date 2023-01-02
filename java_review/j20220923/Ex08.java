public class Ex08 {
  public static void main(String[] args){
    // 1 부터 10까지의 합계를 출력하세요
    // ㄴ for 문을 사용하세요

    // 합계를 저장하는 변수
    int sum = 0;
    int i;
    for(i = 1; i <= 10; i += 1){
      // sum = sum + i;
      sum += i;
    }
    // 1 부터 10까지의 합 : 55
    System.out.println("1 부터 10까지의 합 : " + sum);
    System.out.printf("1 부터 %d까지의 합 : %d%n", i-1, sum);
  }
}
