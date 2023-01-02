public class Ex04 {
  public static void main(String[] args){
    // return (keyword) 의 의미
    // 1) 메소드의 실행을 종료함
    // 2) 프로그램의 흐름을 메소드를 호출한 곳으로 되돌림
    System.out.println("프로그램 시작");
    printName("아카데미");
    printName("학원");
    printName("이순신");
    printName("글로벌");
    printName("강감찬");
    System.out.println("프로그램 종료");
  }
  public static void printName(String name){
    System.out.println("안녕하세요");
    if(name.equals("글로벌")){
      return;
    }
    System.out.println("당신의 이름은 " + name + "입니다");
    return;
  }
}
