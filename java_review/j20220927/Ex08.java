public class Ex08 {
  public static void main(String[] args){

    // 배열 생성 + 배열 변수 선언과 할당 + 배열의 초기화
    // 모두 한 줄에 작성하는 경우에는 new int[] 를 생략할 수 있음
    // int[] numbers = new int[]{1, 2, 3, 4, 5};
    int[] numbers = {1, 2, 3, 4, 5};

    for(int i = 0; i < numbers.length; i++){
      System.out.printf("%d ", numbers[i]);
    }
    System.out.println("\n--------------------------");

    //배열 변수 선언과 (배열의 생성 + 배열의 초기화 및 할당)
    // 따로 하는 경우에는 new int[] 부분을 생략할 수 없음
    int[] numbers2;
    numbers2 = new int[]{11, 22, 33, 44, 55};

    for(int i = 0; i < numbers2.length; i++){
      System.out.printf("%d ", numbers2[i]);
    }
    System.out.println("\n-----------------------------");

    for(int num : numbers2){
      System.out.printf("%d ", num);
    }
    System.out.println("\n-----------------------------");


    // 따로 하는 경우에는 new int[] 부분을 생략할 수 없음
    int[] numbers3;
    // numbers3 = {11, 22, 33, 44, 55};


  }
}
