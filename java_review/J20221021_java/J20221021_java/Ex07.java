import java.util.LinkedList;

public class Ex07 {
  public static void main(String[ ]args){

    // stack
    // First Input Last Output : FILO

    LinkedList<Integer> stack = new LinkedList<>();

    stack.addLast(new Integer(15));
    stack.addLast(47);
    stack.addLast(9);
    stack.addLast(32);


    System.out.println(stack);

    int number = stack.getLast();
    System.out.println("number : " + number);
    System.out.println("---------------");

    while(!stack.isEmpty()){
      System.out.println(stack.removeLast());
      System.out.println(stack);
    }

    /*

    for 문을 사용해서
    i < stack.size() 조건을 지정하면
    removeLast() 호출 후에 size 가 변경되므로
    올바른 결과가 나오지 않음

    for(int i = 0; i < stack.size(); i++){
      System.out.println(stack.removeLast());
      System.out.println(stack);
    }
    */
  }
}
