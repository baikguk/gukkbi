public class Ex07 {
  public static void main(String[] args){
    long start = System.currentTimeMillis();

    for(int i = 0; i < 50000; i++){
      System.out.printf("%s", new String("-"));
    }
    System.out.print("소요시간1 : " + (System.currentTimeMillis() - start));

    for(int i = 0; i < 50000; i++){
      System.out.printf("%s", new String("|"));
    }
    System.out.print("소요시간2 : " + (System.currentTimeMillis() - start));

  }
}
