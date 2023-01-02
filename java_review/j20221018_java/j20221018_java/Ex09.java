import java.io.File;

public class Ex09 {
  public static void main(String[] args){
    // main 시작 전에 파일 이름을 입력해서 전달함
    // Modify Run Configuration
    try {
      File f = createFile(args[0]);
      System.out.println(f.getName() + " 파일이 생성되었습니다 !!!");
    }catch(Exception e){
      // main 시작 전에 파일 이름을 입력하지 않은 경우
      // Modify Run Configuration
      System.out.println("파일 이름이 입력되지 않았습니다.");    }

  } // main

  static File createFile(String fileName){
    try {
      if (fileName == null || fileName.equals("")) {
        throw new Exception("파일 이름이 유효하지 않습니다");
      }
    }catch(Exception e){
      System.out.println(e.getMessage());
      // fileName 이 잘못 들어온 경우,
      // 파일 이름을 '파일.txt' 로 함
      fileName = "파일.txt";
    }finally{
      File f = new File(fileName);
      // 생성된 File 객체를 사용해서 파일을 생성함
      makeNewFile(f);
      return f;
    }
  } // createFile

  static void makeNewFile(File f){
    try {
      // File 클래스에 정의되어 있는 createNewFile() 메소드를 호출함
      // 실제로 파일을 생성하는 code
      f.createNewFile();
    }catch(Exception e){ }
  } // makeNewFile


}
