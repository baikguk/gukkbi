public class Ex07 {
  public static void main(String[] args)  {
    try {
      Exception e = new Exception("예외를 고의로 발생시킴");
      // 예외를 발생시킴
      throw e;
    }catch(Exception e){
      System.out.println("예외 메세지 : " + e.getMessage());
    }
    System.out.println("프로그램이 정상적으로 종료됨");
  }
}
