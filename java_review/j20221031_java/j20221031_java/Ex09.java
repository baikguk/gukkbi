import java.io.*;

public class Ex09 {
  public static void main(String[] args){
    String fileName = "log.txt";

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    File file = new File(fileName);

    // PrintWriter : 생성된 file 에 character 를 write 할 수 있음
    //              character 단위 출력 메소드인
    //              print, println, printf 들을 사용할 수 있음

    PrintWriter pw = null;

    try {
      if (!file.exists()) {
        file.createNewFile();
      }

      pw = new PrintWriter(
               new BufferedWriter(
                   new OutputStreamWriter(
                       new FileOutputStream(file, true))));

      char isCheckExit;
      String message;

      do{
        System.out.print("메세지를 입력하세요 : ");
        message = br.readLine();

        pw.printf("입력된 메세지는 %s 입니다", message);
        pw.println();
        pw.println(message);

        // flush() : buffer 를 비움
        pw.flush();
        System.out.print("프로그램을 종료하시겠습니까? (y/n) : ");

        isCheckExit = (char)br.read();
        // enter(/r/n) 를 구성하는 문자를 건너뜀
        br.skip(1);

      }while(isCheckExit == 'n' || isCheckExit == 'N');

    }catch(IOException e){
      e.printStackTrace();
    }

    System.out.println("프로그램 종료");

  }
}
