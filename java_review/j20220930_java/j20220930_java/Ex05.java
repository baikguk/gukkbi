public class Ex05 {
  public static void main(String[] args){

    int[][] scores = {
                      {100, 100, 100},
                      {100,  98,  75},
                      { 76,  84,  92},
                      { 88,  96,  85},
                      { 65,  74,  52},
                      {100, 100,  99}
                    };

    System.out.println("번호 국어 영어 수학 총점 평균");
    System.out.println("================================================");

    // 과목별 총점을 저장하는 변수
    int korTotal = 0;
    int engTotal = 0;
    int matTotal = 0;

    for(int i = 0; i < scores.length; i++){
      // 개인별 총점을 저장하는 변수
      int sum = 0;
      // 개인별 평균을 저장하는 변수
      float average = 0.0F;

      korTotal += scores[i][0];
      engTotal += scores[i][1];
      matTotal += scores[i][2];

      // 학생 번호 출력하기
      System.out.printf("%3d", i+1);

      // 국어 영어 수학 점수 출력하기
      for(int j = 0; j < scores[i].length; j++){
        System.out.printf("%5d", scores[i][j]);
        sum +=  scores[i][j];
      } // inner for


      // 개인별 총점 출력하기
      System.out.printf("%5d  ", sum);

      // 개인별 평균 출력하기
      average = (float)sum / scores[i].length;
      System.out.printf("%5.1f", average);
      System.out.println();
    } // outer for


    System.out.println("================================================");
    System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, matTotal);

  }
}
