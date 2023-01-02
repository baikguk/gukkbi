import java.util.HashMap;

public class Ex01_1 {
  public static void main(String[] args){
    HashMap<String, Integer> map1 = new HashMap<String, Integer>();
    map1.put(new String("해리 포터"), 92);
    map1.put(new String("헤르미온느 그레인저"), 100);
    map1.put(new String("론 위즐리"), 86);
    map1.put(new String("네빌 롱바텀"), 88);
    map1.put(new String("드레이코 말포이"), 90);

    System.out.println(map1);

    // key 로 value 찾기 - get() 메소드 호출
    // map1.get(key 지정);
    int score = map1.get(new String("헤르미온느 그레인저"));
    System.out.println("헤르미온느 그레인저의 점수는 " + score + " 점입니다");
  }
}








