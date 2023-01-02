import java.util.Random;

public class Ex11 {
  public static void main(String[] args){
    Random rand1 = new Random();
    int[] number = new int[100];
    int[] counter = new int[10];

    for(int i = 0; i < number.length; i++){
      // 0 부터 10 미만의 임의의 정수 반환하기
      // (int)(Math.random() * 10)
      System.out.print(number[i] = rand1.nextInt(10));
    }
    System.out.println("\n--------------------------");

    for(int i = 0; i < number.length; i++){
      counter[number[i]]++;
    }

    for(int i = 0; i < counter.length; i++){
      System.out.println(i + " 의 개수 : " + printSharp('#', counter[i]) + " - " + counter[i] + " 개");
    }

    // String result = printSharp('#', 10);
    // System.out.println("result : " + result);

  } // main
  public static String printSharp(char ch, int num){
    char[] sharps = new char[num];
    for(int i = 0; i < sharps.length; i++){
      sharps[i] = ch;
    }
    return new String(sharps);
  }

}
