public class Ex01 {
  public static void main(String[] args){

    /*
      크기가 50 인 int type 배열을 생성하고
      각 인덱스에 1 부터 50 까지 저장한 후
      출력하는 프로그램을 작성하세요
      (for 문 사용)
    */
    int[] numbers = new int[50];

    for(int i = 0; i < 50; i++){
      System.out.println(i);
      numbers[i] = ++i;
      System.out.println(i);
      System.out.println(numbers[i]);
      System.out.println("----------");
    }
    System.out.println("===================");

    int increase = 0;
    for(int i = 0; i < 50; i++){
      numbers[i] = ++increase;
      System.out.printf("%d ", numbers[i]);
    }
    System.out.println("\n===================");

    numbers = new int[50];
    increase = 0;
    int idx = 0;
    for(int num : numbers ){
      numbers[idx] = ++increase;
      System.out.printf("%d ", numbers[idx]);
      ++idx;
    }


  }

}
