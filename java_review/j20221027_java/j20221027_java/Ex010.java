import javax.swing.*;

public class Ex010 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");

    ThreadClass5 t5 = new ThreadClass5();
    t5.start();

    String input = JOptionPane.showInputDialog("값을 입력하세요");
    System.out.println("입력하신 값은 " + input + " 입니다");

    System.out.println("프로그램 종료");
  }
}
class ThreadClass5 extends Thread{
  @Override
  public void run(){
    for(int i = 10; i > 0; i--){
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) { }
    } // for
  }
}
