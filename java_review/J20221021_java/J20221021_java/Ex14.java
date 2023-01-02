import java.util.ArrayList;
import java.util.Iterator;

public class Ex14 {
  public static void main(String[] args){
    /*
      Collection 객체를 생성할 때
      Generics 을 지정하지 않으면
      모든 type 의 객체들의 주솟값을 저장할 수 있음
      이 주솟값들이 저장될 때, Object type 으로 저장됨
    */
    ArrayList list = new ArrayList();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");
    /*
    list.add(new Integer(123));
    list.add(123.6587F);
    list.add(3.25);
    list.add(new Boolean(true));
    */
    System.out.println(list);
    System.out.println("--------------------------");

    for(int i = 0; i < list.size(); i++){
      System.out.printf("%s ", list.get(i));
    }
    System.out.println("\n--------------------------");

    // ArrayList 객체를 생성할 때
    // <String> 제네릭을 사용하면
    // 아래와 같이 형변화을 하지 않고
    // 바로 String type 으로 받을 수 있음
    // 향상된 for 문에는 Iterator 기능이 포함되어 있음
    for(Object str : list){
      String str1 = (String)str;
      // int i1 = Integer.parseInt(str1);
      // System.out.printf("%s %d, ", str1, i1);
      System.out.printf("%s, ", str1);
    }
    System.out.println("\n--------------------------");

    Iterator iter = list.iterator();
    while(iter.hasNext()){
      String str2 = (String)iter.next();
      System.out.printf("%s ", str2);
    }
    System.out.println("\n--------------------------");

  }
}
