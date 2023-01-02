import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args){
    // 가위(1), 바위(2), 보(3) 게임

    int computer = 0;
    int person   = 0;

    String strCom = "";
    String strPson = "";

    Scanner sc = new Scanner(System.in);
    System.out.print("가위, 바위, 보 중에서 하나를 입력하세요 : ");
    strPson = sc.next();

    if(strPson.equals("가위")){
      person = 1;
    }else if(strPson.equals("바위")){
      person = 2;
    }else if(strPson.equals("보")){
      person = 3;
    }else{
      person = 10;
    }

    computer = (int)(Math.random() * 3) + 1;

    if(computer == 1){
      strCom = "가위";
    }else if(computer == 2){
      strCom = "바위";
    }else if(computer == 3){
      strCom = "보";
    }

    /*
      가위(1), 바위(2), 보(3) 게임

      person     -      computer            winner
        1                 3         -2      person
        2                 1          1      person
        3                 2          1      person
     -------------------------------------------------
        1                 2         -1      computer
        2                 3         -1      computer
        3                 1          2      computer

    */
    int result = person - computer;

    switch(result){
      case 1: case -2:
        System.out.println("당신이 이겼습니다");
        System.out.printf("사람 : %s, 컴퓨터 : %s%n", strPson, strCom);
        break;
      case 2: case -1:
        System.out.println("컴퓨터가 이겼습니다");
        System.out.printf("사람 : %s, 컴퓨터 : %s%n", strPson, strCom);
        break;
      case 7: case 8: case 9:
        System.out.println("가위 바위 보 중에서만 입력하세요");
        break;
      default:
        System.out.println("서로 비겼습니다");
        System.out.printf("사람 : %s, 컴퓨터 : %s%n", strPson, strCom);
    }

  }
}
