public class Ex09 {
  public static void main(String[] args){
    // setter : (객체를 생성한 후)
    //          멤버변수에 값을 할당하는 메소드
    //          멤버변수 하나 당 setter 하나를 작성함
    // getter : 멤버변수의 값을 반환하는 메소드
    //          멤버변수 하나 당 getter 하나를 작성함

    Student s1 = new Student();

    // setName() 를 호출해서 "이름 : 이순신" 을 출력하세요
    s1.setName("이순신");
    System.out.println("이름 : " + s1.name);

    // setStdNumber() 를 호출해서 "학번 : 202201" 을 출력하세요
    s1.setStdNumber(202201);
    System.out.println("학번 : " + s1.stdNumber);

    // setHeight() 를 호출해서 "키 : 187" 을 출력하세요
    s1.setHeight(187);
    System.out.println("키 : " + s1.height);

    // getter 를 호출해서 멤버변수 값 알아보기
    System.out.println("이름 : " + s1.getName());
    System.out.println("학번 : " + s1.getStdNumber());
    System.out.println("키 : " + s1.getHeight());

  }
}
class Student{
  String name;
  int stdNumber;
  int height;

  public void setName(String name){
    this.name = name;
  }
  public void setStdNumber(int stdNumber){
    this.stdNumber = stdNumber;
  }
  public void setHeight(int height){
    this.height = height;
  }
  // 멤버변수 name 에 저장된 값을 반환하는 메소드를 작성하세요
  // public 리턴타입 메소드이름(parameter){   }
  public String getName(){
    return this.name;
  }
  // 멤버변수 stdNumber 에 저장된 값을 반환하는 메소드를 작성하세요
  public int getStdNumber(){
    return this.stdNumber;
  }
  // 멤버변수 height 에 저장된 값을 반환하는 메소드를 작성하세요
  public int getHeight(){
    return this.height;
  }

}



