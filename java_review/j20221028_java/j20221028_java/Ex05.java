public class Ex05 {
  public static void main(String[] args){
    RunnableImpl1 r = new RunnableImpl1();
    Thread thrd1 = new  Thread(r, "*");
    Thread thrd2 = new  Thread(r, "**");
    Thread thrd3 = new  Thread(r, "***");

    thrd1.start();
    thrd2.start();
    thrd3.start();

    try {
      Thread.sleep(2000);
      // thrd1 thread 를 잠시 중단시킴
      thrd1.suspend();
      Thread.sleep(2000);
      // thrd2 thread 를 잠시 중단시킴
      thrd2.suspend();
      Thread.sleep(3000);
      // thrd1 thread 를 다시 동작시킴
      thrd1.resume();
      // thrd1 thread 를 강제 종료시킴
      thrd1.stop();
      // thrd2 thread 를 강제 종료시킴
      thrd2.stop();
      Thread.sleep(2000);
      // thrd3 thread 를 강제 종료시킴
      thrd3.stop();
    } catch (InterruptedException e) { }

    System.out.println("프로그램 종료");
  } // main
}

class RunnableImpl1 implements Runnable{
  @Override
  public void run(){
    while(true){
      System.out.println("[" + Thread.currentThread().getName() + "]");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) { }
    }
  } // run
}
