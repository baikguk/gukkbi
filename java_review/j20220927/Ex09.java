public class Ex09 {
  public static void main(String []args){

    // 배열의 선언과 생성

    // 1) 배열 변수 선언 후 배열 생성하기
    int[] arrInt1;
    arrInt1 = new int[5];

    // 2) 배열 변수 선언 과 동시에 배열 생성하기
    int[] arrInt2 = new int[5];

    // 3) (배열 변수 선언) + 배열을 생성하면서 동시에 초기화하는 방법
    // int type 의 공간 5개를 Heap Memory 영역에
    // 연속적으로 생성하고
    // 첫 번째 요소는 10으로, 두 번째 요소는 20으로, 세 번째 요소는 30으로,
    // 네 번째 요소는 40으로, 다섯 번째 요소는 50으로 초기화함
    // int 배열 type 변수 arrInt3 에 이 배열의 주소를 할당함
    int[] arrInt3 = new int[]{10, 20, 30, 40, 50};




  }
}
