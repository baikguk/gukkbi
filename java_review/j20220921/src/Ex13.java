public class Ex13 {
  public static void main(String[] args){

    float pi = 3.141592F;
    System.out.println("pi : " + pi);
    /*
    float f1 = pi * 1000;
    System.out.println("f1 : " + f1);
    */
    float f1 = pi * 1000 + 0.5F;
    System.out.println("f1 : " + f1);

    int i1 = (int)f1;
    System.out.println("i1 : " + i1);

    float f2 = i1 / 1000;
    System.out.println("f2 : " + f2);

    float f3 = i1 / 1000F;
    System.out.println("f3 : " + f3);
    System.out.println("------------------------");

    pi = 3.141592F;
    float result = (int)(pi * 1000 + 0.5F) / 1000F;
    System.out.println("result : " + result);

    pi = 3.141592F;
    result = (int)(pi * 100 + 0.5F) / 100F;
    System.out.println("result : " + result);

    pi = 3.141592F;
    result = (int)(pi * 10000 + 0.5F) / 10000F;
    System.out.println("result : " + result);
    System.out.println("------------------------");

    /*
      Math.round() 메소드는
      실수의 정수부분만 반환하면서 반올림해 줌
                ㄴ int type 이 된다는 의미
    */
    pi = 3.141592F;

    // Math.round(pi * 1000) <- int type
    // 1000D  <-- double type
    //  ㄴ 이 두 값의 연산은 double type  공간에서
    //     이루어지므로 소숫점 이하 숫자가 남아있음
    double pi_1 = Math.round(pi * 1000) / 1000D;
    System.out.printf("pi_1 : %f%n", pi_1);

    // Math.round(pi * 1000) <- int type
    // 1000 <- int type
    // ㄴ 이 두 값의 연산은 int 연산이 되어서
    //    소숫점 이하 숫자가 잘려나감
    int pi_2 = Math.round(pi * 1000) / 1000;
    System.out.printf("pi_2 : %d%n", pi_2);

  }
}
