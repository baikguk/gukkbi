public class Ex03 {
  public static void main(String[] args){
    Parseable x = new XMLParser();
    Parseable h = new HTMLParser();

    // System.out.println(ParseManager.getParser("XMLParser"));
    // System.out.println(ParseManager.getParser("HTMLParser"));

    // XMLParser 객체를 return 받음
    Parseable parser1 = ParseManager.getParser("XMLParser");
    // HTMLParser 객체를 return 받음
    Parseable parser2 = ParseManager.getParser("HTMLParser");

    // interface type 타입으로 interface 에서 정의된
    // 추상 메소드를 호출하면
    // interface 를 상속받은 클래스에서
    // overriding 한 메소드가 실행됨
    parser1.parse("doc.xml");
    parser2.parse("doc.html");

  }
}
interface Parseable{
  public abstract void parse(String fileName);
}
class XMLParser implements Parseable{
  @Override
  public void parse(String fileName){
    System.out.println(fileName + "- XML parsing completed.");
  }
  @Override
  public String toString() {
    return "XMLParser 객체";
  }
}
class HTMLParser implements Parseable{
  @Override
  public void parse(String fileName){
    System.out.println(fileName + "- HTML parsing completed.");
  }
  @Override
  public String toString() {
    return "HTMLParser 객체";
  }
}
class ParseManager{
  // 메소드의 return type 을 조상 type 으로 하면
  // 메소드 하나를 호출해서 여러 자식 객체를 return 받을 수 있음
  public static Parseable getParser(String parser){
    if(parser.equals("XMLParser")) {
      XMLParser xmlParser = new XMLParser();
      return xmlParser;
    }else{
      HTMLParser htmlParser = new HTMLParser();
      return htmlParser;
    }
  }
}








