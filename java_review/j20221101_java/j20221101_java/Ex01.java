import java.io.*;

class A implements Serializable {
  public int num1;
  private int num2;
  protected int num3;
  int num4;
  public final int num5;
  public static int num6;

  // 직렬화 대상에서 제외하려는 멤버변수에
  // transient  키워드를 붙여줌
  public transient int num7;

  public A(int num1, int num2, int num3, int num4, int num5, int num6, int num7){
    this.num1=num1; this.num2=num2;this.num3=num3;this.num4=num4;
    this.num5=num5; this.num6=num6;this.num7=num7;
  }
  public void display(){
    System.out.printf("%d, %d, %d, %d, %d, %d, %d%n",
                        num1,num2,num3,num4,num5,num6,num7);
  }
}

public class Ex01 {
  public static void main(String[] args) throws Exception {
    String folderName = "C:/test";
    String fileName   = "ObjectA.dat";

    File folder = new File(folderName);
    File file   = new File(folder, fileName);

    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;

    oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

    A a = new A(11, 22, 33, 44, 55, 66, 77);

    a.display();

    A.num6 = 1234567;

    oos.writeObject(a);
    oos.close();

    ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

    A a2 = (A)ois.readObject();
    a2.display();

    ois.close();

    System.out.println("프로그램 종료");
  }
}
