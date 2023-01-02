public class Ex11 {
  public static void main(String[ ]args){
    new Gugudan();
    new Gugudan(5);
  }
}
class Gugudan{
  public Gugudan(){
    // 구구단 전체를 출력하는 메소드 호출하기
    printGugudan();
  }
  public Gugudan(int dan){
    // 구구단 중 지정한 단만 출력하는 메소드 호출하기
    printGugudan(dan);
  }

  // 구구단 전체를 출력하는 메소드
  public void printGugudan(){
    for(int dan = 2; dan <= 9; dan++ ){
      System.out.printf("-- %d 단 --%n", dan);
      for(int number = 1; number <= 9; number++){
        System.out.printf("%d X %d  = %d%n", dan, number, dan * number);
      }
      System.out.println();
    }
  }
  // 구구단 중 지정한 단만 출력하는 메소드
  public void printGugudan(int dan){
    System.out.printf("-- %d 단 --%n", dan);
    for(int number = 1; number <= 9; number++){
      System.out.printf("%d X %d  = %d%n", dan, number, dan * number);
    }

  }


}







