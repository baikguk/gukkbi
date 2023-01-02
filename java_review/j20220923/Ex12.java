/*
   break  :  (같은 code block 안에 있는) 이후의 모든 code 가 실행되지 않고
             break 가 속해 있는 code block 하나를 벗어남
              ㄴ 반복을 종료함
              (if 문의 code block ({ }) 은 무시함)

  continue : (같은 code block 안에 있는) 이후의 모든 code 가 실행되지 않고
             다음 반복으로 넘어감 (건너뛰고 반복을 계속함)
              (if 문의 code block ({ }) 은 무시함)
*/
public class Ex12 {
  public static void main(String[] args){

    for(int i = 1; i <= 10; i++){
      System.out.printf("%d ", i);
    }
    System.out.println("\n--------------------------------");

    for(int i = 1; i <= 10; i++){
      System.out.printf("%d ", i);
      if (i == 5){
        break;
      }
    }
    System.out.println("\n--------------------------------");

    for(int i = 1; i <= 10; i++){
      if (i == 5){
        break;
      }
      System.out.printf("%d ", i);
    }
    System.out.println("\n--------------------------------");

    for(int i = 1; i <= 10; i++){
      if (i == 5){
        continue;
      }
      System.out.printf("%d ", i);
    }
    System.out.println("\n--------------------------------");

    for(int i = 1; i <= 10; i++){
      System.out.printf("%d ", i);
      if (i == 5){
        continue;
      }
    }
    System.out.println("\n--------------------------------");
  }
}
