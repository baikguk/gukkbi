import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex10 {
  public static void main(String[] args){
    byte[] inSource = {0,1,2,3,4,5,6,7,8,9};
    byte[] outSource = null;

    ByteArrayInputStream   bin = new ByteArrayInputStream(inSource);
    ByteArrayOutputStream bout = new ByteArrayOutputStream();

    int data = 0;

    // ByteArrayInputStream 에 연결된 byte 배열 inSource 에 있는 data 를 읽음
    while((data = bin.read()) != -1){
      // 읽으면서 ByteArrayOutputStream 에 씀(write)
      bout.write(data);
    }

    // ByteArrayOutputStream 에 쓰여진 data 를 byte 배열로 변환해서
    // byte 배열 참조변수 outSource 에 연결함
    outSource = bout.toByteArray();

    System.out.println("inSource  : " + Arrays.toString(inSource));
    System.out.println("outSource : " + Arrays.toString(outSource));


  }
}
