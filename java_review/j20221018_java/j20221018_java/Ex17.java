public class Ex17 {
  public static void main(String[] args){
    Student s1 = new Student("이순신");
    Student s2 = new Student("이순신");

    // 아래의 결과가 true 가 나오도록
    // Student 클래스의 equals() 메소드를
    // Overriding 하세요

    System.out.println("s1.equals(s2) : " + s1.equals(s2));
  }
}
class Student{
  String name;
  Student(String name){
    this.name = name;
  }
  @Override
  public boolean equals(Object obj) {
    if(obj != null && obj instanceof Student){
      Student s = (Student)obj;
      return this.name == s.name;
      // return this.name == ((Student)obj).name;
    }
    return false;
  }
  // hashCode() overriding
  @Override
  public int hashCode() {
    return this.name.hashCode();
  }
}