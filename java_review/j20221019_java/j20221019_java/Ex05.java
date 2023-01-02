public class Ex05 {
  public static void main(String[] args){
    String str1 = "Hello";
    String str2 = " Java";
    System.out.println("str1 : " + str1);
    System.out.println("str2 : " + str2);

    String str3 = str1 + str2;
    System.out.println("str3 : " + str3);

    System.out.println("str1 : " + str1);
    System.out.println("str2 : " + str2);

    // String type  <-- immutable type
    String str4 = "Hi";
    String str5 = str4 + " Java";
    System.out.println(str4 + " Java");
    System.out.println("str4 : " + str4);
    System.out.println("str5 : " + str5);
    System.out.println(str5 + " Programming");
    System.out.println("str5 : " + str5);
    System.out.println("-----------------------------");

    String str7 = new String("abc");
    String str8 = new String("abc");
    System.out.println("str7.equals(str8) : " + str7.equals(str8));

    StringBuffer sb1 = new StringBuffer("abc");
    StringBuffer sb2 = new StringBuffer("abc");
    System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2));
    System.out.println("sb1 == sb2 : " + (sb1 == sb2));





  }
}
