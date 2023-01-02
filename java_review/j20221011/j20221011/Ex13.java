public class Ex13 {

  // 초기화 블럭 :
  // 1) static 초기화 블럭   static{ }
  //      static 멤버변수가 초기화 되고나서 실행되는 code block
  // 2) instance 초기화 블럭  { }
  //      객체(instance) 가 생성될 때
  //      생성자가 동작하기 전에 실행되는 code block
  // 실행 순서
  // 1) static 멤버변수 초기화 : 기본값으로 초기화되었다가 할당한 값으로 재할당됨
  // 2) static  초기화블럭 실행
  // 3) instance 멤버변수 초기화 : 기본값으로 초기화되었다가 할당한 값으로 재할당됨
  // 4) instance 초기화 블럭 실행
  // 5) 생성자 실행

  public static void main(String[] args){
    System.out.println("InitBlock.cv : " + InitBlock.cv);

    InitBlock ib = new InitBlock();
    System.out.println("ib.iv : " + ib.iv);
    System.out.println("ib.cv : " + ib.cv);
    System.out.println("InitBlock.cv : " + InitBlock.cv);

  }
} // Ex13

class InitBlock{
  static int cv = 1;  // 1) cv - 0, 2) cv - 1
  int iv = 1;         // 4) iv - 0, 5) iv - 1
  static{ cv = 2; }   // 3) cv - 2
  {
    iv = 2; cv = 3;
    System.out.println("iv (instance 초기화블럭) : " + iv);
    System.out.println("cv (instance 초기화블럭) : " + cv);
  } // 6) iv - 2, 7) cv - 3

  public InitBlock(){ // 8) iv - 3, 9) cv - 5
    iv = 3; cv = 5;
  }
}






