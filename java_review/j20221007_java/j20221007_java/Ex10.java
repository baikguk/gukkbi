public class Ex10 {
  public static void main(String[] args){
    int[] arrInt = new int[]{3, 2, 1, 6, 5, 4};

    printArray(arrInt);
    sumArray(arrInt);

    System.out.println("---------------------------");
    int returnValue = sumArray(arrInt, 0);
    System.out.println("배열 arrInt 요소들의 합 : " + returnValue);
    System.out.println("---------------------------");

    sortArray(arrInt);
    printArray(arrInt);

  }

  public static void sortArray(int[] arrInt){
    for (int i = 0; i < arrInt.length - 1; i++) {
      for (int j = 0; j < arrInt.length - 1 - i; j++) {
        if (arrInt[j] > arrInt[j + 1]) {
          int cup = arrInt[j];
          arrInt[j] = arrInt[j + 1];
          arrInt[j + 1] = cup;
        } // if
      } // inner for
    } // outer for
  }


  public static void sumArray(int[] arrInt){
    int sum = 0;
    for (int i = 0; i < arrInt.length; i++) {
      sum += arrInt[i];
    }
    System.out.println("arrInt 배열의 요소들의 합 : " + sum);
  }

  public static int sumArray(int[] arrInt, int sum){
    for (int i = 0; i < arrInt.length; i++) {
      sum += arrInt[i];
    }
    // System.out.println("arrInt 배열의 요소들의 합 : " + sum);
    return sum;
  }

  public static void printArray(int[] arrInt){
    for (int number : arrInt) {
      System.out.printf("%d ", number);
    }
    System.out.println("\n---------------------------");
  }




}
