public class Ex11 {
  public static void main(String[ ]args){

    // A : 65, a : 97, 0 : 48

    char c1 = 'a';
    char c2 = c1;
    char c3 = ' ';
    System.out.printf("c1 : %c, c2 : %c, c3 : %c%n", c1, c2, c3);

    int i = c1 + 1;
    System.out.printf("i : %d%n", i);

    c3 = (char)(c1 + 1);
    c2++;
    c2++;
    System.out.printf("c2 : %c, c3 : %c%n", c2, c3);

    char c4 = 'a';

    // char c5 = c4 + 1;

    char c6 = 'a' + 1;
    System.out.println("c6 : " + c6);


  }

}
