public class Ex08_1 {
  public static void main(String[] args){
    Buyer2 b = new Buyer2();

    // Tv, Computer, Computer, Audio, Tv, Tv, Audio

    displayBalance(b);

    b.buy(new Tv2());
    displayBalance(b);
    b.buy(new Computer2());
    displayBalance(b);
    b.buy(new Computer2());
    displayBalance(b);
    b.buy(new Audio2());
    displayBalance(b);
    b.buy(new Tv2());
    displayBalance(b);
    b.buy(new Tv2());
    displayBalance(b);
    b.buy(new Audio2());
    displayBalance(b);
    System.out.println("================================");
    b.summary();

  }
  public static void displayBalance(Buyer2 b){
    System.out.println("현재 남은 돈은 " + b.money + "원입니다");
    System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다");
    System.out.println("-----------------------------");
  }
}
class Product2{
  int price;
  int bonusPoint;
  Product2(int price){
    this.price = price;
    this.bonusPoint = (int)(this.price / 10.0);
  }
}
class Tv2 extends Product2{
  Tv2(){     super(100);   }
  public String toString(){ return "Tv"; }
}
class Computer2 extends Product2{
  Computer2(){
    super(200);
  }
  public String toString(){
    return "Computer";
  }
}
class Audio2 extends Product2{
  Audio2(){ super(50); }
  @Override
  public String toString(){return "Audio";}
}
class Buyer2{
  int money = 1000;
  int bonusPoint = 0;

  Product2[] products = new Product2[10];
  int idx = 0;

  void buy(Product2 p){
    if(this.money < p.price){
      System.out.println("잔액이 부족해서 물건을 살 수 없습니다");
      return;
    }
    this.money -= p.price;
    this.bonusPoint += p.bonusPoint;

    products[this.idx++] = p;

    System.out.println(p + " (을)를 구입했습니다");
  }

  // 구입한 물건들의 정보를 간략하게 출력해 주는 메소드
  void summary(){
    // 구입한 물건 가격의 합계
    int sum = 0;
    // 구입한 물건 목록
    String productsList = "";

    // 구입한 물건들의 총가격과 목록 작성하기
    for(int i = 0; i < products.length; i++){
      if(this.products[i] == null){
        break;
      }
      // 물건 가격 누적 덧셈하기
      sum += this.products[i].price;
      // 구입한 물건을 목록에 추가함
      // (i == this.idx-1)
      //  ㄴ 구입한 물건 중 맨 마지막 물건이라면
      productsList += (i == this.idx-1) ? products[i] :  products[i] + ", ";
    }
    System.out.println("총구매액 : " + sum + "만원입니다");
    System.out.println("구입한 물건은 " + productsList + " 입니다");

  } // summary

}







