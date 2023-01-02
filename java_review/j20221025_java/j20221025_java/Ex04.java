
// HashMap 사용해서 전화번호부 만들기

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04 {
  static HashMap phoneBook = new HashMap();

  // 그룹명을 전달받아서 전화번호부에 그룹명 추가하기
  static void addGroup(String groupName){
    // 이미 있는 그룹명은 다시 저장하지 않음
    // 저장하고자 하는 그룹명이 phoneBook 에 이미 저장되어 있지 않을 때
    // groupName 과  HashMap 객체를 저장함
    if(!phoneBook.containsKey(groupName)) {
      phoneBook.put(groupName, new HashMap());
    }
  }
  // 그룹명과 사람이름, 전화번호를 받아와서
  // 그룹에 전화번호를 추가하기
  static void addPhoneNo(String groupName, String tel, String name){
    addGroup(groupName);
    HashMap group = (HashMap)phoneBook.get(groupName);
    group.put(tel, name);
  }
  // 그룹을 정하기가 애매한 사람의 전화번호 저장하기
  static void addPhoneNo(String tel, String name) {
    addPhoneNo("기타", tel, name);
  }

  // 전화번호부 출력하기
  static void printPhoneBook(){
    Set set = phoneBook.entrySet();
    Iterator iter = set.iterator();

    while(iter.hasNext()){
      // Map.Entry e 에서 받은 key 는 groupName 이고
      // value 는 tel, name 을 key 와 value 로 갖고 있는 HashMap 객체임
      Map.Entry e = (Map.Entry)iter.next();

      Set telNameSet = ((HashMap)e.getValue()).entrySet();
      Iterator telNameIter = telNameSet.iterator();

      System.out.println(e.getKey() + " [" + telNameSet.size() + " 명]");

      while(telNameIter.hasNext()){
        Map.Entry telNameE = (Map.Entry)telNameIter.next();
        String telNo = (String)telNameE.getKey();
        String name  = (String)telNameE.getValue();
        System.out.println(name + " " + telNo);
      } // inner while
      System.out.println();
    } // outer while

  } // printPhoneBook


  public static void main(String[] args){
    addPhoneNo("학원", "010-1111-1111", "이순신");
    addPhoneNo("학원", "010-2222-2222", "안중근");
    addPhoneNo("학원", "010-3333-3333", "유관순");
    addPhoneNo("친구", "010-1234-1234","류성룡");
    addPhoneNo("친구", "010-5555-5555", "윤봉길");
    addPhoneNo("친구", "010-3216-9875", "이재명");
    addPhoneNo("친구", "010-9874-6532", "양만춘");
    addPhoneNo("010-6549-8735", "글로벌");

    printPhoneBook();
  }
}
