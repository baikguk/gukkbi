public class Ex08 {
  public static void main(String[] args){
    /*
      1부터 10까지 출력하는데...
      3의 배수만 제외하고 출력하기
        ㄴ for 문으로 작성하고
        ㄴ while 문으로 변환도 해 보세요
    */
    for(int i = 1; i<= 10;i++){
      if(i % 3 == 0){
        continue;
      }
      System.out.printf("%d ",i);
    }
    System.out.println("\n----------------------------");

    // while
    int i = 0;
    while(i < 10){
      i++;
      if(i % 3 == 0){
        continue;
      }
      System.out.printf("%d ", i);

    }


  }
}
