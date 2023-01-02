import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args){
    /*
      3 과목의 성적을 입력 받아서
      총점, 평균, 최고점수, 최저점수 출력하기
      (배열 사용하기)
      크기가 4 인 배열을 생성해서
      각과목의 점수와 총점을 저장함
    */
    // Scanner 준비하기
    Scanner sc  = new Scanner(System.in);

    // 크기가 4 인 int type 배열 생성하기
    int[] scores = new int[4];

    // 평균과 최고점수, 최저점수를
    // 저장하는 변수 초기화하기
    float average = 0F;
    int max = 0, min = 0;

    // for 문 작성하기
    // 3 번 반복을 하면서 각과목의 성적을
    // 위에서 생성한 배열에 저장하고
    //  ㄴ index 0 ~ 2
    // 마지막 index 에는 이 점수들을 누적 덧셈을 해서
    // 총점이 저장되도록 함
    // for 문 안에서 if 절을 사용해서
    // 입력되는 성적들로 최고점수와 최저점수를 구함
    //     ㄴ 최고점수를 저장하는 변수와
    //     ㄴ 최저점수를 저장하는 변수에 저장함

    for(int i = 0; i < scores.length - 1; i++){
      System.out.printf("%d 번째 성적을 입력하세요 : ", i+1);
      scores[i] = sc.nextInt();

      // 마지막 index 총점 저장하기 : 누적덧셈
      scores[scores.length-1] += scores[i];

      // 최고성적, 최저성적 구하기
      if(i == 0){
        max = min = scores[i];
      }else{
        if(scores[i] > max){
          max = scores[i];
        }else if(scores[i] < min){
          min = scores[i];
        }
      } // if-else
    } // for

    // 평균 계산하기
    average = scores[scores.length-1] / (float)(scores.length-1);

    // 총점, 평균, 최고점수, 최저점수 출력하기
    System.out.printf("총점 : %d 점, 평균 : %.2f 점%n", scores[scores.length-1], average);
    System.out.printf("최고점수 : %d 점, 최저점수 : %d 점", max, min);


  }
}
