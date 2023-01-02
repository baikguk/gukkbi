import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex12 {
  public static void main(String[] args){
    byte[] inSource = {0,1,2,3,4,5,6,7,8,9};
    byte[] outSource = null;
    byte[] tmp = new byte[4];

    ByteArrayInputStream bin = null;
    ByteArrayOutputStream bout = null;

    System.out.println("inSource : " + Arrays.toString(inSource));

    // 배열 inSource 에 ByteArrayInputStream 을 연결함
    bin = new ByteArrayInputStream(inSource);
    bout = new ByteArrayOutputStream();

    System.out.println("---------------------------------------------");
    try {
      // bin.available() : bin(ByteArrayInputStream) 으로부터 읽을 수 있는
      //                    data 의 byte 개수를 반환함
      while (bin.available() > 0) {
        // ByteArrayInputStream 에서 읽어오기
        // tmp 에서 읽어온 data 의 개수를 반환함
        int count = bin.read(tmp);
        // ByteArrayOutputStream 에 쓰기
        // bout.write(tmp);
        // tmp 에서 데이터를 읽어서
        // bout(ByteArrayOutputStream) 에 담을 때
        // 중복된 값을 담지 않음
        // write(data 를 읽어올 source, 시작 index, 읽어온는 개수)
        bout.write(tmp, 0, count);

        outSource = bout.toByteArray();

        System.out.println("tmp       : " + Arrays.toString(tmp));
        System.out.println("outSource : " + Arrays.toString(outSource));
      }

    }catch(IOException e){
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) {bout.close();}
        if(bin != null) {bin.close();}
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
}
