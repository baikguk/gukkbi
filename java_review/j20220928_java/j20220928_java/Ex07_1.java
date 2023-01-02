import java.util.Arrays;

public class Ex07_1 {
  public static void main(String[] args){
    /*
      크기가 10 인 int type 의 배열을 생성하고
      0 부터 9까지의 정수로 초기화하고 (<-- for 문 사용)
      이 배열의 요소(item)들을 서로 섞음
    */
    int[] arrNums = new int[10];

    for(int i = 0; i < arrNums.length; i++){
      arrNums[i] = i;
      System.out.printf("%d ", arrNums[i]);
    }
    System.out.println("\n------------------------------");

    int loopNum = 1000;
    for(int i = 0; i < loopNum; i++){
      int idx1 = (int)(Math.random() * 10);
      int idx2 = (int)(Math.random() * 10);

      // 0 번째 index 에 있는 숫자와
      // 다른 index 에 있는 숫자들끼리 바꾸는 것이 아니고
      // 서로 다른 index 에 있는 숫자들끼리 바꾸기
      int cup = arrNums[idx1];
      arrNums[idx1] = arrNums[idx2];
      arrNums[idx2] = cup;
    }
    // 결과 확인하기
    for(int i = 0; i < arrNums.length; i++){
      System.out.printf("%d ", arrNums[i]);
    }
    System.out.println("\n========================");

    // 배열 출력할 때 Arrays.toString(배열) 사용하기
    System.out.println(Arrays.toString(arrNums));

  }
}
