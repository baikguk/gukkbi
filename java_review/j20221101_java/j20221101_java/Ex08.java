import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex08 {
  public static void main(String[] args){
    int[] scores = {1, 200, 90, 90,
                    2, 70, 90, 90,
                    3, 100, 100, 100,
                    4, 70, 60, 80,
                    5, 70, 90, 100};

    RandomAccessFile raf = null;

    try {
      raf = new RandomAccessFile("C:/test/scores.txt", "rw");
      for(int i = 0; i < scores.length ; i++){
        raf.writeInt(scores[i]);
      }

      // pointer 의  위치를 처음으로 이동시킴
      raf.seek(0);

      while(true){
        try {
          // pointer 가 처음 위치로 가서 data 를 순서대로 읽음
          System.out.println(raf.readInt());
        } catch (EOFException e) {
          break;
        }
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(raf != null) { raf.close(); }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println("프로그램 종료");
  }
}
