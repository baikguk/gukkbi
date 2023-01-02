public class Ex16 {
  public static void main(String[] args){
    Document d1 = new Document();
    Document d2 = new Document();
    Document d3 = new Document("자바기초.txt");
    Document d4 = new Document();
  }
}

class Document{
  static int count = 0;
  String name;

  // 기본 생성자
  public Document(){
    this("제목없음_" + ++count);
  }
  // 매개변수 있는 생성자
  public Document(String name){
    this.name = name;
    System.out.println("문서 " + this.name + " (이)가 생성되었습니다");
  }

}