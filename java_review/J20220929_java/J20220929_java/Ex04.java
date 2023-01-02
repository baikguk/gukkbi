public class Ex04 {
  public static void main(String[] args){
    /*
       int type 배열 nums 를 크기 10으로 생성하고
       0 부터 9 까지의 정수 중 임의의 숫자들을 저장한 후
       nums 에 저장된 각 숫자들의 빈도수를 출력하세요
    */
    int[] nums = new int[10];

    for(int i = 0; i < nums.length; i++){
      nums[i] = (int)(Math.random() * 10);
      System.out.printf("%d ", nums[i]);
    }
    System.out.println("\n---------------------------------");

    int count0=0,  count1=0, count2=0, count3=0, count4=0,
        count5=0,  count6=0, count7=0, count8=0, count9=0;

    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 0){
        count0++;
      }else if(nums[i] == 1) {
        count1++;
      }else if(nums[i] == 2) {
        count2++;
      }else if(nums[i] == 3) {
        count3++;
      }else if(nums[i] == 4) {
        count4++;
      }else if(nums[i] == 5) {
        count5++;
      }else if(nums[i] == 6) {
        count6++;
      }else if(nums[i] == 7) {
        count7++;
      }else if(nums[i] == 8) {
        count8++;
      }else if(nums[i] == 9) {
        count9++;
      }
    }

    int[] counts = {count0, count1, count2, count3, count4,
                    count5, count6, count7, count8, count9};

    for(int i = 0; i < nums.length; i++) {
      System.out.printf("%d 의 개수 - %d 개%n", i, counts[i]);
    }

    System.out.println("---------------------------------");

    nums = new int[10];

    for(int i = 0; i < nums.length; i++){
      nums[i] = (int)(Math.random() * 10);
      System.out.printf("%d ", nums[i]);
    }
    System.out.println("\n---------------------------------");

    counts = new int[10];
    nums = new int[]{3, 2, 1, 5, 6, 5, 5, 2, 1, 7};

    for(int i = 0; i < counts.length; i++){
      counts[nums[i]]++;
    }

    for(int i = 0; i < nums.length; i++){
      System.out.printf("%d 의 개수 - %d 개%n", i, counts[i]);
    }



  }
}
