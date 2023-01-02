public class Ex05 {
  public static void main(String[] args){

    System.out.println("Variables.cv : " + Variables.cv);

    Variables v1 = new Variables();
    System.out.println("v1.iv        : " + v1.iv);
    System.out.println("Variables.cv : " + Variables.cv);
    v1.iv = 100;
    v1.cv = 200;
    System.out.println("v1.iv        : " + v1.iv);
    System.out.println("v1.cv        : " + v1.cv);
    System.out.println("Variables.cv : " + Variables.cv);
    System.out.println("--------------------------");

    Variables v2 = new Variables();
    System.out.println("v1.iv        : " + v1.iv);
    System.out.println("v2.iv        : " + v2.iv);
    System.out.println("v1.cv        : " + v1.cv);
    System.out.println("v2.cv        : " + v2.cv);
    System.out.println("Variables.cv : " + Variables.cv);
    v2.iv = 222;
    v2.cv = 1234;
    System.out.println("--------------------------");
    System.out.println("v1.iv        : " + v1.iv);
    System.out.println("v2.iv        : " + v2.iv);
    System.out.println("v1.cv        : " + v1.cv);
    System.out.println("v2.cv        : " + v2.cv);
    System.out.println("Variables.cv : " + Variables.cv);


  }
}
class Variables{
  // instance (member) variable
  int iv;
  // class(static) (member) variable
  static int cv;

  public void method1(){
    // local variable
    int lv = 0;
  }
}


