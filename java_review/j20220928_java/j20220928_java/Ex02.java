public class Ex02 {
  public static void main(String[] args){

    // int type array
    int[] arrInt1 = new int[10];
    int[] arrInt2 = new int[10];
    int[] arrInt3;
    arrInt3 = new int[]{100, 95, 80, 70, 60};

    // char type array
    char[] arrChar1 = {'g', 'l', 'o', 'b', 'a', 'l'};

    for(int i = 0; i < arrInt1.length; i++){
      // arrInt1[i] = ++i; <-- i 변수 공간 자체에 1을 증가시킴
      // i 변수 공간의 값은 변화시키지 않고 1을 더해서 할당함
      arrInt1[i] = i + 1;
      System.out.printf("%d ", arrInt1[i]);
    }
    System.out.println("\n-----------------------------------");

    // 변수 공간에 할당된 값을 사용해서 연산을 해도
    // 해당 변수 공간에 다른 값을 다시 할당하지 않으면
    //  ㄴ 할당연산을 안 하면
    // 해당 변수 공간에 할당되어 있는 값은 변하지 않음
    // ++(증가연산자), --(감소연산자) 는 예외
    // ++(증가연산자), --(감소연산자) 는 변수 공간에 할당된 값을
    // 1 증가시키거나 1 감소시킴
    char ch = 'G';
    System.out.println("ch (변환 전) : " + ch);
    System.out.println("소문자로 변환됨 : " + (char)(ch + ('a' - 'A')));
    // ch = (char)(ch + ('a' - 'A'));
    System.out.println("ch (변환 후) : " + ch);

    int number = 10;
    System.out.println("number : " + number);
    number = number + 1;
    System.out.println("number : " + number);
    number += 1;
    System.out.println("number : " + number);
    ++number;
    System.out.println("number : " + number);


  }
}
