import java.util.ArrayList;

public class Ex07 {
  public static void main(String[] args){

    // 100 칸이 생성됨
    // ArrayList<String> list2 = new ArrayList<>(100);

    // 기본적으로 10 칸이 생성됨
    ArrayList<String> list1 = new ArrayList<>();

    System.out.println(list1.size());

    list1.add("포도");
    list1.add(new String("딸기"));
    list1.add("복숭아");

    System.out.println(list1.size());

    System.out.println(list1);
    System.out.println("---------------------------");


    for(int i = 0; i < list1.size(); i++){
      System.out.print(list1.get(i) + " ");
    }
    System.out.println("\n---------------------------");

    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n---------------------------");

    list1.add("망고");
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n---------------------------");

    list1.add(0, "오렌지");
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");

    list1.add(2, "키위");
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");

    // 값을 변경하는 메소드 : set()
    list1.set(0, "수박");
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");

    // 값을 삭제하는 메소드 : remove(인덱스번호)
    list1.remove(1);
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");

    list1.add(4, "키위");
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");


    int first = list1.indexOf("키위");
    int last  = list1.lastIndexOf("키위");
    System.out.println(first);
    System.out.println(last);

    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");


    list1.add(list1.indexOf("복숭아"), "참외");
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");

    list1.set(list1.lastIndexOf("키위"), "오렌지");
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");


    list1.remove(list1.indexOf("참외"));
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");

    list1.remove("수박");
    for(String fruit : list1){
      System.out.print(fruit + " ");
    }
    System.out.println("\n-----------------------------------");


  }
}
