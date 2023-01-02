import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11 {
  public static void main(String[] args){
    if(args.length != 1){
      System.out.println("입력예) \"((2+3*1)+5)\"");
      System.out.println("입력예에 나온대로 입력해 주세요\n프로그램을 종료합니다");
      // return <- main() 메소드를 종료함
      // JVM 을 종료함
      System.exit(0);
    }

    Stack st1 = new Stack();
    String expression = args[0];

    System.out.println("입력한 수식 : " + expression);

    // 수식에 입력한 괄호를 바르게 입력했는지 확인하기
    // 열리는 괄호가 없이 닫히는 괄호가 있는 경우에는
    // st1 에 item 이 없는 상태에서 pop() 을 시도하게 되어서
    // EmptyStackException 이 발생함 <- 예외처리를 해 줌

    try {
      for(int i = 0; i < expression.length(); i++){
        char ch = expression.charAt(i);
        // 열리는 괄호는 st1 에 저장하고
        if(ch == '('){
          st1.push(ch);
          // 닫히는 괄호는 st1 에서 삭제함
        }else if(ch == ')'){
          st1.pop();
        }
      }
      if(st1.isEmpty()){
        System.out.println("괄호가 맞습니다");
      }else{
        System.out.println("열리는 괄호와 닫히는 괄호가 다릅니다");
      }
    } catch (EmptyStackException e) {
      System.out.println("열리는 괄호와 닫히는 괄호가 다릅니다");
    }


  }
}
