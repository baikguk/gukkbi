import java.util.*;
import static java.util.Objects.*;

public class Ex15 {
  public static void main(String[] args){
    String[][] str2D1 = new String[][]{new String[]{"aaa", "bbb"}, new String[]{"AAA", "BBB"}};
    String[][] str2D2 = new String[][]{new String[]{"aaa", "bbb"}, new String[]{"AAA", "BBB"}};

    System.out.print("str2D1 : {");
    for(String[] tmp : str2D1){
      System.out.print(Arrays.toString(tmp));
    }
    System.out.print("}");
    System.out.println();

    System.out.print("str2D2 : {");
    for(String[] tmp : str2D2){
      System.out.print(Arrays.toString(tmp));
    }
    System.out.print("}");
    System.out.println("\n------------------------------------");

    // Objects 클래스의 static 메소드 equals()
    System.out.println("Objects.equals(str2D1, str2D2)     : " + Objects.equals(str2D1, str2D2));
    System.out.println("Objects.deepEquals(str2D1, str2D2) : " + Objects.deepEquals(str2D1, str2D2));

    System.out.println("isNull(null)  : " + isNull(null));
    System.out.println("nonNull(null) : " + nonNull(null));
    System.out.println("hashCode(null) : " + Objects.hashCode(null));
    System.out.println("toString(null) : " + Objects.toString(null));

    Comparator comp = String.CASE_INSENSITIVE_ORDER;

    System.out.println(compare("aa", "bb", comp));
    System.out.println(compare("bb", "aa", comp));
    System.out.println(compare("aa", "AA", comp));

    // hashCode :  객체의 주솟값으로 생성한 정수값
    String str1 = new String("abc");
    String str2 = new String("abc");

    System.out.println(str1.equals(str2));
    System.out.println(str1.hashCode());
    System.out.println(str1.hashCode());
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));


  }// main
}
