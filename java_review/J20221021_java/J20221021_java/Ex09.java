import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Ex09 {
  public static void main(String[] args){

    Stack st = new Stack();

    st.push("0");
    st.push("1");
    st.push("2");
    st.push("3");
    st.push("4");
    System.out.println(st);

    while(!st.isEmpty()){
      System.out.println(st.pop());
      System.out.println(st);
    }
    System.out.println("------------------");

    Queue queue = new LinkedList();

    queue.offer("0");
    queue.offer("1");
    queue.offer("2");
    queue.offer("3");
    queue.offer("4");
    System.out.println(queue);

    while(!queue.isEmpty()){
      System.out.println(queue.poll());
      System.out.println(queue);
    }
    System.out.println("------------------");
  }
}
