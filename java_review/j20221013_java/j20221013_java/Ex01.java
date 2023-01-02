public class Ex01 {
  public static void main(String[] args){
    // 부모 type 의 참조변수는 자식객체의 주소를 할당받을 수 있음
    // 자식 type 의 참조변수는
    // 부모 type 의 참조변수가 저장하고 있는 주소를 할당받을 수 있음
    // 자식 type 의 참조변수는 (자식객체 속에 있는)부모객체의 주소를 할당받을 수 있음 - (O)
    // 자식 type 의 참조변수는 (혼자 있는)부모객체의 주소를 할당받을 수 있음 - (X)
    Teacher t1 = new Teacher();
    Teacher s1 = new Student1();
    Teacher s2 = new Student2();

    if(s2 instanceof Student1){ // false
      System.out.println("s2 는 Student1 객체의 주소를 저장하고 있음");
      Student1 std1 = (Student1)s2;
    }
    if(s2 instanceof Student2){ // true
      System.out.println("s2 는 Student2 객체의 주소를 저장하고 있음");
      Student2 std2 = (Student2)s2;
    }
    if(t1 instanceof Student1){ // false
      System.out.println("t1 는 Student1 객체의 주소를 저장하고 있음");
      // Teacher t1
      // Teacher s1
      // 참조변수의 형변환은
      // 선언된 type 으로 표시해도 되고
      // 실제 저장하고 있는 type 으로 표시해도 됨
      // s1 = (Student1)t1;
      s1 = (Teacher)t1;
    }
    if(s2 instanceof Teacher){ // true
      System.out.println("s2 는 Teacher 객체의 주소를 저장하고 있음");
      Teacher tch = s2;
    }

  }
}

class Teacher{
  public void study(){
    System.out.println("선생님께서 공부를 하십니다");
  }
}
class Student1 extends Teacher{
  @Override
  public void study(){
    System.out.println("학생1이 공부를 합니다");
  }
}
class Student2 extends Teacher{
  @Override
  public void study(){
    System.out.println("학생2가 공부를 합니다");
  }
}
