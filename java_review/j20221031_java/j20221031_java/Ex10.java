import java.io.*;
import java.util.Arrays;

public class Ex10 {
  public static void main(String[ ]args){
    String folderName = "C:/workspace/java_review/j20221031_java";
    String folderCopy = "C:/workspace/java_review/j20221031_java";

    // 원본
    File folder = new File(folderName);
    // 복사본
    File fCopy  = new File(folderCopy);

    if(!fCopy.exists()){
      fCopy.mkdirs();
    }

    String[] list = folder.list();
    System.out.println("-- list --");
    System.out.println(Arrays.toString(list));

    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;
    try {
      for (String name : list) {
        // list 에 있는 문자열로
        // C:/workspace/java_basic2/j20221031/src_copy 에
        // 파일 생성하기

        // InputStream 을 tmpIn 에 연결함 : 원본
        File tmpIn = new File(folder, name);
        bis = new BufferedInputStream(new FileInputStream(tmpIn));

        // OutputStream 을 tmpOut 에 연결함 : 복사본
        File tmpOut = new File(fCopy, name);
        bos = new BufferedOutputStream(new FileOutputStream(tmpOut));

        // byte 배열 생성하기
        byte[] data = new byte[(int)tmpIn.length()];
        // BufferedInputStream bis (원본과 연결되어 있음)  에 있는 data 를 읽어서
        bis.read(data);
        // BufferedOutputStream bos (복사본과 연결되어 있음) 에 쓰기
        bos.write(data);
      }
    }catch(IOException e){
    }finally{
      try {
        if (bos != null) { bos.close(); }
        if (bis != null) { bis.close(); }
      }catch(IOException e){ }
    }
  System.out.println("프로그램 종료");
  }  // main
}
