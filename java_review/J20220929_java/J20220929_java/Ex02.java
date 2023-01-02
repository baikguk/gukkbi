public class Ex02 {
  public static void main(String[] args){

    int[] numbers = new int[]{1, 2, 3, 4, 5};

    for(int i = 0; i < numbers.length; i++){
      System.out.printf("%d ", numbers[i]);
    }
    System.out.println("\n---------------------------");

    for(int number : numbers){
      System.out.printf("%d ", number);
    }
    System.out.println("\n---------------------------");

    for(int number : new int[]{1, 2, 3, 4, 5}){
      System.out.printf("%d ", number);
    }
    System.out.println("\n---------------------------");

    char[] letters = new char[]{'a','b','c','d','e','f'};

    for(char ch   :  letters ){
      System.out.printf("%c ", ch);
    }
    System.out.println("\n---------------------------");


  }
}
