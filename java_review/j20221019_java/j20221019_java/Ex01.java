import java.util.Arrays;

public class Ex01 {
  public static void main(String[] args) {
    System.out.println("-- 1 --");
    String animals1 = "dog|cat|bear";
    String[] arrStr1 = animals1.split("|");
    System.out.println("arrStr1 : " + Arrays.toString(arrStr1));
    String result1 = String.join("-", arrStr1);
    System.out.println("result1 :" + result1);

    System.out.println("-- 2 --");
    String animals2 = "dog_cat_bear";
    String[] arrStr2 = animals2.split("_");
    System.out.println("arrStr2 : " + Arrays.toString(arrStr2));
    String result2 = String.join("-", arrStr2);
    System.out.println("result2 :" + result2);

    System.out.println("-- 3 --");
    String animals3 = "dog/cat/bear";
    String[] arrStr3 = animals3.split("/");
    System.out.println("arrStr3 : " + Arrays.toString(arrStr3));
    String result3 = String.join("^", arrStr3);
    System.out.println("result3 :" + result3);

    System.out.println("-- 4 --");
    String animals4 = "dog#cat@bear";
    String[] arrStr4 = animals4.split("#");
    System.out.println("arrStr4 : " + Arrays.toString(arrStr4));
    String result4 = String.join("&", arrStr4);
    System.out.println("result4 :" + result4);

    System.out.println("-- 5 --");
    String animals5 = "dog#cat@bear";
    String[] arrStr5 = animals5.split("@");
    System.out.println("arrStr5 : " + Arrays.toString(arrStr5));
    String result5 = String.join("*", arrStr5);
    System.out.println("result5 :" + result5);
    System.out.println("----------------------");



    String[] color = {"빨강", "파랑", "초록"};
    System.out.println(Arrays.toString(color));
    System.out.println(String.join("+", color));
    System.out.println(String.join("#", color));
    System.out.println(String.join("@", color));
    System.out.println(String.join("^", color));


  }
}