public class Ex05 {
  public static void main(String[ ]args){
    Child  chd = new Child();
    Inter04 i4 = new Child();
    Inter05 i5 = new Child();
    Inter06 i6 = new Child();
    Parent   p = new Child();

    chd.inter04Method();
    chd.inter05Method();
    chd.inter06Method();
    chd.parentMethod();

    i4.inter04Method();
    i5.inter05Method();
    i6.inter06Method();
    p.parentMethod();

  }
}
interface Inter04{ public abstract void inter04Method(); }
interface Inter05{ public abstract void inter05Method(); }
interface Inter06{ public abstract void inter06Method(); }

abstract class Parent {
  public abstract void parentMethod();
}

class Child extends Parent implements Inter04, Inter05, Inter06{
  @Override
  public void inter04Method(){ System.out.println("inter04Method() Overriding from Inter04"); }
  @Override
  public void inter05Method(){ System.out.println("inter05Method() Overriding from Inter05"); }
  @Override
  public void inter06Method(){ System.out.println("inter06Method() Overriding from Inter06"); }
  @Override
  public void parentMethod() { System.out.println("parentMethod() Overriding from Parent"); }
}











