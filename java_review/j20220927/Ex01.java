public class Ex01 {
  public static void main(String[] args){
    /*
      for 문에서 level 있는 break 사용하기
      level 이 있는 code block 을 벗어남
    */

    stop: for(int dan = 2; dan <= 9; dan++){
      System.out.printf("-- %d 단 --\n", dan);
      for(int number = 1; number <= 9; number++){
        if(number == 5){
          break stop;
        }
        System.out.printf("%d X %d = %d%n", dan, number, dan * number);
      }
      System.out.println();
    }
  }
}
