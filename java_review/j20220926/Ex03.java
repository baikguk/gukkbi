import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args){
    /*
      입력받은 숫자를 각 자릿수를
      모두 더한 합계 구하기

      [HINT]
      1) charAt(인덱스)
      2) %
    */
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요 (예: 654321) : ");
    String strNumber = sc.next();

    // 문자열의 길이 : 문자열.length() <- 반복문 반복 횟수
    // 문자열.charAt(인덱스)
    // 54 - 48 + 53 - 48 + 52 - 48 + 51 - 48 + 50 - 48 + 49 - 48
    /*
    int sum = strNumber.charAt(0) + strNumber.charAt(1) + strNumber.charAt(2) +
              strNumber.charAt(3) + strNumber.charAt(4) + strNumber.charAt(5);
    */
    // for 문으로 작성하세요
    // 1) 반복횟수 : strNumber.length()
    int sum = 0;
    for(int i = 0; i < strNumber.length(); i++){
      sum += strNumber.charAt(i) - '0';
    }

    // while 문으로 작성하세요
    sum = 0;
    int i = 0;
    while(i < strNumber.length()){
      sum += strNumber.charAt(i) - '0';
      i++;
    }
    System.out.println("입력한 숫자 : " + strNumber);
    System.out.println("각 자릿수들의 합 : " + sum);

    // strNumber(String type) 를 int type 으로 변환해서 함
    // Integer.parseInt(숫자(정수)모양의 문자열)
    // 2) % 연산자와 / 연산자 사용하기
    // 어떤 수를 10 으로 나눈 나머지는 항상 1의 자리의 숫자가 됨
    System.out.print("정수를 입력하세요 (예: 654321) : ");
    String strNumber2 = sc.next();
    int number = Integer.parseInt(strNumber2);
    sum = 0;
    while(number != 0){
      sum += number % 10;
      number /= 10;
    }
    System.out.println("입력한 숫자 : " + strNumber2);
    System.out.println("각 자릿수들의 합 : " + sum);
  }
}
