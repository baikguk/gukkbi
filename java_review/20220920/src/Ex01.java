

// 주석(comment) 한 줄 주석은 double slash 로 표시함
//  ㄴ 프로그래머가 code 를 설명하기 위해서 memo하는 것

/*
여기는 
여러 줄 
주석
입니다
*/

/*

  class 클래스이름{
  
      클래스 내용 : 멤버변수 + 멤버메소드
      class scope
         
  }
  
*/

// 1) Ctrl + F11 (F11)
// 2) 왼쪽 위에 있는 초록색 화살표 아이콘 클릭
// 3) 소스에서 오른쪽 클릭 > Run As > Java Application

public class Ex01 { // 클래스 시작
	
	
	/*                    - java compiler : 사람이 작성한 source 를 byte code 로 변환함 -   
	   java program source > byte code > 실행 code (byte code -> binary code : machine language)
	           |                |            ㄴ JVM 이 실행함  (JIT compiler)
            확장자 jaa    확장자 class
	         
	        ┌ 운영체제 별로 있음                               
	       JDK(Java Development Kit) 설치할 때 JVM 이 설치됨 
	         (JVM)              
	        운영체제                               
          하드웨어	                                       
	                                       
	*/    
	
	
	// main 메소드 : java 프로그램은 main method 에서 시작함
	//        ㄴ JVM(Java Virtual Machine) 이 호출함
	                       //  ┌ parameter (파라미터) : 값을 전달 받는 부분
	public static void main(String[] args) { // main 메소드 시작 - 프로그램 시작
		 
		// . : access operator(접근 연산자), dot operator(점 연산자)
		System.out.println("Hello Java !!!");
		
	} // main 메소드 종료 - 프로그램 종료

} // 클래스 종료



