public class Ex06 {
  public static void main(String[] args){
    char[] abc = {'A', 'B', 'C', 'D'};
    char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    System.out.println(abc);
    System.out.println(num);
    System.out.println("----------------------------------");

    /*
      배열 abc 와 배열 num 을 하나로 붙여서
      result 라는 배열로 생성하기
    */
    
    // char type 의 배열 result 생성하기
    // 이 배열의 크기는 배열 abc 와 num 의 크기로 함
    char[] result = new char[abc.length + num.length];

    // result 배열 앞 부분에 abc 배열의 item 들을 저장하고
    /*
    result[0] = abc[0];
    result[1] = abc[1];
    result[2] = abc[2];
    result[3] = abc[3];
    */
    for(int i = 0; i < abc.length; i++){
      result[i] = abc[i];
      System.out.printf("%c ", result[i]);
    }
    System.out.println("\n----------------------------------");

    // result 배열 뒷 부분에 num 배열의 item 들을 저장함
    for(int i = 0; i < num.length; i++){
      result[abc.length + i] = num[i];
      System.out.printf("%c ", result[i]);
    }
    System.out.println("\n----------------------------------");

    System.out.println(result);
    System.out.println("----------------------------------");

    for(int i = 0; i < result.length; i++){
      System.out.printf("%c ", result[i]);
    }
    System.out.println("\n----------------------------------");

  }
}

