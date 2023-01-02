
public class Ex05 {
	
	public static void main(String[] args) {
		
		float   f  = 9.12345678901234567890F;
		float   f2 = 1.2345678901234567890F;
		double  d  = 9.12345678901234567890D;
		
		System.out.printf("      123456789012345678901234%n");
		
		// %f : 기본적으로 소숫점 이하 6 자리까지 출력
		System.out.printf("f   : %f%n",f);
		
		// %24.20f% : 전체 출력 자릿수(24), 소숫점 이하 20자리까지
		System.out.printf("f   : %24.20f%n",f);
		System.out.printf("f2  : %24.20f%n",f2);
		System.out.printf("d   : %24.20f%n",d);
		
	}

}
