import java.util.ArrayList;
import java.util.Collections;

public class Ex09 {
  public static void main(String[] args){
    ArrayList list1 = new ArrayList();
    list1.add(new Integer(5));
    list1.add(4);
    list1.add(2);
    list1.add(0);
    list1.add(1);
    list1.add(3);

    System.out.println(list1);
    System.out.println("----------------------------");

    ArrayList list2 = new ArrayList(list1.subList(1, 4));
    System.out.println(list2);
    System.out.println("----------------------------");

    Collections.sort(list1);
    Collections.sort(list2);
    System.out.println(list1);
    System.out.println(list2);
    System.out.println("----------------------------");

    System.out.println("-- list1.containsAll(list2) --");
    System.out.println(list1.containsAll(list2));

    System.out.println("list1.contains(2) : " + list1.contains(2));
    System.out.println("list1.contains(100) : " + list1.contains(100));
    System.out.println("----------------------------");

    // printArray() 메소드를 호출하세요
    printArray(list1, list2);

    list2.add(new String("B"));
    list2.add("C");
    System.out.println(list2);
    System.out.println("----------------------------");
    list2.add(3, "A");
    System.out.println(list2);
    System.out.println("----------------------------");
    list2.set(3, "AAA");
    System.out.println(list2);
    System.out.println("----------------------------");

    System.out.println(" retainALL() 메소드 실행 전 ");
    printArray(list1, list2);

    // retainALL() 메소드
    // list1.retainAll(list2)
    //  ㄴ list1 에서 list2 와 겹치는 부분만 남기고 나머지는 삭제함
    //  System.out.println(" retainALL() 메소드 실행 후 ");
    //  System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
    //  printArray(list1, list2);

    //  System.out.println(" retainALL() 메소드 실행 후 ");
    //  System.out.println("list2.retainAll(list1) : " + list2.retainAll(list1));

    // list1 : [0, 1, 2, 3, 4, 5]
    // list2 : [0, 2, 4, AAA, B, C]
    for(int i = list2.size()-1; i >= 0 ; i--){
      if(!list1.contains(list2.get(i))){
        list2.remove(i);
      }
    }
    printArray(list1, list2);



  } // main

  public static void printArray(ArrayList list1, ArrayList list2){
    System.out.println("list1 : " + list1);
    System.out.println("list2 : " + list2);
    System.out.println("----------------------------");

  } // printArray

}
