/*
  
  String type 은 주로 빈문자열로 초기화함
	null 값을 할당한다는 것은
	str2 에 연결된 값이 아무것도 없다는 의미
	str2 에 저장된 주소가 없다는 의미
	String str2 = null;
		
	빈문자열을 할당한다는 것은
	빈문자열이라는 data 와 변수 str3가 연결된다는 의미
  빈문자열이라는 data 의 주소를 str3 가 저장함	                                  
	String str3 = "";
	
*/

public class Ex08 {
	public static void main(String[] args) {
		
		// Reference Type
		// Reference variable 은 객체(data) 의 주소를 저장함
		String str1 = new String("hello");
		System.out.println("str1 :" + str1);
		
		int number  = 10;
		String str2 = "";
		
		
		Tv tv1 = new Tv();
		System.out.println("tv1 :" + tv1);
		
		
	}
}

class Tv{
	
}




