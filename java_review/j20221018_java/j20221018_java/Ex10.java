public class Ex10 {
  public static void main(String[] args){
    // 호출한 method1() 에서 예외를 throws 했기 때문에
    // main() 에서 예외 처리를 해야 함
    try {
      method1();
    }catch(Exception e){
      System.out.println("main() 에서 예외 처리함");
    }
  }
  static void method1() throws Exception{
    try{
      throw new Exception();
    }catch(Exception e){
      System.out.println("method1() 에서 예외 처리함");
      // 다시 예외 발생시킴
      throw e;
    }
  }
}
