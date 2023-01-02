public class Ex03 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");
    System.out.println(1);
    System.out.println(2);
    try{
      System.out.println(3);
      System.out.println(4);
    }catch(Exception e){
      // 예외가 발생하지 않으면 catch 블럭은 실행되지 않음
      System.out.println(5);
    }
    System.out.println(6);
    System.out.println("프로그램 종료");
  }
}
