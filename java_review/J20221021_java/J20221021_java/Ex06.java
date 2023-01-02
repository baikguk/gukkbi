import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex06 {
  public static void main(String[] args){
    Calendar cal1 = Calendar.getInstance();
    // month : 0 ~ 11
    cal1.set(2020, 10-1, 15);

    Date day = cal1.getTime();

    SimpleDateFormat sdf1, sdf2, sdf3, sdf4;

    sdf1 = new SimpleDateFormat("yyyy-MM-dd");
    sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
    sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");

    System.out.println(sdf1.format(day));
    System.out.println(sdf2.format(day));
    System.out.println(sdf3.format(day));
    System.out.println(sdf4.format(day));
    System.out.println("--------------------------------------");

    DateFormat df1 = new SimpleDateFormat("yyyy년 MM월 dd일");
    DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

    try {
      Date date1 = df1.parse("2020년 10월 12일");
      System.out.println(df2.format(date1));
    } catch (ParseException e) {    }


  }

}
