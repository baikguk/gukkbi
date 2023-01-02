import java.io.*;

public class Ex08 {
  public static void main(String[] args) {
    // C:/workspace/java_basic2/j20221031/src
    String folderName = "C:/workspace/java_basic2/j20221031/src";
    String fileName = "Ex07.java";

    File folder = new File(folderName);
    File file = new File(folder, fileName);

    System.out.printf("file 이름 : %s%n", file.getName());
    System.out.printf("file 경로 : %s%n", file.getAbsoluteFile());
    System.out.printf("file 크기 : %s%n", file.length());

    BufferedReader br = null;

    try {
      br = new BufferedReader(
               new InputStreamReader(
                   new FileInputStream(file)));
      String contents = null;

      while((contents = br.readLine()) != null){
        System.out.println(contents);
      }
    }catch(FileNotFoundException e){
      e.printStackTrace();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally{
      try {
        if(br != null) { br.close();}
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    System.out.println("프로그램 종료");
  }
}
