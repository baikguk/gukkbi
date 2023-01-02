import java.util.LinkedList;

public class Ex08 {
  public static void main(String[] args){
    LinkedList<String> queue = new LinkedList<String>();

    queue.offer("토끼");
    queue.offer("사슴");
    queue.offer("호랑이");
    System.out.println(queue);

    String animal = queue.peek();
    System.out.println("animal : " + animal);
    System.out.println("----------------------");

    animal = queue.peek();
    System.out.println("animal : " + animal);
    System.out.println("----------------------");

    animal = queue.poll();
    System.out.println("animal : " + animal);
    System.out.println(queue);
    System.out.println("----------------------");

    queue.offer("사자");
    queue.offer("기린");
    queue.offer("코알라");
    System.out.println(queue);
    System.out.println("--------------------------------");

    while(!queue.isEmpty()){
      System.out.println(queue.poll());
      System.out.println(queue);
    }

  }
}
