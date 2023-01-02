
public class Ex02 {
	                       // parameter
	public static void main(String[] args) {
		
		// print 메소드
		// 1) print()
		//      argument 부분에 넣은 문자열을 출력함
		//      자동 줄바꿈을 지원하지 않음
		//      \n : 줄바꿈 문자 (개행문자)
		
		
		                // argument
		System.out.print("hello\n");
		System.out.print(" Java !!!");
		
		
		// 2) println()
		//      argument 부분에 넣은 문자열을 출력함
		//      자동 줄바꿈을 지원함
		//      \n : 줄바꿈 문자 (개행문자)
		System.out.println("\nHello");
		System.out.println("Java");
		
		
		// 3) printf()
		//        첫 번째 argument 로 넣은 문자열을 출력함
		//        format specifier 를 사용함
		//        서식문자, 양식문자, 변환문자, 형식지정자 
		//          
		//        %d - decimal : 10진수(정수)
		//        %f - float(ing) point : 실수 - 소숫점이 있는 숫자
		//        %s - String  :  문자열
		//        %c - char    :  문자 (하나)
		
		System.out.printf("%s : %d 점\n", "국어", 98);
		System.out.printf("%s : %d 점\n", "수학", 90);
		
		System.out.printf("%s : %5d 점\n", "국어", 98);
		System.out.printf("%s : %5d 점\n", "수학", 90);
		
		System.out.printf("%s : %-5d 점\n", "국어", 98);
		System.out.printf("%s : %-5d 점\n", "수학", 90);
		
		
		
	}

}
