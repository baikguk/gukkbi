public class Ex08 {
  static long startTime = 0;

  public static void main(String[] args){
    startTime = System.currentTimeMillis();

    ThreadClass4 t4 = new ThreadClass4();
    t4.start();

    for(int i = 0; i < 50000; i++){
      System.out.printf("%s", new String("-"));
    }
    System.out.print("소요시간1 : " + (System.currentTimeMillis() - Ex08.startTime));

  }
}
class ThreadClass4 extends Thread{
  @Override
  public void run(){
    for(int i = 0; i < 50000; i++){
      System.out.printf("%s", new String("|"));
    }
    System.out.print("소요시간2 : " + (System.currentTimeMillis() - Ex08.startTime));
  }
}





