public class Ex04 {


  public static void main(String[] args){

    /*
      일정 부분의 code 가 반복해서 사용되는 경우,
      이 부분을 code block { } 으로 묶어서
      이름을 붙이고 사용함  <-- code 의 재사용
       ㄴ 함수(function)

       수학적 함수 : input -->  output
                   parameter    return 값


       프로그램 함수(메소드 : 클래스 안에서 정의된 함수)

       1) parameter X    return 값  X
       2) parameter O    return 값  X
       3) parameter X    return 값  O
       4) parameter O    return 값  O

       자바에서 메소드가 값을 return 하는 경우,
       해당 메소드를 호출한 곳으로 이 값을 되돌려 줌

       모든 메소드는 실행을 완료하면 return 함
       해당 메소드를 호출한 곳으로 return 함
       모든 메소드의 마지막 행에는 return 키워드가 있음
         ㄴ return 값이 없는 경우에는 생략할 수 있음
       1) 값을 가지고 return 하는 경우
       2) 값을 가지지 않고 return 하는 경우

       parameter : 변수를 선언하는 부분
         ㄴ 메소드가 실행할 때 필요한 값을
         ㄴ 외부로부터 할당받는 부분

       메소드 scope 안에서 다른 메소드를 정의할 수 없음
       메소드 scope 안에서 다른 메소드를 호출할 수 있음

       메소드 호출(실행) 방법
       메소드이름(argument)
         argument : parameter 에서 지정한 type, 순서, 개수에 맞춤
    */

    System.out.println("sayHello() 메소드 호출 전");
    sayHello();
    System.out.println("sayHello() 메소드 호출 후");

    System.out.println("printName() 메소드 호출 전");
    printName("글로벌");
    System.out.println("printName() 메소드 호출 후");

    System.out.println("return100() 메소드 호출 전");
    int returnValue = return100();
    System.out.printf("리턴값 : %d%n", returnValue);
    System.out.println("return100() 메소드 호출 후");

    System.out.println("add10() 메소드 호출 전");
    returnValue = add10(1234);
    System.out.printf("리턴값 : %d%n", returnValue);
    System.out.println("add10() 메소드 호출 후");

  } // main

  /*
    메소드 작성 형식
    메소드 정의부 definition
    첫 번째 줄 : 메소드 선언부 signature
     { }  : 메소드 body(몸통 / 구현부)
    접근제한자 [static] return type 메소드이름(parameter){
      statement....
      statement....
      statement....
      return 값;
    }
  */

  // 1) parameter X    return 값  X
  public static void sayHello(){
    System.out.println("Hello");
    return;
  }

  // 2) parameter O    return 값  X
  public static void printName(String name){
    System.out.printf("당신의 이름은 %s  입니다%n", name);
    return;
  }

  // 3) parameter X    return 값  O
  public static int return100(){
    System.out.println("return100() 호출됨");
    return 100;
  }

  // 4) parameter O    return 값  O
  public static int add10(int number){
    int result = number + 10;
    return result;
  }


} // class

