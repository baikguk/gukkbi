public class Ex04 {
  public static void main(String[] args){
    SubClass sbc = new SubClass();
    sbc.inter01Method();
    sbc.inter02Method();
    sbc.inter03Method();

    Inter01 i1 = new SubClass();
    Inter02 i2 = new SubClass();
    Inter03 i3 = new SubClass();

    /*
      해당 interface 에서 작성한
      메소드만 호출할 수 있음
    */

    i1.inter01Method();
    // i1.inter02Method();
    // i1.inter03Method();

    // i2.inter01Method();
    i2.inter02Method();
    // i2.inter03Method();

    // i3.inter01Method();
    // i3.inter02Method();
    i3.inter03Method();


  }
}
interface Inter01 {
  public abstract void inter01Method();
}interface Inter02 {
  public abstract void inter02Method();
}interface Inter03 {
  public abstract void inter03Method();
}
interface InterSub extends Inter01, Inter02, Inter03{ }
class SubClass implements InterSub{
  @Override
  public void inter01Method(){
    System.out.println("inter01Method() Overriding from Inter01 !!!");
  }  @Override
  public void inter02Method(){
    System.out.println("inter02Method() Overriding from Inter02 !!!");
  }  @Override
  public void inter03Method(){
    System.out.println("inter03Method() Overriding from Inter03 !!!");
  }
}






