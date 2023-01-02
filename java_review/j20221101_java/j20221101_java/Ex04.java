import java.io.*;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) throws Exception {

    DataOutputStream dos = null;
    String str1 = "Hello Java Programming";

    dos = new DataOutputStream(new FileOutputStream("C:/test/stringTest.data"));
    dos.writeUTF(str1);

    dos.close();

    Scanner sc = null;
    sc = new Scanner(new FileInputStream("C:/test/stringTest.data"));

    System.out.println(sc.nextLine());





  }
}
