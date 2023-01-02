import java.util.StringTokenizer;

public class Ex07 {
  public static void main(String[] args){
    String source = "100,200,300,400";
    // delimiter 를 포함하지 않고 지정한 경우
    StringTokenizer st = new StringTokenizer(source, ",");

    while(st.hasMoreElements()){
      System.out.println(st.nextToken());
    }
    System.out.println("=======================");

    String expression = "x=100*(200+300)/2";
    // delimiter 가 여러 개이면서
    // delimiter 를 포함해서 지정한 경우
    StringTokenizer st2 = new StringTokenizer(expression, "+-*/=()", true);

    while(st2.hasMoreElements()){
      System.out.println(st2.nextToken());
    }
    System.out.println("=======================");

    String scores = "1,이순신,100,100,100|2,유관순,95,80,98|3,윤봉길,85,92,94";
    // delimiter 를 포함하지 않고 지정한 경우
    StringTokenizer st3 = new StringTokenizer(scores, "|");

    while(st3.hasMoreElements()){
      String token = st3.nextToken();

      StringTokenizer st4 = new StringTokenizer(token, ",");
      while(st4.hasMoreElements()){
        System.out.println(st4.nextToken());
      }
      System.out.println("----------------------");
    }

    source = "Global IT Human Resources Institute";

    // delimiter 를 지정하지 않으면 기본적으로 공백문자가 delimiter 가 됨
    // delimiter 를 지정하지 않은 경우
    // delimiter 를 포함하지 않고 지정한 경우
    StringTokenizer t1 = new StringTokenizer(source);
    while(t1.hasMoreTokens()){
      System.out.println("t1 : " + t1.nextToken());
    }
    System.out.println("------------------------------------");

    // delimiter 를 공백문자로 지정한 경우
    // delimiter 를 포함하지 않고 지정한 경우
    StringTokenizer t2 = new StringTokenizer(source, " ");
    while(t2.hasMoreTokens()){
      System.out.println("t2 : " + t2.nextToken());
    }
    System.out.println("------------------------------------");

    // delimiter 를 공백문자로 지정한 경우
    // delimiter 를 포함해서 지정한 경우
    StringTokenizer t3 = new StringTokenizer(source, " ", true);
    while(t3.hasMoreTokens()){
      System.out.println("t3 : " + t3.nextToken());
    }
  }
}
