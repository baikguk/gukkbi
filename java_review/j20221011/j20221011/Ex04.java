public class Ex04 {
  public static void main(String[] args){
    // Data1 객체를 생성할 때는 왜 오류가 발생하지 않는가?
    Data1 d1 = new Data1();
    // Data2 클래스에는 매개변수 있는 생성자만
    // 정의되어 있어서 compiler 가 기본생성자를
    // 자동으로 만들어 주지 않음
    // Data2 d2 = new Data2();
    Data2 d2_1 = new Data2(1234);
  }
}
class Data1{
  int value;
  public void setValue(int value){
    this.value = value;
  }
}
class Data2{
  int value;
  public Data2(int value){
    this.value = value;
  }
}








