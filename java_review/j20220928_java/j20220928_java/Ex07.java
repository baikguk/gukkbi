public class Ex07 {
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

    // 변수 swapping 을 사용해서
    // 0 번 index 에 있는 값을
    // 임의의 index 에 있는 값과 서로 바꿈
    //  ㄴ index는 arrNums 배열의 index 범위에서만 지정해야 함
    // swapping 하는 횟수는 임의로 정하면 됨
    //  ㄴ 1000 번으로 하는 경우
    int loopNum = 1000;
    for(int i = 0; i < loopNum; i++){
      // arrNums 배열의 index 범위에서 임의의 index 지정하기
      int idx = (int)(Math.random() * 10);

      // 임의로 얻은 idx 를 index 로 사용해서
      // 0 번째 index 에 있는 값과
      // idx 번째 index 에 있는 값을 서로 바꿈
      // swapping
      int cup = arrNums[0];
      arrNums[0] = arrNums[idx];
      arrNums[idx] = cup;
    }
    // 결과 확인하기
    for(int i = 0; i < arrNums.length; i++){
      System.out.printf("%d ", arrNums[i]);
    }
    // System.out.println("\n========================");

  }
}
