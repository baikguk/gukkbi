public class Ex09 {
  public static void main(String[] args){

    // 변수 공간에 할당된 값을 1 증가시키기
    int number = 10;
    System.out.printf("number : %d%n", number);

    number = number + 1;
    System.out.printf("number : %d%n", number);

    // 복합할당연산자
    number += 1;
    System.out.printf("number : %d%n", number);

    // 증가연산자 : ++
    number++;
    System.out.printf("number : %d%n", number);

    ++number;
    System.out.printf("number : %d%n", number);
    System.out.println("-----------------------");

    // 변수 공간에 할당된 값을 1 감소시키기
    number = number - 1;
    System.out.printf("number : %d%n", number);

    // 복합할당연산자
    number -= 1;
    System.out.printf("number : %d%n", number);

    // 증가연산자 : ++
    number--;
    System.out.printf("number : %d%n", number);

    --number;
    System.out.printf("number : %d%n", number);
    System.out.println("-----------------------");


  }
}
