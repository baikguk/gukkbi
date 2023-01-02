public class Ex08 {
  public static void main(String[] args){
    // 물건 구입하기
    Buyer b = new Buyer();

    Tv t = new Tv();
    Computer c = new Computer();

    displayBalance(b);

    // Tv 구입하기
    b.buy(t);
    displayBalance(b);

    // Computer 구입하기
    b.buy(c);
    displayBalance(b);

  }
  public static void displayBalance(Buyer b){
    System.out.println("현재 남은 돈은 " + b.money + "원입니다");
    System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다");
    System.out.println("-----------------------------");
  }
}
class Product{
  // 제품가격
  int price;
  // bonus 점수
  int bonusPoint;
  // 생성자
  Product(int price){
    this.price = price;
    // bonus : 제품 가격의 10%
    this.bonusPoint = (int)(this.price / 10.0);
  }
}
class Tv extends Product{
  // 생성자
  Tv(){
    // 오류를 수정하세요
    // 오류가 발생한 원인 ???
    // 자식클래스의 모든 생성자의 첫 째줄에는
    // 부모클래스의 기본생성자를 호출하는
    // code 가 생략되어 있음
    super(100);
  }
  public String toString(){ return "Tv"; }
}
class Computer extends Product{
  // 오류를 수정하세요
  // 오류가 발생한 원인 ???
  // 자식클래스의 모든 생성자의 첫 째줄에는
  // 부모클래스의 기본생성자를 호출하는
  // code 가 생략되어 있음
  Computer(){
    super(200);
  }
  public String toString(){
    return "Computer";
  }
}
// 구매자 클래스
class Buyer{
  // 가지고 있는 돈
  int money = 1000;
  // 현재 bonus 점수 (물건을 구매하지 않은 상태에서는 0)
  int bonusPoint = 0;

  // 물건을 구매하는 메소드
  // 매개변수로 전달받는 물건을 구입하게 됨
  // 매개변수 type 을 Product 로 지정하면
  // buy() 메소드에서 Tv 를 구입할 수도 있고
  // Computer 를 구입할 수도 있음
  // 매개변수 type 을 Tv 나 Computer 로 지정하면
  // Tv 나 Computer 중 하나만 구입할 수 있고
  // 둘 다 구입하려면 buy() 메소드를 물건별로 만들어야 함
  void buy(Product p){

    // 가지고 있는 돈보다 물건값이 비싸면 구입할 수 없음
    if(this.money < p.price){
      System.out.println("잔액이 부족해서 물건을 살 수 없습니다");
      // 물건을 구입하지 못하고 buy() 메소드를 종료함
      return;
    }
    System.out.println(p + " (을)를 구입했습니다");

    // 물건을 구입하는 경우
    // 가지고 있는 돈에서 물건값만큼 차감함
    this.money -= p.price;

    // 해당 물건의 bonusPoint 를 추가함
    this.bonusPoint += p.bonusPoint;



  }

}







