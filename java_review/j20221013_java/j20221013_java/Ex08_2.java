import java.util.ArrayList;

public class Ex08_2 {
  public static void main(String[] args){
    Buyer3 b = new Buyer3();

    // Tv, Computer, Computer, Audio, Tv, Tv, Audio

    Tv3 t = new Tv3();
    Computer3 c = new Computer3();
    Audio3 a = new Audio3();

    displayBalance(b);

    b.buy(t);
    displayBalance(b);
    b.buy(c);
    displayBalance(b);
    b.buy(c);
    displayBalance(b);
    b.buy(a);
    displayBalance(b);
    b.buy(t);
    displayBalance(b);
    b.buy(t);
    displayBalance(b);
    b.buy(a);
    displayBalance(b);

    System.out.println("================================");
    b.summary();

    System.out.println("================================");
    b.refund(t);
    b.summary();




  }
  public static void displayBalance(Buyer3 b){
    System.out.println("현재 남은 돈은 " + b.money + "원입니다");
    System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다");
    System.out.println("-----------------------------");
  }
}
class Product3{
  int price;
  int bonusPoint;
  Product3(int price){
    this.price = price;
    this.bonusPoint = (int)(this.price / 10.0);
  }
}
class Tv3 extends Product3{
  Tv3(){     super(100);   }
  public String toString(){ return "Tv"; }
}
class Computer3 extends Product3{
  Computer3(){
    super(200);
  }
  public String toString(){
    return "Computer";
  }
}
class Audio3 extends Product3{
  Audio3(){ super(50); }
  @Override
  public String toString(){return "Audio";}
}
class Buyer3{
  int money = 1000;
  int bonusPoint = 0;

  ArrayList<Product3> products = new ArrayList<Product3>();

  void buy(Product3 p){
    if(this.money < p.price){
      System.out.println("잔액이 부족해서 물건을 살 수 없습니다");
      return;
    }
    this.money -= p.price;
    this.bonusPoint += p.bonusPoint;

    products.add(p);
    System.out.println(p + " (을)를 구입했습니다");
  }

  // 환불하는 메소드
  void refund(Product3 p){
    if(products.remove(p)){
      this.money += p.price;
      this.bonusPoint -= p.bonusPoint;
      System.out.println(p + "(을)를 환불하셨습니다");
    }else{
      System.out.println("구입하신 물건 중에 해당 제품이 없습니다");
    }
  }

  void summary(){
    int sum = 0;
    String productsList = "";

    // 물건을 하나도 구입하지 않은 경우
    if(products.isEmpty()){
      System.out.println("구입하신 물건이 없습니다");
      return;
    }

    // 물건을 구입한 경우
    // 총구매가격과 구입목록 작성하기
    for(int i = 0; i < products.size(); i++){
      Product3 p = products.get(i);
      sum += p.price;
      productsList += (i == 0) ? "" + p : ", " + p;

    }

    System.out.println("총구매액 : " + sum + "만원입니다");
    System.out.println("구입한 물건은 " + productsList + " 입니다");

  } // summary

}







