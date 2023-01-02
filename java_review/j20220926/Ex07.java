public class Ex07 {
  public static void main(String[] args){
    /*
      숫자 중에 3이나 6이나 9가 포함되어 있으면
      포함되어 있는 개수만큼 박수를 치는
      ("짝"이라는 문자열을 출력하는)
      프로그램을 작성하세요
      단, 숫자는 1부터 100까지의 숫자를 대상으로 함
        ㄴ for 문으로 1 부터 100까지 반복하면서
        ㄴ for(int i = 1; i <= 100; i++)
        ㄴ  i 가 1부터 100까지 증가하면서
        ㄴ  각 숫자에 3, 6, 9 가 포함되어 있는지 확인하고
        ㄴ 그 개수에 맞도록 "짝" 을 출력함
    */  
    for(int i = 1; i <= 100; i++){
      System.out.printf("i : %3d --> ",i);
      int tmp = i;

      do{
        // tmp 를 10 으로 나눈 나머지가
        // 3의 배수이면서 0 이 아닌지 확인하기
        //  ㄴ 확인하면서 true 이면 "짝" 을 출력함
        if((tmp % 10) %  3 == 0 && tmp % 10 != 0){
          // System.out.printf("%n%b - %b%n", (tmp % 10) %  3 == 0, tmp % 10 != 0);
          System.out.print("짝");
        }
      // tmp 를 10 으로 나눈 몫이 0 이면 종료함
      }while((tmp /= 10) != 0);
      System.out.println();
    }

  }
}
