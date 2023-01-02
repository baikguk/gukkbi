import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
  public static void main(String[] args){
    // System.currentTimeMillis() : 시스템의 현재 시각을 1/1000 초로 반환함
    //                              현재시각에서 1970년1월1일의 시각을 뺀 시각
    //                              시스템에 따라서 더 작은 단위로 표현될 수도 있음
    System.out.println(System.currentTimeMillis());

    System.out.println(Calendar.getInstance().getTime());
    System.out.println(new Date());


    SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");

    System.out.println(sdf1.format(new Date()));
    System.out.println(sdf2.format(new Date()));

    System.out.println(sdf1.format(System.currentTimeMillis()));
    System.out.println(sdf2.format(System.currentTimeMillis()));
  }
}
