public class Ex18 {
  public static void main(String[] args){
    /*

    비교연산자 = 관계연산자 : 조건식

       어떤 문자가 숫자모양의 문자인지 알아보기
         ㄴ ASCII code 를 활용함
         '0' ~ '9' :  48 ~ 57

         char ch = ? : '0' <= ? and ? <= '9'
                        48 <= ? and ? <= 57


       어떤 문자가 대문자인지 알아보기
         ㄴ ASCII code 를 활용함
         'A' ~ 'Z' :  65 ~ 90

         'A' <= ? and ? <= 'Z'
         65 <= ? and ? <= 90

       어떤 문자가 소문자인지 알아보기
         ㄴ ASCII code 를 활용함
         'a' ~ 'z' :  97 ~ 122

          'a' <= ? and ? <= 'z'
           97 <= ? and ? <= 122

    */

    char ch = '5';
    if ('0' <= ch && ch <= '9'){
      System.out.printf("ch(%c) 는 숫자입니다%n", ch);
    }
    ch = 'T';
    if ('A' <= ch && ch <= 'Z'){
      System.out.printf("ch(%c) 는 대문자입니다%n", ch);
    }
    ch = 'k';
    if ('a' <= ch && ch <= 'z'){
      System.out.printf("ch(%c) 는 소문자입니다%n", ch);
    }

    // 영문자 : ('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z')

    ch = 'p';
    if  ('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z'){
      System.out.printf("ch(%c) 는 영문자입니다%n", ch);
    }
  }
}
