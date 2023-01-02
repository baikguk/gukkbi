public class Ex09 {
  public static void main(String[] args){

    // 1 부터 10 까지 출력하는 for 문을 작성하세요
    for(int i = 1;i <= 10;i++){
      System.out.printf("%d ", i);
    }
    System.out.println("\n-----------------------------");

    for(int i = 1;i < 10;i++){
      System.out.printf("%d ", i);
    }
    System.out.println("\n-----------------------------");

    for(int i = 1;i < 11;i++){
      System.out.printf("%d ", i);
    }
    System.out.println("\n-----------------------------");

    // 홀수만 출력하세요
    for(int i = 1;i < 11;i += 2){
      System.out.printf("%d ", i);
    }
    System.out.println("\n-----------------------------");

    // 짝수만 출력하세요
    for(int i = 2;i < 11;i += 2){
      System.out.printf("%d ", i);
    }
    System.out.println("\n-----------------------------");

    for(int i = 1;i <= 10;i++){
      if (i % 2 == 1) {
        System.out.printf("%d ", i);
      }
    }
    System.out.println("\n-----------------------------");

    for(int i = 1;i <= 10;i++){
      if (i % 2 == 0) {
        System.out.printf("%d ", i);
      }
    }
    System.out.println("\n-----------------------------");

  }
}
