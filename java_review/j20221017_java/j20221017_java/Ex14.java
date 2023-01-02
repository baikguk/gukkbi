/*
  예외처리 : Exception Handling

  컴파일 에러(compile time error) : 컴파일할 때 발생하는 에러
  런타임 에러(runtime error)      : 프로그램 실행 중에 발생하는 에러
  논리적 에러(logical error)      : 작성의도와 다르게 동작함


  런타임 에러(runtime error)
    에러(error) : 프로그램 소스를 수정해서 해결할 수 없는 심각한 오류
    예외(exception) : 프로그램 소스를 수정해서 해결할 수 있는 비교적 경미한 오류

  예외처리 (Exception Handling)
    프로그램 실행 시 발생할 수 있는 예외에 대비해서 code 를 작성하는 것
     ㄴ 프로그램의 비정상적인 종료를 방지하고 정상적인 실행상태를 유지하기 위함


                           Object  : 모든 클래스들의 조상 클래스
                             |
                          Throwable : 모든 오류 클래스들의 조상 클래스
                     |                                   |
               Exception(예외의 최고조상클래스)      Error (심각한 오류)
 RuntimeException   IOException                             OutOfMemoryError
      |             ClassNotFoundException
 ArithmeticException
 ClassCastException
 NullPointerException
 ...
 IndexOutOfBoundsException

 Exception - 사용자의 실수와 같은 외적인 요인에 의해서 발생하는 예외
 Runtime Exception - 프로그래머의 실수로 발생하는 예외

 형식]

  try{
    예외가 발생할만한 code
    예외가 발생하면, 해당 예외클래스(이미 정의되어 있는(built-in) 클래스)의
    객체가 생성되고 아래의 catch 구문 중에서 해당 예외클래스를 parameter 로
    선언한 catch 구문으로 들어가서 예외처리 code 가 실행됨
  }catch(ArithmeticException e1){
    발생한 예외를 처리하는 code
  }catch(NullPointerException e2){
    발생한 예외를 처리하는 code
  }catch(Exception e3){
    발생한 예외를 처리하는 code
    - Exception type 의 변수를 parameter 로 선언한 catch 문 -
        ㄴ catch 구문 중에서 제일 아래에 있는 catch 구문의
           parameter 로 선언해야 함. 맨 위나 중간에 선언하면 안 됨
    Exception 클래스는 예외 클래스 중에서 최상위 클래스로서
    발생한 예외에 해당하는 예외 객체를 받을 catch 구문이 없는 경우
    해당 예외 객체를 받아서 처리함
  }finally{
    예외가 발생하든 안 하든 무조건 실행되는 부분
  }

*/
public class Ex14 {
  public static void main(String[] args){
    System.out.println("hello java");
    System.out.println(args[0]);
  }
}

