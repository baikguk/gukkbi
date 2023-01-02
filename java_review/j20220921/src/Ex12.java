public class Ex12 {
  public static void main(String[] args){

    float pi = 3.141592F;
    System.out.println("pi : " + pi);

    float f1 = pi * 1000;
    System.out.println("f1 : " + f1);

    int i1 = (int)f1;
    System.out.println("i1 : " + i1);

    float f2 = i1 / 1000;
    System.out.println("f2 : " + f2);

    float f3 = i1 / 1000F;
    System.out.println("f3 : " + f3);
  }
}
