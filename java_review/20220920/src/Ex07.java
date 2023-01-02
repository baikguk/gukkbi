
public class Ex07 {
	
	// class scope
	// 멤버변수
	final int number1;
	
	static float fNumber1;
	
	static boolean b1;
	
	static char ch;
	
	static String str1;
	
	public static void main(String[] args) {
		
		System.out.println("number1(멤버변수)  : " + number1);
		System.out.println("fNumber1(멤버변수) : " + fNumber1);
		System.out.println("b1(멤버변수) : " + b1);
		System.out.println("ch(멤버변수) : " + ch);
		System.out.println("str1(멤버변수) : " + str1);
		
		// main method scope - local scope
		
		/*
		  변수의 초기화 : 변수를 선언한 후 처음으로 값을 할당하는 것
		  
		  멤버변수는 사용하기 전에 초기화해도 되고 안 해도 됨
		                             ㄴ 자동으로 초기화가 지원됨 
		                             ㄴ 숫자형(byte, short, int, long, float, double)
		                             ㄴ  0(0.0) 으로 초기화됨   
		                             ㄴ 논리형(boolean type)
		                             ㄴ false 로 초기화됨
		                             ㄴ 문자형(char type) : null 문자로 초기화됨
		                             ㄴ 기본형(primitive type)들은 위의 초기값을 가지고 있음
		                             
		                             ㄴ 참조형(reference type)은 null 값으로 초기화가 됨 
		                             
		                             
      지역변수는 사용하기 전에 반드시 초기화해야 함
		                             ㄴ 자동으로 초기화가 지원되지 않음		                             
		*/
		
		int number2 = 222;
		// The local variable number2 may not have been initialized
		System.out.println("number2 : " + number2);
		
		
		int score = 0;
		float fNumber2 = 0.0F;
		
		// char type 은 주로 공백문자로 초기화함
		char ch2 = '\u0000';
		char ch3 = ' ';
		
		// char type 에 빈문자라는 것은 없음
		// char ch4 = '';
		
		// String type 은 주로 빈문자열로 초기화함
		// null 값을 할당한다는 것은
		// str2 에 연결된 값이 아무것도 없다는 의미
		String str2 = null;
		
		// 빈문자열을 할당한다는 것은
		// 빈문자열이라는 data 와 변수 str3가 연결된다는 의미
		String str3 = "";
		
		
		
	}
  
}




