public class Ex18 {
  public static void main(String[] args){
    // 5행 5열 출력하기
    for(int i = 1; i <= 5; i++){
      for(int j = 1; j <= 5; j++){
        System.out.printf("[%d,%d]", i, j);
      }
      System.out.println();
    }
    System.out.println("=========================");


    for(int i = 1; i <= 5; i++){
      for(int j = 1; j <= 5; j++){
        if(i == j) {
          System.out.printf("[%d,%d]", i, j);
        }else{
          System.out.printf("%s", "     ");
          // System.out.print("     ");
        }
      }
      System.out.println();
    }


  }
}
