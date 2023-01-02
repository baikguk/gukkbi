import java.io.*;

public class Ex11_1 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");
    String folderName = "C:/test";
    String fileName = "Object01.dat";

    File folder = new File(folderName);
    File file   = new File(folder, fileName);
    ObjectInputStream ois = null;

    try {
      ois = new ObjectInputStream(
        new BufferedInputStream(
          new FileInputStream(file)));

      A a = (A)ois.readObject();
      System.out.println("a.number1 : " + a.number1);
      System.out.println("a.number2 : " + a.number2);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if(ois != null) { ois.close(); }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    System.out.println("프로그램 종료");
  }
}
