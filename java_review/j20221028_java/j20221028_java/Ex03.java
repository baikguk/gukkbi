import javax.swing.*;

public class Ex03 {
  public static void main(String[] args){
    Thread3 thrd3 = new Thread3();
    thrd3.start();

    // 카운트다운 도중에 값을 입력하면 카운트다운이 종료함
    String input = JOptionPane.showInputDialog("값을 입력하세요");
    System.out.println("입력값은 " + input + " 입니다");

    // interrupt() 를 호출하면
    // interrupted 상태가 true 가 됨
    thrd3.interrupt();
    System.out.println("isInterripted() : " + thrd3.isInterrupted());

  }
}
class Thread3 extends Thread{
  @Override
  public void run(){
    int i = 10;
    while(i != 0 && !isInterrupted()){
      System.out.println(i--);
      for(long j = 0; j < 2500000000L; j++);
    }
    System.out.println("카운트다운 종료");
  }
}
