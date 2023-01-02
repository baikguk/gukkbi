// 바이트 기반 스트림
// InputStream, OutputStream
// FileInputStream,   FileOutputStream

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex06 {
  public static void main(String[] args){
    InputStream in = null;

    try {
      in = new FileInputStream("C:/test/io_test.txt");

      while(true) {
        int data = in.read();
        System.out.print((char)data);
        // System.out.print(data);
        if(data == -1){
          break;
        }
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally{
      if(in != null) {
        try {
          in.close();
          System.out.println("\n입력스트림을 닫았습니다");
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }


  }
}
