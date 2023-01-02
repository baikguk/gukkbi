import java.io.*;

public class Ex08 {
  public static void main(String[] args){
    InputStream in = null;
    OutputStream out = null;

    try {
      // 원본(source) 에 InputStream 을 연결함
      in = new FileInputStream("C:/test/bridge.jpg");

      // Java 에서 OutputStream 을 밖으로 빼내서 복사본(copy)을 내보냄
      // 파일이 이미 있으면 이전 내용을 덮어쓰고, 없으면 새로 만듬(생성함)
      out = new FileOutputStream("C:/test/bridge_copy.jpg");

      // 작업 시작 시각
      long start = System.currentTimeMillis();

      while(true){
        int data = in.read();
        if(data == -1){
          break;
        }
        out.write(data);
      }

      /*   ┌ InputStream 에서 읽어옴
          in.read() 로 source file 에서 읽어온 data 를
        (메모리 상에서 보관하고 있다가)
         쓰는 작업(out.write())을 함
                    ㄴ out(OutputStream) 에 씀(써서 내보냄)
            <--  이 작업을 원본의 byte 수만큼 반복 진행함
      */
      long end = System.currentTimeMillis();
      System.out.println("처리시간 : " + (end - start));

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally{
      try {
        if(out != null) { out.close(); }
        if(in != null) { in.close(); }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}
