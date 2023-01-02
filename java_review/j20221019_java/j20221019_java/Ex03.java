public class Ex03 {
  public static void main(String[] args){
    int i1 = 100;
    int i2 = 200;
    // int type --> String type
    String str1 = String.valueOf(i1);
    String str2 = String.valueOf(i2);

    System.out.println(i1 + i2);
    System.out.println(str1 + str2);
    System.out.println(String.valueOf(i1) + String.valueOf(i2));

    String str3 = "" + i1;
    String str4 = "" + i2;

    int i3 = 300;
    double d1 = 500.0;

    double result1 = i3 + d1;
    System.out.println("result1 : " + result1);

    // int type --> String type
    String str5 = String.valueOf(i3);

    // double type --> String type
    String str6 = String.valueOf(d1);

    // 연결 연산
    System.out.println("str5 + str6 : " + str5 + str6);


    // String type  -->  int type
    int i5 = Integer.parseInt(str5);
    // String type  -->  double type
    double d6 = Double.parseDouble(str6);

    double result2 = i5 + d6;
    System.out.println("result2 : " + result2);

    double sum = Integer.parseInt(str5) + Double.parseDouble(str6);
    System.out.println(String.join(" ", str5, "+", str6, "= ") + sum);

    double sum2 = Integer.valueOf(str5) + Double.valueOf(str6);
    System.out.println(str5 + " + " + str6 + " = " + sum2);

  }
}
