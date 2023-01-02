import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

public class Ex02 {
  public static void main(String[] args) {
    String[] arrStr = {"100", "200", "300", "400", "500"};
    System.out.println(concatenate("", "100", "200", "300", "400", "500"));
    System.out.println(concatenate("-", arrStr));
    System.out.println(concatenate(",", new String[]{"1", "2", "3"}));

    System.out.println("\n------------------------------");
    System.out.println(concatenate2("", "100", "200", "300", "400", "500"));
    System.out.println(concatenate2("-", arrStr));
    System.out.println(concatenate2(",", new String[]{"1", "2", "3"}));

  }

  // parameter : 매개변수
  // argument : 인자, 인잣값, 인수
  // 가변 인자(argument) (varagrs)
  public static String concatenate(String delimiter, String... args){
    String result = "";
    int count = 0;

    for(String str : args){
      count++;
      if (count == args.length){
        result += str;
      }else{
        result += str + delimiter;
      }
    }
    return result;
  }

  public static String concatenate2(String delimiter, String... args){
    String result = "";
    int count = 0;

    for(String str : args){
      count++;
      result += (count == args.length) ? str : str + delimiter;
    }

    return result;
  }
}
