import java.util.Enumeration;
import java.util.Properties;

public class Ex01 {
  public static void main(String[] args){
    /*
      Properties - key 와 value 가 String 인 hashMap
    */
    Properties prop = new Properties();

    // key-value 를 저장할 때 setProperty() 메소드를 호출함
    prop.setProperty("timeout", "30");
    prop.setProperty("language", "kr");
    prop.setProperty("size", "10");
    prop.setProperty("capacity", "10");

    // Properties 에 저장된 요소들은 Enumeration 을 사용해서 출력함
    // Properties 의 propertyNames() 메소드 호출
    Enumeration enumer = prop.propertyNames();

    while(enumer.hasMoreElements()){
      // enumer.nextElement() : key 를 가져옴
      String element = (String)enumer.nextElement();
      // prop.getProperty(element) : value 를 가져옴
      System.out.println(element + " : " + prop.getProperty(element));
    }
    System.out.println();

    // Properties 의 setProperty() 메소드
    //  ㄴ 기존의 key 와 value 를 지정하면
    //     key 는 그대로 있고 value 만 갱신됨
    prop.setProperty("size", "20");
    System.out.println("size : " + prop.getProperty("size"));

    // getProperty(key) 를 호출하면
    // 지정한 key 에 해당하는 value 를 반환함
    // getProperty(key, value) 를 호출하면
    // 지정한 key 에 해당하는 value 를 반환함
    System.out.println("capacity : " + prop.getProperty("capacity", "20"));
    System.out.println("loadfactor : " + prop.getProperty("loadfactor", "0.89"));
    System.out.println("--------------------");


    enumer = prop.propertyNames();

    while(enumer.hasMoreElements()){
      // enumer.nextElement() : key 를 가져옴
      String element = (String)enumer.nextElement();
      // prop.getProperty(element) : value 를 가져옴
      System.out.println(element + " : " + prop.getProperty(element));
    }
    System.out.println();
    System.out.println("--------------------");

    System.out.println(prop);
    System.out.println("--------------------");

    prop.list(System.out);


  }
}
