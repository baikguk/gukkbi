// 바이트 기반 스트림
// InputStream, OutputStream
// FileInputStream,   FileOutputStream

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex07 {
  public static void main(String[] args){
    OutputStream out = null;

    try {
      out = new FileOutputStream("C:/test/java_study.txt");
      String str1 = "Hello Java (java_study.txt 에 기록될 문자열)";

      byte[] arrBytes = str1.getBytes();
      out.write(arrBytes);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(out != null){
        try {
          out.close();
          System.out.println("출력스트림 닫음");
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

    }


  }
}
