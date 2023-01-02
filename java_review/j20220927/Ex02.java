import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int op = 0, num = 0;

    stop:
    while(true){
      System.out.println("1 - 제곱연산");
      System.out.println("2 - 제곱근연산");
      System.out.println("3 - 로그연산");
      System.out.print("연산을 선택하세요 \n(종료는 0) : ");

      op = sc.nextInt();

      if(op == 0){
        System.out.println("전체 프로그램 종료");
        break;
      }else if(!(1 <= op && op <= 3)){
        System.out.println("1 ~ 3 중에서만 선택하세요");
        continue;
      }
      System.out.printf("선택하신 연산은 %d 번 연산입니다%n", op);

      // for 문을 무한반복으로 함
      for( ; ; ){
        System.out.print("계산할 값을 입력하세요 \n(연산종료는 0, 전체종료는 99) : ");
        num = sc.nextInt();

        if(num == 0){
          break;
        }
        if(num == 99){
          break stop;
        }

        switch(op){
          case 1:
            System.out.println("연산결과 : " + num * num);
            break;
          case 2:
            System.out.println("연산결과 : " + Math.sqrt(num));
            break;
          case 3:
            System.out.println("연산결과 : " + Math.log(num));
            break;
        } // switch
      } // for
    } // while
    System.out.println("전체 프로그램 종료");

  }  // main
}  // class
