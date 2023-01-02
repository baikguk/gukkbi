import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex12 {
  public static Queue q1 = new LinkedList();
  public static final int MAX_SIZE = 5;

  public static void main(String[] args){
    System.out.println("help 를 입력하면 도움말을 볼 수 있습니다");

    while(true){
      System.out.print(" >> ");

      try{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        if(input.equals("")){
          continue;
        }
        if(input.equalsIgnoreCase("q")){
          System.out.println("프로그램을 종료합니다");
          System.exit(0);
        }else if(input.equalsIgnoreCase("help")){
          System.out.println("help - 도움말을 보여줍니다");
          System.out.println("q / Q 를 입력하면 프로그램을 종료합니다");
          System.out.println("history - 최근에 입력한 명령어 " + MAX_SIZE + " 개를 보여줍니다");
        }else if(input.equalsIgnoreCase("history")){
          System.out.println("입력된 데이터를 보여드립니다");
          System.out.println(q1);
        }else{
          saveItem(input);
          System.out.println(input);
        }
      }catch(Exception e){
        System.out.println("입력을 정확하게 해 주세요");
      }
    } // while

  } // main

  // queue 에 item 저장하기
  public static void saveItem(String input){
    if(!input.equals("")){
      q1.offer(input);
    }
    // MAX_SIZE 만큼만 저장함
    if(q1.size() > MAX_SIZE){
      q1.remove();
    }
  }


} // class
