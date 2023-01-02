public class Ex09 {
  public static void main(String[ ] args){
    // String[] args 에 숫자1, 연산부호, 숫자2 를 받음
    if(args.length != 3){
      System.out.println("숫자1, 연산부호, 숫자2 만 입력하세요 \n프로그램 종료");

      // JVM 이 종료함
      System.exit(0);
      // return;
    }
    int num1 = Integer.parseInt(args[0]);
    char op  = args[1].charAt(0);
    int num2 = Integer.parseInt(args[2]);

    int result = 0;

    switch(op){
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case 'x': case 'X':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        System.out.println("연산부호는 + - x(X) / 중에서만 입력해 주세요");
    }

    System.out.printf("%d %c %d = %d%n", num1, op, num2, result);

  }
}
