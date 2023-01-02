public class Ex16 {
  public static void main(String[] args){
    Test t1 = new Test(10);
    Test t2 = new Test(10);

    if(t1.equals(t2)){
      System.out.println("t1 == t2");
    }else{
      System.out.println("t1 != t2");
    }

    t2 = t1;

    if(t1.equals(t2)){
      System.out.println("t1 == t2");
    }else{
      System.out.println("t1 != t2");
    }



  }
}
class Test extends Object{
  int data;
  Test(int data){
    this.data = data;
  }
  // equals() 메소드 overriding
  // 객체의 주소가 아니라,
  // 멤버변수에 저장된 값을 가지고
  // 비교해서 값이 일치하면 true 를
  // 반환하도록 내용(body)을 변경함
  @Override
  public boolean equals(Object obj) {
    if(obj != null && obj instanceof Test){
      Test t = (Test)obj;
      return this.data == t.data;
    }
    return false;
  }
}







