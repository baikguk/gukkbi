import java.util.Arrays;

public class Ex01 {

  // Call by Reference
  // 메소드를 호출할 때 주소를 전달(복사)하면서 호출함
  // method1() 의 parameter(지역변수 number) 의 값을 변경하면
  // main() 의 지역변수(number)에 영향을 미침

  public static void method1(int[] number){
    number[2] = 333;
    return;
  }
  public static void main(String[] args){

    int[] number = {1, 2, 3, 4, 5};

    System.out.println("-- method1(int[] number) 호출 전 --");
    System.out.println(Arrays.toString(number));

    method1(number);
    System.out.println("-- method1(int[] number) 호출 후 --");
    System.out.println(Arrays.toString(number));

  }
}
