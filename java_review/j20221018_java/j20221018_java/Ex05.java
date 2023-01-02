public class Ex05 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");

    try {
      int[] numbers = new int[5];
      numbers[5] = 555;
      System.out.println("numbers[5] : " + numbers[5]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("index 범위를 넘어서 할당했습니다.");
    }

    System.out.println("프로그램 종료");
  }
}
