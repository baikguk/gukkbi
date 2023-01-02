abstract class MouseEvent{
  public abstract void lButtonClick();
  public abstract void rButtonClick();
  public abstract void cButtonClick();
  public abstract void buttonClick();
}
class MouseEventAdapter extends MouseEvent{
  public void lButtonClick(){}
  public void rButtonClick(){}
  public void cButtonClick(){}
  public void buttonClick(){}
}
class LButton extends MouseEventAdapter{
  @Override
  public void lButtonClick(){
    System.out.println("left button click !!!");
  }
  @Override
  public void buttonClick(){
    System.out.println("left button click !!!");
  }
}
class RButton extends MouseEventAdapter{
  @Override
  public void rButtonClick(){
    System.out.println("right button click !!!");
  }
  @Override
  public void buttonClick(){
    System.out.println("right button click !!!");
  }
}
class CButton extends MouseEventAdapter{
  @Override
  public void cButtonClick(){
    System.out.println("center button click !!!");
  }
  @Override
  public void buttonClick(){
    System.out.println("center button click !!!");
  }
}
public class Ex06 {
  public static void main(String[ ]args){
    LButton left   = new LButton();
    RButton right  = new RButton();
    CButton center = new CButton();

    left.lButtonClick();
    right.rButtonClick();
    center.cButtonClick();
    System.out.println("----------------------------");

    MouseEvent[] event = new MouseEvent[5];

    event[0] = new LButton();
    event[1] = new RButton();
    event[2] = new LButton();
    event[3] = new CButton();
    event[4] = new RButton();

    for(int i = 0; i < event.length; i++){
      event[i].buttonClick();
    }

  }
}
