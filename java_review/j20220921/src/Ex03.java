
public class Ex03 {
	public static void main(String[] args) {
		
		// 대문자 -> 소문자
		// int 이하의 type 으로 연산을 하면
		// 모두 int type 에서 연산이 됨
		
		char ch1 = 'G';
		System.out.printf("ch1 : %c%n", ch1);
		
		System.out.printf("ch1 : %c%n", ch1 + ('a' - 'A'));
		System.out.printf("ch1 : %d%n", ch1 + ('a' - 'A'));
		
		System.out.printf("ch1 : %c%n", ch1);
		System.out.println("======================");
		// 변수 공간에 할당되어 있는 값을 변경하려면
		// 할당연산을 해야 함
		
		ch1 = 'g';
		System.out.printf("ch1 : %c%n", ch1);
		
		// 소문자 -> 대문자
		System.out.printf("ch1 : %c%n", ch1 - ('a' - 'A'));
		System.out.printf("ch1 : %c%n", ch1 - 32);
		
		
		
	}

}
