import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args){
    Student3 s = new Student3("글로벌");
    s.printScores();
  }
}
class Student3{
  private String name;
  private String[] subjects;
  private int[] scores;
  private int total;
  private float average;

  // 생성자 : 이름을 할당하고 과목 배열을 생성 및 초기화함
  public Student3(String name){
    this.name = name;
    subjects = new String[]{"국어", "영어", "수학"};
    scores = new int[subjects.length];
    total = 0;
    average = 0F;
    // 생성자에서 compute() 메소드 호출하기
    compute();
  }
  // 총점과 평균을 계산하는 메소드
  public void compute(){
    Scanner sc = new Scanner(System.in);
    for(int i =0; i < scores.length; i++){
      System.out.printf("%s 과목의 성적을 입력하세요 : ",subjects[i]);
      scores[i] = sc.nextInt();
      total += scores[i];
    }
    average = (float)total / scores.length;
  }
  public void printScores(){
    System.out.println("==========================================");
    System.out.printf("%s 학생의 성적정보를 출력합니다%n", name);
    System.out.println("==========================================");

    for(int i = 0; i < scores.length; i++){
      System.out.printf("%-5s : %3d 점%n", subjects[i], scores[i]);
    }
    System.out.println("___________________________________________");
    System.out.printf("총점 : %d 점, 평균 : %.2f 점%n", total, average);
    System.out.println("===========================================");

  }



}
// 100