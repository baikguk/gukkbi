/*
  반복문 (for loop / while loop (do-while loop))

  for loop
  형식]
    for(시작;종료조건;증가(감소)){
      반복할 명령문...
    }
    for(초기화식 ; 조건식 ; 증가(감소)식){
      반복할 명령문...
      반복할 명령문...
      반복할 명령문...
      반복할 명령문...
    }
    for 문의 실행 순서
    조건식이 참인 동안 반복함 <- 거짓이 되는 순간 반복을 종료함
    초기화식 -> 조건식 -> (참)반복할 명령문 -> 증가식
                   ㄴ<-------------------------- ┘
*/

public class Ex07 {
  public static void main(String[] args){

    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");
    System.out.println("안녕하세요");

    System.out.println("===========================");

    /*
      형식]
        for(1;5;1){
          반복할 명령문...
        }
    */

    // 조건식이 참인 동안 반복함
    // i : 반복에 사용되는 변수 <- index 변수
    for(int i = 1;i <= 5;i++){
      System.out.println("안녕하세요");
    }
    System.out.println("===========================");
    int i;
    for(i = 1;i <= 5;i++){
      System.out.println("안녕하세요 - " + i);
    }
    System.out.println("for 문이 종료한 후 i 값 : " + i);
    System.out.println("===========================");

  }
}

