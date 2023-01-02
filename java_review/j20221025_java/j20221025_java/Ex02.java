import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args){
    HashMap map1 = new HashMap();
    /*
      아직 없는 key 를 지정하고 value 를 저장하면
      새로운 key 와 value 가 쌍으로 저장됨
      이미 있는 key 를 지정하고 value 를 저장하면
      key 는 변함이 없고 value 만 새로운 값으로 변경됨
    */
    map1.put("global", "123465");
    map1.put("java", "98764");
    map1.put("html", "948571");
    map1.put("global", "789456");
    map1.put("python", "654987321");

    System.out.println("map1 : \n" + map1);

    // key : 아이디, value : 비밀번호
    Scanner sc = new Scanner(System.in);

    while(true){
      System.out.println("아이디와 비밀번호를 입력하세요");
      System.out.print("id : ");
      String id = sc.nextLine().trim();
      System.out.print("password : ");
      String password = sc.nextLine().trim();
      System.out.println();

      // HashMap 에서 어떤 값이 key 로 들어있는지 확인하기
      // containsKey() 메소드
      // map1.containsKey(값)
      if(!map1.containsKey(id)){
        System.out.println("입력하신 id 는 존재하지 않습니다. 다시 입력해 주세요");
        continue;
      }else{
        // 입력한 id 가 있음 - 비밀번호도 확인함
        //  HashMap 클래스의 get() 메소드를 호출할 때
        //  argument 에 key 넣어주면 value 를 반환함
        if(!map1.get(id).equals(password)){
          System.out.println("입력하신 비밀번호는 존재하지 않습니다. 다시 입력해 주세요");
        }else{
          System.out.println("id 와 비밀번호가 일치합니다. 로그인 성공 !!!");
          break;
        } // inner if
      } // outer if

    } // while

  } // main
} // class