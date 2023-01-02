
public class Ex01 {
	
	public static void main(String[] args) {
		
		// 정수의 overflow
		
		// byte type 의 최댓값은 127 인데 
		// 128을 할당하면 오류가 발생함
	  // byte b2 = 128;
		
		byte b1 = 127;
	  System.out.println("b1 : " + b1);
		
		b1 = (byte)(b1 + 1);
		System.out.println("b1 : " + b1);
		
		int number1 = 2147483647;
		System.out.println("number1 : " + number1);
		
		number1 = number1 + 1;		
		System.out.println("number1 : " + number1);
		
		
		// int type 의 최댓값 보다 큰 값을 할당해서 오류가 발생함
		// int number2 = 2147483648;
		
		
		int number3 = 1000000 * 1000000;
		System.out.println("number3 : " + number3);
		
		// overflow 를 고려한 code
		long number4 = 1000000 * 1000000L;
		System.out.println("number4 : " + number4);
		
		
		long number5 = 1000000 * 1000000 / 1000000; 
		System.out.println("number5 : " + number5);
		
		// overflow 를 고려한 code
		long number6 = 1000000 / 1000000 * 1000000; 
		System.out.println("number6 : " + number6);
		
		
		
	}

}
