public class Ex06_1 {
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

    // System 클래스의 static 메소드인 arraycopy() 메소드 사용하기
    // result 배열 앞 부분에 abc 배열의 item 들을 저장하고
    // System.arraycopy(원본배열, 시작index, 복사본배열, 시작index, 복사할개수);
    System.arraycopy(abc, 0, result, 0, abc.length);
    System.out.print("result : ");
    System.out.println(result);

    // result 배열 뒷 부분에 num 배열의 item 들을 저장함
    System.arraycopy(num, 0, result, abc.length, num.length);
    System.out.print("result : ");
    System.out.println(result);

  }
}

