/*
  program
  process : 실행 중인 프로그램 <- 자원(source) + thread 로 구성됨
  thread  : process 내에서 실제 작업을 수행하는 물리적인 흐름
            모든 process 는 하나 이상의 thread 를 가지고 있음

  single thread process
    ㄴ source + thread

  multi thread process
    ㄴ source + thread + thread + ... + thread

    Thread 클래스 작성
    1) Thread 클래스를 상속함
    2) Runnable 인터페이스를 상속함

*/

public class Ex05 {
  public static void main(String[] args){
    ThreadClass1 t1 = new ThreadClass1();
    t1.start();

    System.out.println("[main thread : " + Thread.currentThread().getName() + "] ");
    for(int i = 0 ; i < 3000; i++){
      System.out.print("♧");
    }

    ThreadClass2 t2 = new ThreadClass2();
    t2.start();

  }
}

// 1) Thread 클래스를 상속하는 방법
class ThreadClass1 extends Thread{
  @Override
  public void run(){
    System.out.println("\n[ThreadClass1 thread : " + Thread.currentThread().getName() + "] ");
    for(int i = 0 ; i < 3000; i++){
      System.out.print("♣");
    }
  }
}
class ThreadClass2 extends Thread{
  @Override
  public void run(){
    System.out.println("\n[ThreadClass2 thread : " + Thread.currentThread().getName() + "] ");
    for(int i = 0 ; i < 3000; i++){
      System.out.print("◎");
    }
  }
}





