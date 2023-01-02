import java.util.Arrays;

public class Ex13 {
  public static void main(String[] args){
    /*
      java.util 패키지에 있는 Arrays 클래스
        : 배열을 다루는 여러 메소드들을 정의해 놓은 클래스
    */
    int[] arrInt = new int[]{0, 1, 2, 3, 4};
    int[][] arrInt2D = new int[][]{new int[]{11, 12, 13},
                                   new int[]{21, 22, 23}};

    System.out.println("arrInt   : " + Arrays.toString(arrInt));
    System.out.println("arrInt2D : " + Arrays.toString(arrInt2D));
    System.out.println("arrInt2D : " + Arrays.deepToString(arrInt2D));
    System.out.println("----------------------------");

    int[] arrInt2 = Arrays.copyOf(arrInt, arrInt.length);
    System.out.println("arrInt2 : " + Arrays.toString(arrInt2));

    int[] arrInt3 = Arrays.copyOf(arrInt, 3);
    System.out.println("arrInt3 : " + Arrays.toString(arrInt3));

    int[] arrInt4 = Arrays.copyOf(arrInt, 7);
    System.out.println("arrInt4 : " + Arrays.toString(arrInt4));

    int[] arrInt5 = Arrays.copyOfRange(arrInt, 2, 4);
    System.out.println("arrInt5 : " + Arrays.toString(arrInt5));

    int[] arrInt6 = Arrays.copyOfRange(arrInt, 0, 7);
    System.out.println("arrInt6 : " + Arrays.toString(arrInt6));


  }
}
