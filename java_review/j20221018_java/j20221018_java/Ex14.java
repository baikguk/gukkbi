import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex14 {
  public static void main(String[] args){
    /*
      AutoCloseable 인터페이스를 상속받은 클래스를 사용하는 경우,
      try-with-resource (JDK 1.7 버전부터 사용함) 구문을 사용할 수 있음
       ㄴ finally 블럭에서 close() 메소드를 호출하지 않아도
          close() 메소드가 자동으로 호출됨
    */
    System.out.println("프로그램 시작");

    FileInputStream     fis = null;
    BufferedInputStream bis = null;

    try {
      fis = new FileInputStream("newFile.txt");
      bis = new BufferedInputStream(fis);
      int data = -1;
      while((data = bis.read()) != -1){
        System.out.print((char)data);
      }
      System.out.println();
    }catch(Exception e){
      System.out.println("예외가 발생했습니다");
    }finally {
      try {
        if (bis != null) {
          bis.close();
        }
        if (fis != null) {
          fis.close();
        }
      }catch(IOException e){ }
    }

    System.out.println("프로그램 종료");
  }
}
