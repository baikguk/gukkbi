public class Ex13 {
  public static void main(String[ ]args){
    System.out.println("프로그램 시작");
    method1();
    System.out.println("method1()의 수행을 마치고 main()으로 return 함");
    System.out.println("프로그램 종료");
  } // main
  static void method1(){
    try{
      System.out.println("method1() 이 호출됨");
      return;
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      System.out.println("method1() 의 finally 블럭이 실행됨");
    }
  } // method1
}
