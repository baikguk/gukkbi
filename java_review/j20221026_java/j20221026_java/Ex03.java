import java.util.Properties;

public class Ex03 {
  public static void main(String[] args){
    Properties sysProper =  System.getProperties();
    System.out.println(sysProper.getProperty("java.version"));
    System.out.println(sysProper.getProperty("user.language"));

    sysProper.list(System.out);
  }
}
