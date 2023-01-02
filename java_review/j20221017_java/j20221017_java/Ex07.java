import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args){
    int result = 0;

    I[] i = new I[4];

    i[0] = new Addition();
    i[1] = new Subtraction();
    i[2] = new Multiplication();
    i[3] = new Division();

    for(int idx = 0; idx < i.length; idx++){
      result = i[idx].calculate(10, 8);
      System.out.println("result : " + result);
    }
    System.out.println("-----------------------------------");

    Calc c = new Calc();
    for(int idx = 0; idx < i.length; idx++){
      System.out.println("-- " + i[idx] + " 객체 --");
      result = c.compute(i[idx]);
      System.out.println("result : " + result);
    }


  }
}
class Calc{
  public int compute(I i){
    Scanner sc = new Scanner(System.in);
    System.out.print("첫 번째 숫자를 입력하세요 : ");
    int number1 = sc.nextInt();
    System.out.print("두 번째 숫자를 입력하세요 : ");
    int number2 = sc.nextInt();
    return i.calculate(number1, number2);
  }
}
interface I{
  int calculate(int num1, int num2);
}
class Addition implements I{
  @Override
  public int calculate(int n1, int n2){
    return n1 + n2;
  }
  @Override
  public String toString() {
    return "Addition";
  }
}
class Subtraction implements I{
  @Override
  public int calculate(int n1, int n2){
    return n1 - n2;
  }
  @Override
  public String toString() {
    return "Subtraction";
  }
}
class Multiplication implements I{
  @Override
  public int calculate(int n1, int n2){
    return n1 * n2;
  }
  @Override
  public String toString() {
    return "Multiplication";
  }
}
class Division implements I{
  @Override
  public int calculate(int n1, int n2){
    return n1 / n2;
  }
  @Override
  public String toString() {
    return "Division";
  }
}












