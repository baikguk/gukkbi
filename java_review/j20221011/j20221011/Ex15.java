public class Ex15 {
  public static void main(String[] args){
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new Product();

    System.out.println("p1 의 제품번호는 " + p1.serialNo + " 입니다");
    System.out.println("p2 의 제품번호는 " + p1.serialNo + " 입니다");
    System.out.println("p3 의 제품번호는 " + p1.serialNo + " 입니다");
    System.out.println("생산된 제품 개수는 " + Product.count + " 개입니다");
  }
}

class Product{
  static int count = 0;
  int serialNo;

  // instance 초기화 블럭 : instance 가 생성될 때 동작함
  {
    ++count;
    serialNo = count;
  }
  // 기본 생성자
  public Product() { }

}
