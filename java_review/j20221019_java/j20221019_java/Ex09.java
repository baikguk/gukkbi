public class Ex09 {
  public static void main(String[] args) throws Exception{
    // 크기가 0 인 배열 생성하기
    char[] arrChar = new char[0];
    System.out.println("arrChar 의 크기 : " + arrChar.length);

    // 크기가 0 인 char type 배열을
    // String 생성자의 argument 로 넣어서
    // String 객체를 생성하면 빈문자열이 됨
    // 빈문자열을 출력하면 아무것도 출력되지 않음
    String str1 = new String(arrChar);
    System.out.println("+++" + str1 + "+++");

    System.out.println("--------------------");

    Card c1 = new Card("HEART", 7);
    System.out.println("c1 : " + c1);

    Card c2 = Card.class.newInstance();
    System.out.println("c2 : " + c2);

    Class class1 = c1.getClass();
    System.out.println("class1.getName()  : " + class1.getName());
    System.out.println("class1.toString() : " + class1.toString());
    System.out.println("class1.toGenericString()  : " + class1.toGenericString());

  }
}
final class Card{
  String kind;
  int number;
  public Card(){
    this("SPADE", 5);
  }
  public Card(String kind, int number){
    this.kind = kind;
    this.number = number;
  }
  @Override
  public String toString(){
    return this.kind +  " - " + this.number;
  }
}



