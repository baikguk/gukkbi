public class Ex01 implements Runnable{
  static boolean autoSave = false;
  /*
     데몬 쓰레드 : Daemon Thread - 일반 thread 에 종속됨
       ㄴ 일반 thread 의 작업을 돕는 보조적인 역할을 수행함
          일반 thread 가 종료되면 자동으로 종료됨
          Garbage Collector, auto save 들에 사용됨
  */
  public static void main(String[] args){
    System.out.println("(main Thread)프로그램 시작");

    Thread thrd1 = new Thread(new Ex01());
    // thrd1 의 thread 를 Daemon Thread 로 설정함
    thrd1.setDaemon(true);
    thrd1.start();

    for(int i = 1; i <= 10; i++){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) { }
      System.out.println(i);
      if(i == 5){
        autoSave = true;
      }
    }
    System.out.println("(main Thread)프로그램 종료");

  }

  @Override
  public void run(){
    while(true){
      try {
        Thread.sleep(3 * 1000);
      } catch (InterruptedException e) { }

      // static member variable autoSave 가 true 일 때만
      // autoSave() 메소드를 호출함
      if(autoSave){
        autoSave();
      }
    }
  }

  public void autoSave(){
    System.out.println("자동저장됨");
  }




}

