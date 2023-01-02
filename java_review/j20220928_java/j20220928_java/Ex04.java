public class Ex04 {
  public static void main(String[] args){
    // int type array
    int[] arrInt1 = new int[10];
    int[] arrInt2 = new int[10];
    int[] arrInt3;
    arrInt3 = new int[]{100, 95, 80, 70, 60};

    // char type array
    char[] arrChar1 = {'g', 'l', 'o', 'b', 'a', 'l'};

    for(int i = 0; i < arrInt1.length; i++){
      arrInt1[i] = i + 1;
      System.out.printf("%d ", arrInt1[i]);
    }
    System.out.println("\n-----------------------------------");

    // arrInt2 에 1 부터 10까지의 숫자 중에서 임의의 정수를
    // 저장하고 출력하는 for 문을 작성하세요
    for(int i = 0 ; i < arrInt2.length ; i++){
      arrInt2[i] = (int)(Math.random() * 10) + 1;
      System.out.printf("%d ", arrInt2[i]);
    }
    System.out.println("\n-----------------------------------");

    // arrInt3 에 저장된 값들을 출력하는 for 문을 작성하세요
    for(int i = 0 ; i < arrInt3.length ; i++){
      System.out.printf("%d ", arrInt3[i]);
    }
    System.out.println("\n-----------------------------------");

    // arrChar1 에 저장된 값들을 출력하는 for 문을 작성하세요
    for(int i = 0; i < arrChar1.length; i++){
      System.out.printf("%c ", arrChar1[i]);
    }
    System.out.println("\n-----------------------------------");

    // 배열 변수 출력하기
    //  ㄴ
    System.out.println(arrInt1);
    System.out.println(arrInt2);
    System.out.println(arrInt3);
    System.out.println("-----------------------------------");

    // char (type) 배열 변수를 출력하면
    // char 배열의 item 들이 그대로 출력됨
    System.out.println(arrChar1);

    // char 배열을 문자열로 변환하기
    System.out.println(new String(arrChar1));

    // global 이라는 문자열을 생성한 것과 결과가 같음
    // global 문자열이 constant pool 에 저장됨
    System.out.println("global");
    // String 객체가 생성됨 : global 이라는 문자열이 heap memory 에 저장됨
    System.out.println(new String("global"));

  }
}
