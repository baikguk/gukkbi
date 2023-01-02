public class Ex10 {
  public static void main(String[] args){
    /*
       증가(감소) 연산자가 단독으로 쓰일 때는
       변수 앞에 있으나 뒤에 있으나 결과가 같지만,
       다른 연산자와 같이 사용하면 결과가 달라짐

       전치 증가(감소) 연산자 : 먼저 증가한 후 다른 연산을 함
       후치 증가(감소) 연산자 : 다른 연산을 하고나서 증가함

    */
    int number1 = 10;
    int number2 = ++number1;
    System.out.printf("number1 : %d, number2 : %d%n", number1, number2);

    int number3 = 20;
    int number4 = number3++;
    System.out.printf("number3 : %d, number4 : %d%n", number3, number4);

    System.out.println("-----------------------------");

    int num = 10;
    System.out.printf("%d%n", ++num);
    System.out.printf("%d%n", num++);
    System.out.printf("%d%n", num);

    System.out.printf("%d %d %d %d %d %d%n", num++, ++num, num--, num++, ++num, num);

  }
}
