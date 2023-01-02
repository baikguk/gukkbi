import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex01 {
  public static void main(String[] args){
    InputStream in = null;
    OutputStream out = null;

    URL url = null;

    try {
      // 1) internet 연결하기
      url = new URL("https://cdn.newspenguin.com/news/photo/202007/2106_6019_954.jpg");

      // 2) 읽는 Stream 준비하기
      in = url.openStream();

      // 3) 쓰는 Stream 준비하기
      out = new FileOutputStream("C:/test/koala.jpg");

      // 4) 실제로 읽고 쓰는 작업을 수행함
      //    byte[] 배열을 사용해서 속도를 빠르게 함
      byte[] buffer = new byte[1024];

      // 5) 처리 시간 측정하기
      long start = System.currentTimeMillis();

      while(true){
        int count = in.read(buffer);
        if(count == -1){
          break;
        }
        out.write(buffer, 0, count);
      }

      long end = System.currentTimeMillis();
      System.out.println("처리시간 : " + (end - start));

    } catch (MalformedURLException e) { }
    catch (IOException e) {
      throw new RuntimeException(e);
    }finally{
      try {
        if(out != null){  out.close(); }
        if(in != null){  in.close(); }

      } catch (IOException e) { }
    }
    System.out.println("프로그램 종료");

  } // main

}
