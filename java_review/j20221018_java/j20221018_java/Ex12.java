public class Ex12 {
  public static void main(String[] args){
    try {
      startInstall();
      copyFiles();
      // deleteTempFiles();
    }catch(Exception e){
      e.printStackTrace();
      // deleteTempFiles();
    }finally{
      // 예외가 발생하든 안 하든 실행되는 부분
      deleteTempFiles();
    }
  }
  static void startInstall(){  }
  static void copyFiles(){  }
  static void deleteTempFiles() {  }
}
