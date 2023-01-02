public class Ex17 {
  public static void main(String[] args){

    int number  = 100;
    String str1 = "hello";
    String str2 = "hello";

    String str3 = new String("hello");
    String str4 = new String("hello");

    /*
      == 연산자는 문자열의 (값)과 주소를 비교함

      literal data (<- constant) 들은 java source 가 class loader 에 의해서
      Method Area 에 loading 될 때
      Method Area 의 한 부분인 constant pool 이라는 메모리 영역에 저장됨
      이 영역에 문자열을 올릴 때, 이전에 올린 문자열과 같은 문자열을 올리면
      문자열이 새로 올라가지 않고 이전에 먼저 올라가 있는 문자열을 사용함

      String class(=type) 의 equals() 메소드
            ㄴ 문자열의 내용을 비교함
    */

    System.out.println("str1 == str2 : " + (str1 == str2));
    System.out.println("str3 == str4 : " + (str3 == str4));
    System.out.println("str1 == str3 : " + (str1 == str3));
    System.out.println("str1 == str4 : " + (str1 == str4));
    System.out.println("str2 == str3 : " + (str2 == str3));
    System.out.println("str2 == str4 : " + (str2 == str4));

    System.out.println("str3.equals(str4) : " + str3.equals(str4));
    System.out.println("str1.equals(str3) : " + str1.equals(str3));
    System.out.println("str1.equals(str4) : " + str1.equals(str4));
    System.out.println("str2.equals(str3) : " + str2.equals(str3));
    System.out.println("str2.equals(str4) : " + str2.equals(str4));

    System.out.println("str1.equals(\"HELLO\") : " + str1.equals("HELLO"));
    System.out.println("str1.equalsIgnoreCase(\"HELLO\") : " + str1.equalsIgnoreCase("HELLO"));

  }
}
