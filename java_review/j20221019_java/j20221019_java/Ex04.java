public class Ex04 {
  public static void main(String[] args){
    String fileName = "javaisthe.bestprogramminglanguage.java";

    // indexOf(왼쪽에서 첫 번째 문자) :
    // lastIndexOf(오른쪽에서 첫 번째 문자) :
    int index = fileName.lastIndexOf('.');
    System.out.println("index : " + index);

    // String 클래스의 substring() 메소드
    //                     ㄴ 지정한 index 에 해당하는 문자열을 추출함
    // 파일이름만 출력하세요
    String file = fileName.substring(0, index);
    System.out.println("파일이름 : " + file);

    // 확장자만 출력하세요
    String extension = fileName.substring(index+1);
    System.out.println("확장자 : " + extension);
    System.out.println("-------------");

    String str1 = "javaisthebestprogramminglanguage";

    String result1 = str1.substring(5);
    System.out.println("result1 : " + result1);

    String result2 = str1.substring(5, 15);
    System.out.println("result2 : " + result2);



  }
}
