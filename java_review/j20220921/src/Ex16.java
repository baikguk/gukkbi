public class Ex16 {
  public static void main(String[] args){
    float  f  = 0.1F;
    double d  = 0.1;
    double d2 = (double)f;
    float f2 = 10.0F;

    System.out.printf("10.0 == 10.0F : %b%n", 10.0 == 10.0F);
    System.out.printf("0.1 == 0.1F : %b%n", 0.1 == 0.1F);
    System.out.printf("f  : %19.17f%n", f);
    System.out.printf("d  : %19.17f%n", d);
    System.out.printf("d2 : %19.17f%n", d2);
    System.out.printf("d ==  f : %b%n", d == f);
    System.out.printf("d == d2 : %b%n", d == d2);
    System.out.printf("d2 == f : %b%n", d2 == f);
    System.out.printf("(float)d == f : %b%n", (float)d == f);
    System.out.printf("10.0 : %19.17f%n",10.0);
    System.out.printf("f2 : %19.17f%n",f2);
  }
}
