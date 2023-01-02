import java.util.Arrays;

public class Ex01 {
  public static void main(String[] args){

    // lotto 번호 생성하기
    int[] lotto = new int[45];

    // for 문을 사용해서 lotto 에
    // 1 ~ 45 까지의 정수를 저장하고 출력하세요
    for(int i = 0; i < lotto.length; i++){
      lotto[i] = i + 1;
      System.out.printf("%d ", lotto[i]);
    }
    System.out.println("\n--------------------------------");
    System.out.println(Arrays.toString(lotto));
    System.out.println("--------------------------------");

    // lotto 에 1 ~ 45 까지의 정수 중에서
    // 임의의 숫자를 저장하세요
    // Math.random() 사용
    for(int i = 0; i < lotto.length; i++){
      lotto[i] = (int)(Math.random() * 45) + 1;
      System.out.printf("%d ", lotto[i]);
    }
    System.out.println("\n--------------------------------");
    System.out.println("lotto.length : " + lotto.length);

    System.out.println("lotto 번호 (처음부터 6 개)");
    for(int i = 0; i < 6; i++){
      System.out.printf("%d ", lotto[i]);
    }
    System.out.println();
    System.out.println("lotto 번호 (중간 6 개)");
    int start = (int)(Math.random() * 45);
    if (start <= 40) {
      int end = start + 6;
      for (int i = start; i < end; i++) {
        System.out.printf("%d ", lotto[i]);
      }
    }
    System.out.println("\n--------------------------------");

    for(int i = 0; i < lotto.length; i++){
      lotto[i] = i + 1;
    }

    // 1 부터 45 가 저장된 lotto 의
    // 각 item 들의 값을 서로 섞으세요
    for(int i = 0; i < lotto.length; i++){
      System.out.printf("%d ", lotto[i]);
    }
    System.out.println("\n-------------------------------");

    for(int i = 0; i < 10000; i++){
      int idx1 = (int)(Math.random() * 45);
      int idx2 = (int)(Math.random() * 45);

      int cup = lotto[idx1];
      lotto[idx1] = lotto[idx2];
      lotto[idx2] = cup;
    }

    System.out.println("lotto 번호 (처음부터 6 개)");
    for(int i = 0; i < 6; i++){
      System.out.printf("%d ", lotto[i]);
    }
    System.out.println();
    System.out.println("lotto 번호 (중간 6 개)");
    start = (int)(Math.random() * 45);
    if (start <= 40) {
      int end = start + 6;
      for (int i = start; i < end; i++) {
        System.out.printf("%d ", lotto[i]);
      }
    }

  }
}
