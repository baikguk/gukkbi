public class Ex05 {
  public static void main(String[] args){

    // int type -> String type
    int number = 123;
    String strNumber = "" + number;

    // String 클래스의 valueOf() 메소드
    // int type -> String type
    String strNumber2 = String.valueOf(number);

    // Integer 클래스의 toString() 메소드
    String strNumber3 = Integer.toString(number);

    // String type -> int type
    // 숫자 모양의 문자열만 int type 으로 변환할 수 있음
    // Integer 클래스의 parseInt() 메소드 사용
    //  ㄴ int type 의 wrapper class
    int number2 = Integer.parseInt(strNumber);

  }
}
