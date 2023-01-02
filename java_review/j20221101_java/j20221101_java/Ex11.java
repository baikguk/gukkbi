import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex11 {
  public static void main(String[] args){
    byte[] inSource = {0,1,2,3,4,5,6,7,8,9};
    byte[] outSource = null;
    byte[] tmp = new byte[10];

    ByteArrayInputStream bin = null;
    ByteArrayOutputStream bout = null;

    bin = new ByteArrayInputStream(inSource);

    // ByteArrayInputStream 으로부터 읽어온 data 를
    // tmp 배열의 0 번째 index 부터 tmp.length 만큼 tmp 배열에 담음
    bin.read(tmp, 0, tmp.length);

    // ByteArrayOutputStream 을 생성함
    bout = new ByteArrayOutputStream();

    // tmp 배열의 5 번째 index 부터 5 개의 data 를 읽어서
    // ByteArrayOutputStream 으로 써서 내보냄
    bout.write(tmp, 5, 5);

    // ByteArrayOutputStream 에 있는 data 를
    // byte 일차원 배열로 만들어서
    // byte 일차원 배열 참조변수 outSource 에 연결함
    outSource = bout.toByteArray();

    System.out.println("inSource  : " + Arrays.toString(inSource));
    System.out.println("tmp       : " + Arrays.toString(tmp));
    System.out.println("outSource : " + Arrays.toString(outSource));

  }
}
