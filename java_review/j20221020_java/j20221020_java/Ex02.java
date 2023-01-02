import static java.lang.Math.*;
import static java.lang.System.*;

public class Ex02 {
  public static void main(String[] args){
    double d1 = 90.7552;

    out.println("round(" + d1 + ") : " + round(d1));  // 반올림-정수반환

    d1 *= 100;

    out.println("round(" + d1 + ") : " + round(d1));  // 반올림-정수반환
    out.println("round(" + d1 + ") / 100   : " + round(d1) / 100);  // 반올림-정수반환
    out.println("round(" + d1 + ") / 100.0 : " + round(d1) / 100.0);  // 반올림-정수반환

    out.printf("ceil(%3.1f)  : %3.1f%n", 1.1, ceil(1.1));  // 올림
    out.printf("floor(%3.1f) : %3.1f%n", 1.6, floor(1.6));  // 버림
    out.printf("round(%3.1f) : %d%n", 1.1, round(1.1));  // 반올림
    out.printf("round(%3.1f) : %d%n", 1.7, round(1.7));  // 반올림
    out.printf("rint(%3.1f)  : %f%n", 1.7, rint(1.7));  // 반올림
    out.printf("round(%3.1f) : %d%n", -1.7, round(-1.7));  // 반올림
    out.printf("rint(%3.1f)  : %f%n", -1.7, rint(-1.7));  // 반올림
    out.printf("ceil(%3.1f)  : %3.1f%n", -1.1, ceil(-1.1));  // 올림
    out.printf("floor(%3.1f) : %3.1f%n", -1.6, floor(-1.6));  // 버림

    out.println(max(3, 7));
    out.println(min(3, 7));
  }
}

