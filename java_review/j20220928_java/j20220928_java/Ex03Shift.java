public class Ex03Shift {
  public static void main(String[] args){
    /*
      bit operation
      shift operation :  쉬프트 연산
      <<,  >>

      << : left shift operator : 레프트쉬프트
        ㄴ 변수 << 정수 : 변수의 bit 가 지정한 정수만큼 왼쪽으로 이동함
                          정수부분만 반환함
                          지정한 정수를 지수로 하고 밑은 2로하는 수만큼 증가함
                           ㄴ 2 배씩 증가함

        int num = 5;   //  0 1 0 1

        num << 1         0 1 0 1    : 5
                       0 1 0 1      : 10
        num << 2         0 1 0 1    : 5
                       0 1 0 1      : 10
                     0 1 0 1        : 20

      >> : right shift operator : 라이트쉬프트
        ㄴ 변수 >> 정수 : 변수의 bit 가 지정한 정수만큼 오른쪽으로 이동함
                          정수부분만 반환함
                          지정한 정수를 지수로 하고 밑은 2로하는 수만큼 감소함
                           ㄴ 2 배씩 감소함

        num >> 1         0 1 0 1    : 5
                           0 1 0    : 2

    */
    int num = 5;   //  0 1 0 1
    System.out.println(num);
    System.out.println(num << 1);
    System.out.println(num << 2);
    System.out.println(num << 3);
    System.out.println(num << 4);
    System.out.println("------------------------");

    System.out.println(num >> 1);
    System.out.println(num >> 2);
    System.out.println(num >> 3);
    System.out.println(num >> 4);
    System.out.println("------------------------");

    System.out.println(num);
    // System.out.println(num = num << 2);
    num = num << 2;
    System.out.println(num);
  }
}


