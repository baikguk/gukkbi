import java.util.ArrayList;

public class Ex05 {
  public static void main(String[] args){

    ArrayList list1 = new ArrayList();

    // ArrayList 에 data 를 저장하려면 add() 메소드를 호출함
    list1.add(100);
    list1.add(new Integer(100));
    list1.add("200");
    list1.add(new String("200"));
    list1.add(true);
    list1.add(new Boolean(true));
    list1.add(123.45);
    list1.add(new Double(123.45));

    System.out.println("list1 : " + list1);

    ArrayList<String> list2 = new ArrayList<String>();
    // list2.add(100);
    list2.add(new String("200"));
    list2.add("200");
    // list2.add(true);
    // list2.add(123.45);

  }
}
