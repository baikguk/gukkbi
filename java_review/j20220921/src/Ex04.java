
public class Ex04 {
	public static void main(String[] args) {
		
		// 8 자리의 10진수
		int   i  = 91234567;
		
		// int -> float 형변환
		float f  = (float)i;
		
		// float -> int 형변환
		int   i2 = (int)f;
		
		System.out.printf("i  : %d%n", i);
		System.out.println("float type : 7자리까지 정밀도를 갖고 있음");
		System.out.printf("f  : %f%n", f);		
		System.out.printf("i2 : %d%n", i2);
		
		System.out.println("---------------------------");
		
		// int -> double
		double d = (double)i;
		int   i3 = (int)d;
		
		System.out.printf("d  : %f%n", d);		
		System.out.printf("i3 : %d%n", i3);
		
		System.out.println("---------------------------");
		
		float f2 = 1.666F;
		int   i4 = (int)f2;
		
		System.out.printf("f2 : %f%n", f2);		
		System.out.printf("i4 : %d%n", i4);
		
		
	}

}
