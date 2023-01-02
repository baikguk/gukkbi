public class Ex01 {
  public static void main(String[] args){
    try{
      // Exception 이 발생할만한 code
    }catch(Exception e){
      // try 블럭에서 발생한 예외를 처리하는 code
      try{
        // Exception 이 발생할만한 code
      }catch(Exception e2){ // 참조변수 이름이 중복되면 error 발생함
        // try 블럭에서 발생한 예외를 처리하는 code
      }
    }
  }
}
