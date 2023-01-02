
/*
  이름(변수, 메소드, 클래스) <- 식별자
  name                          identifier(ID)
  
  명명 규칙 - rule
  
  1) 대소문자를 구별함, 길이 제한이 없음
  2) Reserved Word (예약어(키워드)) 를 사용할 수 없음
      ㄴ true, false <- 사용할 수 없음
      ㄴ True, False <- 사용할 수 있음
  3) 숫자로 시작할 수 없음
      ㄴ 3number (X)
  4) 특수문자는 '_' 과 '$' 만 사용할 수 있음
    
    
  Naming convention
  
  1)  변수와 메소드는 모두 소문자로 하고
      클래스는 첫 글자를 대문자로 시작함
      
  2) 여러 단어가 연결된 경우 
     두 번째 단부터 첫글자만 대문자로 함
  
     StringBuffer, lastIndexOf()   
                 
  3) 상수는 모든 글자를 대문자로 함
  
     PI, MIN_NUMBER
  
  
  변수(variable, name) 공간 : 하나의 값을 저장하기 위한 공간
  상수(constant) 공간 : 하나의 값을 한 번만 저장할 수 있는 공간
  리터럴(literal/literal data) : 값 자체를 의미함
  
  
  
*/
public class Ex06 {
	
	  // class scope	
	  // 멤버변수
    // member variable :  
	  // 상수로 지정할 때 선언과 초기화를 
  	// 동시에 하지 않으면 오류가 발생함
	
	  final int NUM = 1234;
	
    public static void main(String[] args) {
    	
    	// local scope
    	
    	boolean power = true;
    	char ch = 'A';
    	char tab = '\t';
    	byte b = 127;
    	short s = 32767;
    	int i = 100;
    	int octal = 0100;
    	int hexadecimal = 0x100;
    	
    	long longNumber = 10000000000L;
    	// Type mismatch: cannot convert from double to float
    	float fNumber1 = (float)3.14;
    	float fNumber2 = 3.14F;
    	double dNumber1 = 3.14D;
    	double dNumber2 = 3.14;
    	
    	// local variable (지역변수) :  
    	// 상수로 지정할 때 선언과 초기화를 동시에 하지 않아도 오류가 발생하지 않음
    	
    	final int NUMBER = 111;    	
    	// The local variable NUMBER may not have been initialized
    	System.out.println("NUMBER : " + NUMBER);
    	
    	// The final local variable NUMBER cannot be assigned. 
    	// NUMBER = 200;
    	
    	
    		
    	System.out.println("power : " + power);
    	System.out.println("ch : " + ch);
    	System.out.println("tab : " + tab);
    	System.out.println("b : " + b);
    	System.out.println("s : " + s);
    	System.out.println("i : " + i);
    	System.out.println("octal : " + octal);
    	System.out.println("hexadecimal : " + hexadecimal);
    	System.out.println("longNumber : " + longNumber);
    	System.out.println("fNumber1 : " + fNumber1);
    	System.out.println("dNumber1 : " + dNumber1);
    	
    } // main method
    
    
} // class 






