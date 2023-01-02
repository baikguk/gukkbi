import java.io.*;

public class Ex05 {
  public static void main(String[] args) throws Exception {
    int number1 = 0;
    double number2 = 0.0;

    long start = System.currentTimeMillis();

    DataOutputStream dos =
      new DataOutputStream(new FileOutputStream("C:/test/dataOut01.txt"));

    dos.writeInt(256);
    dos.writeDouble(3456.7634);
    dos.close();

    DataInputStream dis =
      new DataInputStream(new FileInputStream("C:/test/dataOut01.txt")) ;

    number1 = dis.readInt();
    number2 = dis.readDouble();
    dis.close();

    System.out.println("number1 : " + number1 + ", number2 : " + number2);

    long end = System.currentTimeMillis();
    System.out.println("처리시간 : " + (end - start));

    System.out.println("프로그램 종료");
  }
}
