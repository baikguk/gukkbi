import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex07 {
  public static void main(String[] args){

    // 파일을 random 하게 읽고 쓸 수 있는 클래스
    RandomAccessFile raf = null;

    // 한 번에 읽어들일 data 크기 설정하기
    int seekSize = 5;

    try{
      // mode 를 r 로 지정하면 읽기 전용 모드가 됨
      raf = new RandomAccessFile("C:/test/RAF.txt", "r");

      /*
          mode
        r    : read
        rw   : read & write
        rws  : read, write and save
        rwd  : read, write and save (기본 저장장치에 동기식으로 작성함)
      */
      String line = "";
      // (line = raf.readLine()) != null : 읽을 내용이 있는 동안 읽음
      while((line = raf.readLine()) != null){
        //  전체 문자열 출력하기
        System.out.println(line);
      }
      System.out.println("문자열 전체 길이 : " + raf.length());

      byte[] data = null;

      // seekSize 는 위에서 5 로 설정되어 있음
      // 전체 길이를 seekSize 로 나누고, 나머지가 있는 경우에는 1을 더함
      long size = (raf.length() / seekSize) + ((raf.length() % seekSize) == 0 ? 0 : 1);

      for(int i = 0; i < size; i++) {
        data = new byte[seekSize];

        try {
          // seekSize 만큼 증가함
          raf.seek(i * seekSize);

          // 일차원 배열 data 에 문자가 다 차면 읽음
          //  ㄴ 5 개의 문자가 다 차면 (index)
          // raf.readFully(data);

          // // 일차원 배열 data 에 문자가 다 차지 않아도 읽음
          raf.read(data);

          System.out.println("pointer : " + raf.getFilePointer() + ", str : " + new String(data).trim());

        }catch(EOFException e){
          break;
        }
      } // for

    }catch(FileNotFoundException e){
      e.printStackTrace();
    }catch(IOException e){
      e.printStackTrace();
    } finally{
      try {
        if(raf != null) { raf.close(); }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    System.out.println("프로그램 종료");
  } // main
} // class
