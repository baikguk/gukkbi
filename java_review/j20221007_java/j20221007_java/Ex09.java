public class Ex09 {
  public static void main(String[] args){
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("-- change(int[] arr1) 호출 전 --");
    System.out.println("numbers[2] : " + numbers[2]);

    change(numbers);
    System.out.println("-- change(int[] arr1) 호출 후 --");
    System.out.println("numbers[2] : " + numbers[2]);
  }
  // parameter 의 type 이 reference type  이면
  // Call by Reference : 주솟값을 전달(복사) 해서 메소드를 호출함
  public static void change(int[] arr1){
    arr1[2] = 3333;
  }
}
