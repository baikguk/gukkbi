import java.util.Vector;

public class Ex01 {
  public static void main(String[] args){

    /*
      ArrayList         <-- Vector - 동기화 기본
       ㄴ 동기화 선택
      LinkedList
    */
    
    Vector v1 = new Vector();
    printVector(v1);

    v1.add(new String("1"));
    v1.add("2");
    v1.add("3");
    printVector(v1);

    // size 와 capacity 를 같게 만들기
    v1.trimToSize();
    printVector(v1);

    // capacity 를 6으로 하기
    v1.ensureCapacity(6);
    printVector(v1);

    // size 를 7로 하기
    v1.setSize(7);
    printVector(v1);

    // element 모두 삭제하기
    v1.clear();
    printVector(v1);


  } // main

  public static void printVector(Vector v){
    System.out.println(v);
    System.out.println("size : " + v.size());
    System.out.println("capacity : " + v.capacity());
    System.out.println("----------------------------------");
  }
}




