import sun.security.jca.GetInstance;

public class Ex9_2 {
  public static void main(String[] args){
    G g = new G();
    g.methodG();
  }
}
class G{
  void methodG(){
    I2 i = InstanceManager.getInstance();
    i.methodI();
    System.out.println("실제로 전달된 객체 : " + i);
  }
}
class InstanceManager{
  public static I2 getInstance(){
    return new H();
  }
}
interface I2{
  void methodI();
}
class H implements I2{
  @Override
  public void methodI(){
    System.out.println("methodI() in H");
  }
  @Override
  public String toString(){
    return "class H";
  }
}
class M implements I2{
  @Override
  public void methodI(){
    System.out.println("methodI() in M");
  }
  @Override
  public String toString(){
    return "class M";
  }
}





