import java.util.HashMap;

/*
                     index 가 없음 (순서 없이 저장됨)
  Map (인터페이스) - data 를 key 와 value 쌍으로 저장함
                             key 로 value 를 저장하고
                             key 로 value 를 조회함
                             key 중복 X / value 중복 O
  ㄴ HashMap(신버전-동기화선택) (구버전 : HashTable-동기화기본)
      Map 인터페이스를 구현한 대표적인 Collection class
      순서를 유지하려면 LinkedHashMap 을 사용함
  ㄴ TreeMap
      범위 검색과 정렬할 때 주로 사용함
      HashMap  보다 data 추가, 삭제에 시간이 더 걸림

                  Map
                   |
       ------------------------
       |           |         |
   HashTable   HashMap   SortedMap
                   |         |
          LinkedHashMap   TreeMap

*/
public class Ex01 {
  public static void main(String[] args){
    HashMap<Name, Integer> map1 = new HashMap<Name, Integer>();
    map1.put(new Name("해리", "포터"), 92);
    map1.put(new Name("헤르미온느", "그레인저"), 100);
    map1.put(new Name("론", "위즐리"), 86);
    map1.put(new Name("네빌", "롱바텀"), 88);
    map1.put(new Name("드레이코", "말포이"), 90);

    System.out.println(map1);

    // key 로 value 찾기 - get() 메소드 호출
    // map1.get(key 지정);
    int score = map1.get(new Name("해리", "포터"));
    System.out.println("해리 포터의 점수는 " + score + " 점입니다");
  }
}
class Name{
  String firstName;
  String lastName;
  Name(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName  = lastName;
  }
  @Override
  public String toString(){
    return this.firstName + " " + this.lastName;
  }
  // equals() 메소드와 hashCode() 메소드를 overriding 하세요
  @Override
  public boolean equals(Object obj){
    if(obj instanceof Name){
      Name n = (Name)obj;
      return this.firstName == n.firstName && this.lastName == n.lastName;
    }
    return false;
  }
  @Override
  public int hashCode(){
    return (this.firstName + this.lastName).hashCode();
  }
}








