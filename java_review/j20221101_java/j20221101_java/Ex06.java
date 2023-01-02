import java.io.*;

public class Ex06 {
  public static void main(String[] args) throws Exception {
    int value = 333;
    int result = 0;

    DataOutputStream dos =
      new DataOutputStream(new FileOutputStream("C:/test/dataTest.txt"));
    dos.writeInt(value);
    dos.close();

    DataInputStream dis =
      new DataInputStream(new FileInputStream("C:/test/dataTest.txt"));
    result = dis.readInt();
    dis.close();

    System.out.println("result : " + result);

  }
}
