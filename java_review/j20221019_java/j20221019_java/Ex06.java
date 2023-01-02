
public class Ex06 {
  public static void main(String[] args){

    // mutable type
    StringBuffer sb = new StringBuffer("01");
    System.out.println("sb  : " + sb);
    StringBuffer sb2 = sb.append(23);
    System.out.println("sb2 : " + sb2);
    System.out.println("sb  : " + sb);
    sb.append(45);
    System.out.println("sb  : " + sb);
    sb.append('6');
    System.out.println("sb  : " + sb);
    sb.append('7').append(8);
    System.out.println("sb  : " + sb);
    StringBuffer sb3 = sb.append(9.0);
    System.out.println("sb   : " + sb);
    System.out.println("sb2  : " + sb2);
    System.out.println("sb3  : " + sb3);
    System.out.println("------------------------");

    System.out.println("sb   : " + sb.deleteCharAt(10));
    System.out.println("sb   : " + sb.delete(3, 6));
    System.out.println("sb   : " + sb.insert(3, "java"));
    System.out.println("sb   : " + sb.replace(6, sb.length(),"END"));

    System.out.println("capacity : " + sb.capacity());
    System.out.println("length   : " + sb.length());


    StringBuffer sb4 = new StringBuffer();
    System.out.println("sb4 capacity : " + sb4.capacity());
    System.out.println("sb4 length   : " + sb4.length());
    sb4.append("java");
    System.out.println("sb4 capacity : " + sb4.capacity());
    System.out.println("sb4 length   : " + sb4.length());


    StringBuffer sb5 = new StringBuffer("java");
    sb5.append("java");
    System.out.println("sb5 capacity : " + sb5.capacity());
    System.out.println("sb5 length   : " + sb5.length());


  }
}
