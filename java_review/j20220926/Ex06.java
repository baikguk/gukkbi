import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args){
    /*
      do-while 문을 사용해서
      숫자 맞히기 게임을 작성하세요
      숫자를 맞히면 반복을 종료합니다

      computer 가 1에서 100까지의 임의의 숫자를
      발생시켜면 이를 맞히는 게임입니다

      computer 가 발생시킨 숫자보다 큰 숫자를 입력하면
      더 작은 수를 입력하세요 를 출력하고
      computer 가 발생시킨 숫자보다 작은 숫자를 입력하면
      더 큰 수를 입력하세요 를 출력하고
      숫자를 맞히면
      맞히셨습니다 !!!
      프로그램을 종료합니다
      를 출력하고 종료하세요
    */
    int user = 0;
    int computer = 0;

    computer = (int)(Math.random() * 100) + 1;
    Scanner sc = new Scanner(System.in);

    do{
      System.out.print("1 부터 100까지의 정수 중 하나를 입력하세요 \n : ");
      user = sc.nextInt();

      if(user > computer){
        System.out.println("더 작은 수를 입력하세요");
      }else if(user < computer){
        System.out.println("더 큰 수를 입력하세요");
      }
    }while(user != computer);

    System.out.println("맞히셨습니다 !!!");
    System.out.println("프로그램 종료");
  }
}
