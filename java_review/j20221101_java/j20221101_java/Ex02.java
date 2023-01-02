import java.io.*;

/*
  Externalizable 직렬화
  클래스를 직렬화할 수 있는 인터페이스로
  2 개의 추상 메소드를 가지고 있음

  void readExternal(ObjectInput in)
  The object implements the readExternal method to restore its contents by calling the methods of DataInput for primitive types and readObject for objects, strings and arrays.

  void writeExternal(ObjectOutput out)
	The object implements the writeExternal method to save its contents by calling the methods of DataOutput for its primitive values or calling the writeObject method of ObjectOutput for objects, strings, and arrays.

	선별된 필드(멤버변수)만을 직렬화할 수 있음

	<주의 사항>
	Externalizable 인터페이스를 구현하는 클래스는
	반드시 defaul constructor 를 작성해 놓아야 함

*/
class B implements Externalizable{
  public int n1, n2, n3;
  public B(){ }
  public B(int n1, int n2, int n3){
    this.n1=n1; this.n2=n2; this.n3=n3;
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    System.out.println("writeExternal() 호출");
    out.writeInt(n3 * 2);
    out.writeInt(n1 * 2);
    out.writeInt(n2 * 2);
  }
  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    System.out.println("readExternal() 호출");
    n3 = in.readInt() / 2;
    n1 = in.readInt() / 2;
    n2 = in.readInt() / 2;
  }
  public void display(){
    System.out.printf("%d, %d, %d%n", n1, n2, n3);
  }
}
public class Ex02 {
  public static void main(String[] args) throws Exception {
    String folderName = "C:/test";
    String fileName   = "ObjectB.dat";
    File folder = new File(folderName);
    File file   = new File(folder, fileName);

    ObjectOutputStream oos =
      new ObjectOutputStream(
        new BufferedOutputStream(new FileOutputStream(file)));

    B b = new B(11, 22, 33);

    oos.writeObject(b);
    b.display();

    oos.close();

    ObjectInputStream ois =
      new ObjectInputStream(
        new BufferedInputStream(new FileInputStream(file)));

    B b2 = (B)ois.readObject();
    b2.display();

    ois.close();
  }
}
