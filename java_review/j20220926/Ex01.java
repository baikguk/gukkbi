public class Ex01 {
  public static void main(String[] args){
    // 1부터 10까지의 합

    // for
    int sum = 0;
    int i;
    for(i = 1; i <= 10; i++){
      sum+= i;
    }
    System.out.printf("1부터 %d까지의 합은 %d입니다%n", i-1, sum);
    System.out.println("---------------------------------");

    // while
    sum = 0;
    i = 1;
    while(i <= 10){
      sum += i;
      i++;
      System.out.printf("1부터 %d까지의 합은 %d입니다%n", i-1, sum);
    }
    System.out.println("---------------------------------");
    System.out.printf("1부터 %d까지의 합은 %d입니다%n", i-1, sum);

  }
}
