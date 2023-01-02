import javax.swing.*;

public class Ex09 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");

    String input = JOptionPane.showInputDialog("값을 입력하세요");
    System.out.println("입력하신 값은 " + input + " 입니다");

    for(int i = 10; i > 0; i--){
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) { }
    } // for

    System.out.println("프로그램 종료");
  }
}
