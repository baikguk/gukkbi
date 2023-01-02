import java.util.ArrayList;
import java.util.List;

public class Ex10 {
  public static void main(String []args){
    // 한 줄에 출력할 개수
    final int LIMIT = 10;
    // 긴 문자열을 지정한 개수(10) 만큼만 한 줄에 출력하기
    String str1 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ!@#$%^&*()zzz";
    int len = str1.length();
    System.out.println("str1 의 길이 : " + len);

    // list 에 문자를 LIMIT 개 만큼씩 추가함
    // 크기를 len/LIMIT + 10 으로 정했으나
    // 크기를 지정하지 않아도
    // 저장되는 element 의 개수가 생성된 list 크기의
    // 80% 에 달하면 자동적으로 현재 list 크기의 2배의 크기로
    // 크기를 증가시킴
    List list = new ArrayList(len/LIMIT + 10);

    // 현재 list 의 각 index 에 문자를 LIMIT 개씩 저장함
    // 마지막 index 에는 (len % LIMIT) 개 만큼 저장함
    for(int i = 0; i < len; i += LIMIT){
      if(i + LIMIT < len){
        list.add(str1.substring(i, i + LIMIT));
      }else{
        list.add(str1.substring(i));
      }
    }

    // 현재 list 의 각 index 에는 문자가 LIMIT 개씩 저장되어 있음
    // 마지막 index 에는 (len % LIMIT) 개 만큼 저장되어 있음
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }


  }
}
