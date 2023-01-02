/*
  익명 클래스 : anonymous class
    형식]
    new 부모클래스이름생성자()  { 익명클래스 };
             ㄴ 생성자이름으로 사용한 이름의 클래스가 부모클래가 됨
    익명클래스를 정의하는 code 가
    익명클래스의 객체를 생성하는 code 가 됨
    객체를 1회성으로 생성해서 사용하는 경우에 사용함
     ㄴ 재활용이 안 됨

*/
public class Ex11 {
  Object iv = new Object(){
    // 클래스
    int x, y;
    int add(int x, int y){
      return x + y;
    }
    void method(){ }
  };
  static Object cv = new Object(){ void method(){} };
  void method1(){
    Object lv = new Object(){ void method(){} };
  }
}
