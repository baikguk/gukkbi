import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03 {
  public static void main(String[] args){
    ArrayList  al = new ArrayList();
    LinkedList ll = new LinkedList();

    add(al);
    add(ll);

    System.out.println("-- ArrayList 와 LinkedList 에서 element 에 접근하는 시간 비교하기 --");
    System.out.println("ArrayList  : " + accessList(al));
    System.out.println("LinkedList : " + accessList(ll));
  }
  // element 추가하기
  public static void add(List list){
    for(int i = 0; i < 1000000; i++){
      list.add(i+"");
    }
  }
  // 접근시간 측정하기
  public static long accessList(List list){
    // System.currentTimeMillis() : 시스템의 현재 시각을 1/1000 초로 반환함
    long start = System.currentTimeMillis();
    for(int i = 0; i < 10000; i++){
      list.get(i);
    }
    long end = System.currentTimeMillis();
    // 메소드 실행 시간 반환
    return end - start;
  }

}
