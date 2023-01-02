public class Ex08 {
  public static void main(String[] args){
    // 생성자 : 객체가 생성될 때 멤버변수를 초기화함
  }
}

class C{
  int num1;
  int num2;

  public C(){
    this(10, 20);
  }
  public C(int num1){
    this.num1 = num1;
  }
  // num1 은 C(int num1) 생성자를 통해서 초기화함
  public C(int num1, int num2){
    this(num1);
    this.num2 = num2;
  }

}









