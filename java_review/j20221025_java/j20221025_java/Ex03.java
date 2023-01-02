import java.util.*;

public class Ex03 {
  public static void main(String[] args){
    HashMap map1 = new HashMap();
    map1.put("이순신", new Integer(100));
    map1.put("류성룡", new Integer(98));
    map1.put("선조", new Integer(86));
    map1.put("원균", new Integer(88));
    map1.put("이호", new Integer(92));

    System.out.println(map1);

    // iterator() 를 호출하고자
    // HashMap 의 entrySet() 메소드를 호출해서
    // Set  객체를 반환함
    Set set = map1.entrySet();
    Iterator iter = set.iterator();

    while(iter.hasNext()){
      Map.Entry e = (Map.Entry)iter.next();
      // Map.Entry 의 getKey() 메소드와
      // getValue() 메소드를 호출해서
      // key 와 value 를 반환받음
      System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue() + " 점");
    } // while

    // HashMap 클래스의 keySet() 메소드
    // HashMap 에 저장된 key 들을 Set 에 저장함
    Set set2 = map1.keySet();
    System.out.println("응시생 이름 : " +  set2);

    // HashMap 의 values() 메소드
    Collection values = map1.values();
    Iterator iter2 = values.iterator();

    // 총점
    int totalScore = 0;

    while(iter2.hasNext()){
      Integer score = (Integer)iter2.next();
      totalScore += score;
    }
    System.out.println("총점 : " + totalScore + " 점");
    System.out.println("평균 : " + (float)totalScore / set2.size() + " 점");
    System.out.println("최고점수 : " + Collections.max(values) + " 점");
    System.out.println("최저점수 : " + Collections.min(values) + " 점");


  } // main
} // class
