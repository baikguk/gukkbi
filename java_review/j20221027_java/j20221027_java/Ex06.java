public class Ex06 {
  public static void main(String[ ]args){
    System.out.print("[" + Thread.currentThread().getName() + "] ");
    for(int i = 0; i < 10000; i++){
      System.out.print("♥");
    }

    Runnable r =  new ThreadClass3();
    Thread t = new Thread(r);
    t.start();

    for(int i = 0; i < 10000; i++){
      System.out.print("♡");
    }

  }
}
class ThreadClass3 implements Runnable{
  @Override
  public void run(){
    System.out.print("[" + Thread.currentThread().getName() + "] ");
    for(int i = 0; i < 10000; i++){
      System.out.print("☏");
    }
  }
}
