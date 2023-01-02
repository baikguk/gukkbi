import java.io.*;

class A implements Serializable{
  // static final long serialVersionUID = 1L;

  public int number1;
  public int number2;

}

public class Ex11 {
  public static void main(String[] args){
    System.out.println("프로그램 시작");
    String folderName = "C:/test";
    String fileName = "Object01.dat";

    File folder = new File(folderName);
    File file   = new File(folder, fileName);

    /*
      클래스의 객체를 입출력하기
      ObjectInputStream / ObjectOutputStream 클래스를 사용함
      (객체의 입출력은 Serializable 인터페이스를 구현한
      클래스의 객체만 가능함)
    */
     ObjectOutputStream oos = null;

     if(!folder.exists()){
       folder.mkdirs();
     }
    try {
      oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
      A origin = new A();
      origin.number1 = 11;
      origin.number2 = 22;
      System.out.println("origin.number1 : "  + origin.number1);
      System.out.println("origin.number2 : "  + origin.number2);
      oos.writeObject(origin);


    }
    catch (IOException e) {

    } finally{
      try {
        if(oos != null) { oos.close(); }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    System.out.println("프로그램 종료");
  }
}
