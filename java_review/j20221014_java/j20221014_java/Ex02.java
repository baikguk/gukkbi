public class Ex02 {
  public static void main(String[ ]args){
    Account1[] acc = new Account1[5];

    acc[0] = new Account1();
    acc[1] = new Account3();
    acc[2] = new Account1();
    acc[3] = new Account5();
    acc[4] = new Account1();

    for(int i = 0; i < acc.length; i++){
      acc[i].interestProc();
    }

  }
}
class Account1{
  public void interestProc(){
    System.out.println("1% 이자 지급");
  }
}
class Account3 extends Account1{
  @Override
  public void interestProc(){
    System.out.println("3% 이자 지급");
  }
}
class Account5 extends Account1{
  @Override
  public void interestProc(){
    System.out.println("5% 이자 지급");
  }
}