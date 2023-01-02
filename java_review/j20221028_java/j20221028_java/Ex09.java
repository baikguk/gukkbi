import java.io.*;

public class Ex09 {
  public static void main(String[] args){
    InputStream in = null;
    OutputStream out = null;

    try {
      in = new FileInputStream("C:/test/sleep_away.mp4");

      out = new FileOutputStream("C:/test/sleep_away_copy.mp4");

      // 작업 시작 시각
      long start = System.currentTimeMillis();

      while(true){
        int data = in.read();
        if(data == -1){
          break;
        }
        out.write(data);
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
