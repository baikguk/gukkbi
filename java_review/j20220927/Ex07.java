public class Ex07 {
  public static void main(String[] args){
    /*
      배열 : data 를 여러 개 저장하는 (메모리) 공간
             저장된 data 의 type 이 모두 일치해야 함
             배열공간에서는 data 가 서로 인접해 있음

      1) 배열 생성
      2) 배열 변수 선언(생성)
      3) 생성된 배열을 배열 변수에 할당함

    */

    // 배열 생성
    int[] numbers = new int[5];

    System.out.println("numbers[0] : " + numbers[0]);
    System.out.println("numbers[1] : " + numbers[1]);
    System.out.println("numbers[2] : " + numbers[2]);
    System.out.println("numbers[3] : " + numbers[3]);
    System.out.println("numbers[4] : " + numbers[4]);

    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;

    System.out.println("numbers[0] : " + numbers[0]);
    System.out.println("numbers[1] : " + numbers[1]);
    System.out.println("numbers[2] : " + numbers[2]);
    System.out.println("numbers[3] : " + numbers[3]);
    System.out.println("numbers[4] : " + numbers[4]);

    // 배열의 요소값들 출력하기
    for(int i = 0; i < 5; i++){
      System.out.println("numbers[" + i + "] : " + numbers[i]);
      System.out.printf("numbers[%d] : %d%n", i, numbers[i]);
    }

    // 배열의 각 index 에 값 입력하기
    int num = 0;
    for(int i = 0; i < 5; i++){
      numbers[i] = ++num;
      System.out.printf("numbers[%d] : %d%n", i, numbers[i]);
    }

    // 배열의 각 index 에
    // 1 부터 5 까지 의 숫자 중
    // 임의의 정수를 저장하기
    for(int i = 0; i < 5; i++){
      numbers[i] = (int)(Math.random() * 5) + 1;
      // System.out.printf("numbers[%d] : %d%n", i, numbers[i]);
      System.out.printf("%d ", numbers[i]);
    }
    System.out.println("\n------------------------");

    // 배열의 크기 - 배열 내부에 있는 data 의 개수
    // 배열변수.length
    // cf) String -> str1.length()
    System.out.println("\nnumbers.length : " + numbers.length);
    System.out.println("------------------------");

    for(int i = 0; i < numbers.length ; i++){
      numbers[i] = (int)(Math.random() * 5) + 1;
      // System.out.printf("numbers[%d] : %d%n", i, numbers[i]);
      System.out.printf("%d ", numbers[i]);
    }
    System.out.println("\n------------------------");

    // 향상된 for 문
    // advanced for loop
    for(int number : numbers){
      System.out.printf("%d ", number);
    }
    System.out.println("\n------------------------");

  }
}
