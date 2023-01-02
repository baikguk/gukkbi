import java.util.Objects;

public class Ex18 {
  public static void main(String[] args){
    Name n1 = new Name("순신", "이");
    Name n2 = new Name("순신", "이");
    // equals(), hashCode() 메소드를
    // Overriding 해서 아래의 결과가
    // true 가 나오도록 해 보세요
    System.out.println(n1.equals(n2));
  }
}
class Name{
  String firstName;
  String lastName;
  Name(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName  = lastName;
  }
  @Override
  public boolean equals(Object obj){
    if(obj != null && obj instanceof Name){
      Name n = (Name)obj;
      return this.firstName == n.firstName && this.lastName == n.lastName;
    }
    return false;
  }
  @Override
  public int hashCode() {
    return (this.firstName + this.lastName).hashCode();
  }
}
