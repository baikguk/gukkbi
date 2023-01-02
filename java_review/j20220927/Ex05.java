import java.util.Scanner;

/*
  Reference Variable (참조 변수)
    1) primitive type (기본자료형) 이 아닌
       모든 type 은 reference type 임
    2) HEAP MEMORY 영역에 loading 되어있는
       data(객체:object(instance))의 주소를 저장함
    3) 지역변수로 선언되는 경우도 있고
       멤버변수로도 선언되는 경우도 있음
    4) 클래스 type 의 변수, 배열 type 의 변수가 이에 속함
       (class == type)
*/
public class Ex05 {
  public static void main(String[] args){
    Ex05 ex = new Ex05();
    ex = null;

    int number = 100;

    // array
    int[] numbers = new int[]{1, 2, 3, 4, 5};


  }
}
