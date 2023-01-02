public class Ex02 {
  public static void main(String[] args){
    Thread1 thrd1 = new Thread1();
    Thread2 thrd2 = new Thread2();

    thrd1.start();
    thrd2.start();

    /*
      thrd1.sleep(2000) <-- 이렇게 호출해도
      thrd1 에서 sleep() 을 호출해도
      현재 sleep() 을 호출하는 메소드의 Thread 가 sleep() 에 의해서
      일시정지상태(WAITING) 가 됨
      결국, main thread, thred1, thred2 중에서
      main thread 가 2 초 지연되어 맨 마지막에 종료함
    */
    try {
      // thrd1.sleep(2000);
      Thread.sleep(2000);
    } catch (InterruptedException e) {   }

    System.out.println("[main thread 종료]");

  }
}
class Thread1 extends Thread{
  @Override
  public void run(){
    for(int i = 0; i < 300; i++){
      System.out.print("-");
    }
    System.out.println("[thrd1 thread 종료]");
  }
}
class Thread2 extends Thread{
  @Override
  public void run(){
    for(int i = 0; i < 300; i++){
      System.out.print("|");
    }
    System.out.println("[thrd2 thread 종료]");
  }
}