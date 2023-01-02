public class Ex04 {
  public static void main(String[] args){
    User user1 = new User();
    System.out.println("user1.i : " + user1.i);
    System.out.println("user1.arrNum : " + user1.arrNum);

    for(int i = 0; i < user1.arrNum.length; i++){
      System.out.printf("%d ", user1.arrNum[i]);
    }
    System.out.println();

    user1.item = new Item();
    user1.item.i = 100;
    System.out.println("user1.item.i : " + user1.item.i);

    System.out.println("\n---------------------------");

    Item it1 = new Item();
    System.out.println("it1.i : " + it1.i);

  }
}

class Item{
  int i;
}
class User{
  Item item;
  int i;
  int[] arrNum;
  public User(){
    this.i = 200;
    this.arrNum = new int[3];
    // this.item = new Item();
  }

}