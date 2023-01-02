public class Ex02 {
  public static void main(String[] args){
    int i = 0;
    while(i <= 10){
      System.out.print(i + " ");
      i++;
    }
    System.out.println("\n------------------------");

    // 아래 code 를 1 부터 10까지 출력하는
    // while 문으로 수정하세요
    i = 0;
    while(i < 10){
      i++;
      System.out.print(i + " ");
    }
    System.out.println("\n------------------------");

    i = 1;
    while(i <= 10){
      System.out.print(i + " ");
      i++;
    }
    System.out.println("\n------------------------");

    // 10 부터 1 까지 출력하는 while 문으로 수정하세요
    i = 10;
    while(i > 0){
      System.out.print(i + " ");
      i--;
    }
    System.out.println("\n------------------------");

    i = 10;
    while(i >= 0){
      System.out.print(i + " ");
      i--;
    }
    System.out.println("\n------------------------");

  }
}
