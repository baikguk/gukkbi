public class Ex10 {
  public static void main(String[] args){
    Account acc = new Account();

    acc.openAccount(10000);
    acc.deposit(20000);
    acc.deposit(30000);
    acc.deposit(10000);
    acc.deposit(50000);
    acc.deposit(-50000);

    acc.withdraw(5000);
    acc.withdraw(35000);
    acc.withdraw(4000);
    acc.withdraw(2000);

    acc.deposit(50000);
    acc.withdraw(300000);

    // acc.balance = 500000;
    acc.withdraw(300000);

    // 멤버변수 balance 에 직접 접근해서
    // 잔액 확인하기 - private 이라서 직접 접근이 안 됨
    // System.out.println("현재 잔액 : " + acc.balance);

  }
}

class Account{
  private int balance;

  public void openAccount(int money){
    this.balance = money;
    System.out.println("현재 잔액은 " + getBalance() + "원입니다");
  }
  public void deposit(int money){
    if(money > 0){
      this.balance += money;
    }else{
      System.out.println("입금 금액을 잘 확인해 주세요");
    }
    System.out.println("현재 잔액은 " + getBalance() + "원입니다");
  }
  public void withdraw(int money){
    if(money <= this.balance){
      this.balance -= money;
    }else{
      System.out.println("잔액이 부족합니다");
    }
    System.out.println("현재 잔액은 " + getBalance() + "원입니다");
  }
  public int getBalance(){
    return this.balance;
  }
}



