import java.util.Stack;

public class Ex10 {
  public static Stack backward = new Stack();
  public static Stack  forward = new Stack();

  // 지정한 url 로 이동하기
  public static void goURL(String url){
    // 사용자가 지정한 page (String url) 를
    // backward 에 저장함
    backward.push(url);
    // forward 가 비어있지 않으면
    // forward 의 모든 item 을 삭제함
    if(!forward.empty()){
      forward.clear();
    }
  }
  // 뒤로 가기
  public static void goBackward(){
    // backward 가 비어있지 않으면
    // backward 의 맨 위에 있는 item 을 꺼내서
    // forward 에 저장함
    if(!backward.empty()){
      forward.push(backward.pop());
    }
  }
  // 앞으로 가기
  public static void goForward(){
    // forward 가 비어있지 않으면
    // forward 의 맨 위에 있는 item 을 꺼내서
    // backward 에 저장함
    if(!forward.empty()){
      backward.push(forward.pop());
    }
  }

  // 현재 페이지
  public static void printCurrentPage(){
    System.out.println("backward : " + backward);
    System.out.println("forward  : " + forward);
    System.out.println("현재 화면  : " + backward.peek());
    System.out.println("-------------------------------------------");
  }

  public static void main(String[] args){
    goURL("1.구글");
    goURL("2.네이버");
    goURL("3.다음");
    goURL("4.네이트");
    goURL("5.글로벌");

    printCurrentPage();

    System.out.println("뒤로가기 버튼 클릭 !!!");
    goBackward();
    printCurrentPage();

    System.out.println("뒤로가기 버튼 클릭 !!!");
    goBackward();
    printCurrentPage();

    System.out.println("앞으로가기 버튼 클릭 !!!");
    goForward();
    printCurrentPage();

    System.out.println("지정한 page 로 이동 !!!");
    goURL("6.카카오톡");
    printCurrentPage();

  }



}
