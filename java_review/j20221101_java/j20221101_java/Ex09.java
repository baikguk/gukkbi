import javax.swing.plaf.LabelUI;
import java.io.File;
import java.io.IOException;

public class Ex09 {
  public static void main(String[] args){
    File file = new File("C:/test/file01.txt");

    try {
      if(!file.exists()){
        file.createNewFile();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // 파일의 절대경로
    String absolutePath = file.getAbsolutePath();
    System.out.println("절대경로 : " + absolutePath);

    // 파일의 존재 여부
    boolean isFile = file.isFile();
    System.out.println("파일이 있는가? " + isFile);

    // 폴더의 존재 여부
    boolean isFolder = file.isDirectory();
    System.out.println("폴더가 있는가? " + isFolder);

    // 경로 구분자
    System.out.println(file.separator);
  }
}
