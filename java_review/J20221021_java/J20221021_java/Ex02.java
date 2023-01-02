import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
  public static void main(String[] args){

    ArrayList  al = new ArrayList(2000000);
    LinkedList ll = new LinkedList();

    System.out.println("--  (맨 뒤에서부터) 순차적 추가 --");
    System.out.println("ArrayList  : " + add1(al));
    System.out.println("LinkedList : " + add1(ll));
    System.out.println("-------------------------------");

    System.out.println("-- 중간에서 추가 --");
    System.out.println("ArrayList  : " + add2(al));
    System.out.println("LinkedList : " + add2(ll));
    System.out.println("-------------------------------");

    System.out.println("-- 중간에서 삭제 --");
    System.out.println("ArrayList  : " + remove2(al));
    System.out.println("LinkedList : " + remove2(ll));
    System.out.println("-------------------------------");

    System.out.println("--  (맨 뒤에서부터) 순차적 삭제 --");
    System.out.println("ArrayList  : " + remove1(al));
    System.out.println("LinkedList : " + remove1(ll));
    System.out.println("-------------------------------");

  }

  // (맨 뒤에서부터) 순차적 추가 - ArrayList < LinkedList
  public static long add1(List list){
    // System.currentTimeMillis() : 시스템의 현재 시각을 1/1000 초로 반환함
    //                              현재시각에서 1970년1월1일의 시각을 뺀 시각
    //                              시스템에 따라서 더 작은 단위로 표현될 수도 있음
    long start = System.currentTimeMillis();
    for(int i = 0; i < 1000000; i++){
      list.add(i + "");
    }
    long end = System.currentTimeMillis();
    // 메소드 실행 시간 반환
    return end - start;
  }
  // 중간에서 추가 - ArrayList > LinkedList
  public static long add2(List list){
    long start = System.currentTimeMillis();
    for(int i = 0; i < 10000; i++){
      list.add(500, "X");
    }
    long end = System.currentTimeMillis();
    return end - start;
  }
  // 순차적 삭제 - ArrayList < LinkedList
  public static long remove1(List list){
    long start = System.currentTimeMillis();
    for(int i = list.size() - 1; i >= 0; i--){
      list.remove(i);
    }
    long end = System.currentTimeMillis();
    return end - start;
  }
  // 중간에서 삭제 - ArrayList > LinkedList
  public static long remove2(List list){
    long start = System.currentTimeMillis();
    for(int i = 0; i < 10000; i++){
      list.remove(i);
    }
    long end = System.currentTimeMillis();
    return end - start;
  }


}
