import java.io.*;
import java.util.ArrayList;
import java.util.Random;

class Point implements Serializable {
  private int x;
  private int y;
  public Point(int x, int y){
    this.x=x; this.y=y;
  }
  public String toString(){
    return String.format("Point X : %d, Point Y : %d%n", this.x, this.y);
  }
  // x, y 의 getter, setter
  public int getX(){ return this.x; }
  public void setX(int x) { this.x = x; }
  public int getY() { return this.y; }
  public void setY(int y) { this.y = y; }
}
public class Ex03 {
  public static void main(String[] args) throws Exception {
    ArrayList<Point> list = new ArrayList<>();

    Random r = new Random();

    for(int i = 500; i < 10000; i++){
      list.add(new Point(r.nextInt(i), r.nextInt(i)));
    }

    for(int i = 0; i < list.size(); i++){
      System.out.print(list.get(i) + " ");
    }
    System.out.println("\n---------------------------------------");

    System.out.println("list.size() : " + list.size());

    System.out.println("---------------------------------------");

    String folderName = "C:/test";
    String fileName   = "ObjectPoint.dat";
    File folder = new File(folderName);
    File file   = new File(folder, fileName);

    ObjectOutputStream oos =
      new ObjectOutputStream(
        new BufferedOutputStream(new FileOutputStream(file)));

    // 직렬화를 구현한(Serializable 인터페이스를 구현한)
    // Point 클래스를 저장하는 컬렉션 객체(ArrayList) 를 ObjectPoint.dat 에 저장함
    //   ㄴ ObjectOutputStream 에 write(writeObject(list) 함
    oos.writeObject(list);
    oos.close();

    System.out.println("---------------------------------------");

    ObjectInputStream ois =
      new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

    ArrayList<Point> list2 = (ArrayList<Point>)ois.readObject();
    ois.close();

    for(int i = 0; i < list2.size(); i++){
      System.out.print(list2.get(i) + " ");
    }
    System.out.println("\n---------------------------------------");

    System.out.println("프로그램 종료");
  }
}
