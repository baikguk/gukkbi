import java.util.Arrays;

public class Ex06 {
  public static void main(String[ ]args){

    char[] ch1 = new char[]{'G', 'l', 'o', 'b', 'a', 'l'};

    System.out.println(ch1);
    System.out.println(ch1.length);

    // char type -> String type
    System.out.println(new String(ch1));
    System.out.println(new String(ch1).length());
    System.out.println("-----------------------------");

    // String type ->  char type
    String alphabet = "ABCDFEGHIJK";

    // char[] ch2 = {'A','B','C','D','F','E','G','H','I','J','K'};

    // char type 의 배열 ch2를 생성하고
    // for 문을 사용해서 String alphabet 에
    // 할당된 문자열을 구성하는 문자들을
    // ch2 의 item 으로 할당하세요
    // String type 의 charAt() 메소드 사용하기
    char[] ch2 = new char[alphabet.length()];

    for(int i = 0; i < ch2.length; i++){
      ch2[i] = alphabet.charAt(i);
      System.out.printf("%c ", ch2[i]);
    }
    System.out.println("\n-----------------------------");
    System.out.println(Arrays.toString(ch2));
    System.out.println("-----------------------------");

    // String class 의 toCharArray() 메소드
    ch2 = alphabet.toCharArray();
    System.out.println(Arrays.toString(ch2));
    System.out.println("-----------------------------");

  }
}
