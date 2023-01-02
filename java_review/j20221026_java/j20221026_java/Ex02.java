import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex02 {
  public static void main(String[] args){

    if(args.length != 1){
      System.out.println("String[] args 로 data 를 하나 전달해 주세요");
      System.out.println("프로그램을 종료합니다");
      System.exit(0);
    }

    Properties prop = new Properties();

    System.out.println("args[0] : " + args[0]);
    String inputFileName = args[0];

    try {
      prop.load(new FileInputStream(args[0]));
    } catch (IOException e) {
      System.out.println("지정된 파일을 찾을 수 없습니다");
      System.out.println(0);
    }

    String name   = prop.getProperty("name");
    String[] data = prop.getProperty("data").split(",");

    int max = 0, min = 0, sum = 0;

    for(int i = 0; i < data.length; i++){
      int number = Integer.parseInt(data[i]);
      if( i == 0 ){
        max = min = number;
      }
      if(max < number){
        max = number;
      }else if(min > number){
        min = number;
      }
      sum += number;
    }

    double average = (double)sum / data.length;

    System.out.println("이름 : " + name);
    System.out.println("최댓값 : " + max);
    System.out.println("최솟값 : " + min);
    System.out.println("합계 : " + sum);
    System.out.println("평균 : " + average);


  }
}
