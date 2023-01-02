import java.io.*;

public class Ex10 {
  public static void main(String[] args){
    InputStream in = null;
    OutputStream out = null;

    try {
      in = new FileInputStream("C:/test/sleep_away.mp4");

      out = new FileOutputStream("C:/test/sleep_away_copy2.mp4");

      byte[] buffer = new byte[500];

      // 작업 시작 시각
      long start = System.currentTimeMillis();

      while(true){
        int count = in.read(buffer);
        if(count == -1){
          break;
        }
        out.write(buffer, 0, count);
      }

      // 작업 종료 시각
      long end = System.currentTimeMillis();
      System.out.println("처리 시간 : " + (end - start));

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally{
      try {
        if(out != null){ out.close(); }
        if(in != null){ in.close(); }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println("파일 복사 완료 !!");

  }
}
