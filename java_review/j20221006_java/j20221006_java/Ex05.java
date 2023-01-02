public class Ex05 {
  public static void main(String[] args){

    int number;
    // int number;

    System.out.println(add(3.14F));
    System.out.println(add(1234));
    System.out.println(add(10, 20));
    System.out.println(add(1, 2, 3));
    System.out.println(add(123, 12.34F));
    System.out.println(add(6.25F, 987));

  }
  /*
   - method overloading -
    메소드의 이름이 같아도
    parameter 의 type(종류), 순서, 개수 중 하나가 다르면
    다른 메소드로 인식해서 중복 오류가 발생하지 않는 문법

    return type 은 method overloading 에 영향을 미치지 않음
  */
  public static float add(float num1){
    return num1 + 10;
  }
  public static int add(int num1){
    return num1 + 10;
  }
  public static int add(int num1, int num2){
    return num1 + num2;
  }
  public static int add(int num1, int num2, int num3){
    return num1 + num2 + num3;
  }
  public static float add(int num1, float num2){
    return num1 + num2;
  }
  public static float add(float num1, int num2){
    return num1 + num2;
  }


}
