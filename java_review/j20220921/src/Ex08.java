public class Ex08 {
  public static void main(String[] args){

    // 두 변수에 할당된 값을 서로 바꾸기
    // swapping

    int num1 = 11;
    int num2 = 22;
    System.out.printf("num1 : %d, num2 : %d%n", num1, num2);

    /*
    num1 에 할당된 11을 num2에 할당하면 num2 에는 11이 할당됨
    num2 = num1;
    num2 에 할당된 11을 num1 에 할당하면 num1 에는 11이 할당됨
    num1 = num2;
    System.out.printf("num1 : %d, num2 : %d%n", num1, num2);
   */

    // cup 은 선언만 하고 할당을 하지 않아서 현재 비어있음
    int cup;
    // num1 에 할당된 11을 cup 에 할당하면 cup 에는 11이 할당됨
    cup = num1;
    // num2 에 할당된 22를 num1 에 할당하면 num1 에는 22 가 할당됨
    num1 = num2;
    // cup 에 할당된 값 11 을 num2 에 할당하면 num2 에는 11 이 할당됨
    // 결국, num1 에는 22, num2 에는 11이 할당되어서 값이 서로 바뀌게 됨
    num2 = cup;
    System.out.printf("num1 : %d, num2 : %d%n", num1, num2);

  }
}
