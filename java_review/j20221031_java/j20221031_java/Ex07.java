import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex07 {
  public static void main(String[] args){
    // File 클래스 : 파일이나 폴더에 대한 정보를 제공함
    // File.separator  <-- 현재 시스템의 경로 구분자를 반환함
    // C:/test/IOtest/JavaIOTest.text
    String folderName = "C:" + File.separator + "test" + File.separator + "IOtest";
    String fileName = "JavaIOTest.txt";

    File folder = new File(folderName);

    // 폴더(C:/test/IOtest/)가 존재하지 않으면
    if(!folder.exists()){
      // 해당 폴더(C:/test/IOtest/)를 생성함
      folder.mkdirs();
    }

    // C:/test/IOtest/JavaIOTest.text
    File file = new File(folder, fileName);

    try {
      if (!file.exists()) {
        file.createNewFile();
      }

      System.out.printf("file 의 이름 : %s%n", file.getName());
      System.out.printf("file 의 경로 : %s%n", file.getAbsolutePath());
      System.out.printf("file 의 크기 : %s%n", file.length());

      for(int i = 1; i <= 8; i++){
        File testFile = new File(file.getAbsolutePath() + File.separator);
        testFile = new File(folder, "Folder-" + i);

        if(!testFile.exists()){
          testFile.mkdirs();
        }
      }

      // 폴더 8 개, 파일 한 개
      String[] list = folder.list();
      System.out.println(Arrays.toString(list));

      for(int i = 0; i < list.length; i++){
        File tmp = new File(folder, list[i]);

        // File 클래스의 isDirectory() <-- 폴더(디렉토리)인지 확인함
        if(tmp.isDirectory()){
          // index 0 부터 7 까지의 tmp 는 folder 라서 list() 메소드를 호출해서
          // 해당 folder 내부에 있는 하위 folder 와 file 들의 이름을 문자열 배열로 가져올 수 있음
          System.out.println(list[i] + " : 폴더 (" + tmp.list().length + ")");
        // File 클래스의 isFile() <-- 파일인지 확인함
        }else if(tmp.isFile()){
          // 마지막 index 의 tmp 는 파일(문자열)이므로 length() 메소드를 호출함
          System.out.println(list[i] + " : 파일 (" + tmp.length() + " byte)");
        }
      }

    }catch(IOException e){
      e.printStackTrace();
    }
    System.out.println("프로그램 종료");
  }
}
