
public class Ex02 {
	
	public static void main(String[] args) {
		
		// 기본형 자료형의 형변환 (type casting)
		// boolean type 을 제외한 7 개 type 들은 
		// 서로 형변환이 가능함
		
		// byte - short - int : 서로 크기만 고려하면 됨
		// char <-> byte - short - int : 크기와 범위를 고려해야 함
		
		// char -> int 의 경우를 제외하고 모두 명시적 형변환을 해야 함
		char ch1 = 'A';
		
		int i1;
		
		i1 = (int)ch1;
		i1 = ch1;
		
		byte b1;
		b1 = (byte)ch1;
		
		short s1;
		s1 = (short)ch1;
		
		ch1 = (char)b1;
		
		ch1 = (char)s1;
		
		ch1 = (char)i1;
		
		float f1 = 1.7F;
		System.out.println("f1 :" + f1);
		
		// 실수(float) 공간에 있는 data 를 
		// 정수 (int) 공간으로 할당
		
		i1 = (int)f1;
		System.out.println("i1 :" + i1);
		System.out.println("f1 :" + f1);
		
		System.out.println("i1 -> f1");
		f1 = i1;		
		System.out.println("f1 :" + f1);
		
		
		char ch2 = 'A';
		System.out.println("ch2 :" + ch2);
		
		int i2 = ch2;
		System.out.println("i2 :" + i2);
		
		ch2 = (char)i2;
		System.out.println("ch2 = (char)i2");
		System.out.println("ch2 :" + ch2);
		
	}

}





