public class Ex10 {
  public static void main(String[] args){

    int[] scores = new int[5];
    int k = 1;

    // 배열의 각 index 공간은
    // 해당 type 의 변수 공간이라고
    // 생각할 수 있음
    scores[0] = 50;
    scores[1] = 60;
    scores[k+1] = 70;
    scores[3] = 80;
    scores[4] = 90;

    for(int i = 0; i < scores.length; i++){
      System.out.printf("%d ", scores[i]);
    }
    System.out.println("\n--------------------");

    int number = scores[2+k] + scores[4];
    System.out.println("number : " + number);

    // java.lang.ArrayIndexOutOfBoundsException
    // System.out.printf("scores[%d] : %d%n", 5, scores[5]);

  }
}
