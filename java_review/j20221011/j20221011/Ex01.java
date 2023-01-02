public class Ex01 {
  public static void main(String[] args){

    MathClass mc = new MathClass();

    // 인스턴스 메소드 호출
    long result = mc.add();
    System.out.println(result);
    result = mc.subtract();
    System.out.println(result);
    result = mc.multiply();
    System.out.println(result);
    result = mc.divide();
    System.out.println(result);
    System.out.println("-----------------");

    // 스태틱 메소드 호출
    // 객체에서 호출할 수 있으나
    // 클래스 이름으로 호출하는 것이 바람직함
    System.out.println(MathClass.add(200L, 100L));
    System.out.println(MathClass.subtract(200L, 100L));
    System.out.println(MathClass.multiply(200L, 100L));
    System.out.println(MathClass.divide(200L, 100L));
    System.out.println("-----------------");

    System.out.println("mc.total(new int[5]) : " + mc.total(new int[5]));
    int[] numbers1 = new int[5];
    result = mc.total(numbers1);
    System.out.println(result);

    System.out.println("mc.total(new int[]{1, 2, 3}) : " + mc.total(new int[]{1, 2, 3}));
    int[] numbers2 = new int[]{1, 2, 3};
    result = mc.total(numbers2);
    System.out.println(result);

  }
}

class MathClass{
  long a = 200L, b = 100L;

  public long add(){
    return a + b;
  }
  public long subtract(){
    return a - b;
  }
  public long multiply(){
    return a * b;
  }
  public long divide(){
    return a / b;
  }


  public static long add(long a, long b){
    return a + b;
  }
  public static long subtract(long a, long b){
    return a - b;
  }
  public static long multiply(long a, long b){
    return a * b;
  }
  public static long divide(long a, long b){
    return a / b;
  }

  public int total(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }
}
