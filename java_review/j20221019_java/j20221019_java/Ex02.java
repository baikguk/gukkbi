import java.util.Arrays;
import java.util.StringJoiner;

public class Ex02 {
  public static void main(String[] args){
    String animals = "dog_cat_bear";
    String[] arrStr1 = animals.split("_");
    System.out.println(Arrays.toString(arrStr1));

    System.out.println(String.join("^", arrStr1));

    StringJoiner sj = new StringJoiner("/","[","]");

    for(String s : arrStr1){
      sj.add(s);
    }
    System.out.println("sj :" + sj);

  }
}
