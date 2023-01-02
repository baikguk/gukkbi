public class Ex08 {
  public static void main(String[] args){
    char[] ch = {'j', 'a', 'v', 'a'};
    System.out.println(ch);
    System.out.println("ch : " + ch);

    String str1 = new String(ch);
    System.out.println("str1 : " + str1);

    char[] ch2 = str1.toCharArray();
    System.out.println(str1.toCharArray());

    System.out.println("aa".compareTo("aa"));
    System.out.println("bb".compareTo("aa"));
    System.out.println("aa".compareTo("bb"));
    System.out.println("aa".compareTo("cc"));

    System.out.println("aab".compareTo("aac"));

    String str2 = "JavaProgram";
    System.out.println(str2.startsWith("Java"));
    System.out.println(str2.endsWith("Program"));

    String fileName = "2020_report.hwp";
    // 2020 년 문서인지 확인하기
    System.out.println(fileName.startsWith("2020"));
    // 아래한글 파일인지 확인하기
    System.out.println(fileName.endsWith("hwp"));

    // trim() 메소드 : 문자열 양쪽 공백을 없애줌
    String name1 = " global ";
    System.out.println(name1);
    System.out.println(name1.trim());

  }
}

