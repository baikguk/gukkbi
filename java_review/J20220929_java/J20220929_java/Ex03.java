public class Ex03 {
  public static void main(String[] args){

    // bubble sort
    int[] nums = {4, 3, 6, 6, 3, 7, 4, 4, 3, 8};
    for(int i = 0; i < nums.length; i++){
      System.out.printf("%d ", nums[i]);
    }
    System.out.println("\n===============================");

    for(int i = 0 ; i < nums.length - 1; i++){
      // 외부 for 문이 반복될 때마다 changed 는 false 로 초기화됨
      boolean changed = false;

      for(int j = 0; j < nums.length - 1 - i; j++){
        // nums[j] > nums[j+1] 가 true 이면 정렬하고
        // nums[j] > nums[j+1] 가 flase 이면 정렬 안 함
        if(nums[j] > nums[j+1]){
          // swapping
          int cup = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = cup;
          // 자리바꿈이 일어남
          changed = true;
        }
      }
      // 정렬이 완성됨 : 외부 for 문을 빠져나감
      if(!changed){
        break;
      } // inner for

      for(int k = 0; k < nums.length; k++){
        System.out.printf("%d ", nums[k]);
      }
      System.out.println();
    } // outer for

    System.out.println("\n===============================");
    for(int i = 0; i < nums.length; i++){
      System.out.printf("%d ", nums[i]);
    }

  } // main
}
