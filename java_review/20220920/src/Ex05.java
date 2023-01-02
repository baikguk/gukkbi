
public class Ex05 {
    public static void main(String[] args) {
    	// 변수 선언과 초기화 방법
    	
    	// 1) 선언과 초기화를 나누어서 하는 방법
    	int score;
    	score = 100;
    	
    	// 2) 선언과 초기화를 같이 하는 방법
    	int number = 200;
    	
    	// 3) type  이 같은 경우에는
    	//    한 줄에 변수 여러 개를 선언하거나 초기화할 수 있음
    	int num1, num2, num3;
    	
    	int num4 = 40, num5 = 50, num6 = 60;
    	
    	int num7, num8 = 80, num9;
    	
    	
    	// 변수(이름)이 중복되어서 오류가 발생하는 경우
    	int number2;
    	number2 = 22;
    	
    	// Duplicate local variable number2
    	number2 = 34;
    	int number3 = 56;
    	
    	
    	// 3 개의 변수를 같은 값으로 동시에 초기화하는 방법
      // 값이 할당될 때는 복사가 일어남
    	int num11, num12, num13;    	
    	num11 = num12 = num13 = 50;
    	
    	System.out.println("num11 : " + num11);
    	System.out.println("num12 : " + num12);
    	System.out.println("num13 : " + num13);
    	
    	
    	
    	
    	
    	
    	
    	
    }
}




