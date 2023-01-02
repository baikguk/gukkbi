/*
  static member variable : 스태틱 변수, 클래스 변수, 공유 변수
    ㄴ 객체(Object / instance)마다 변하지 않는 값으로 사용함
    ㄴ 클래스에 하나만 생성되고
    ㄴ 해당 클래스의 모든 객체에서 값을 공유해서 사용함

  instance member variable :  인스턴스 변수
    ㄴ 객체(Object / instance)마다 변하는 값으로 사용함
    ㄴ 객체가 생성될 때마다 새롭게 초기화되고
    ㄴ 객체 별로 독립적으로 사용함
*/

class Card{
  static int width = 100;
  static int height = 250;

  String kind;
  int number;
}

public class Ex07 {
  public static void main(String[] args){

    System.out.println("Card.width  : " + Card.width);
    System.out.println("Card.height : " + Card.height);

    Card c1 = new Card();
    c1.kind = "Heart";
    c1.number = 7;

    Card c2 = new Card();
    c2.kind = "Spade";
    c2.number = 3;

    System.out.printf("c1 의 너비 : %d, c1의 높이 : %d, c1의 모양 : %s, c1 의 번호 : %d%n",
                       c1.width, c1.height, c1.kind, c1.number);
    System.out.printf("c2 의 너비 : %d, c2의 높이 : %d, c2의 모양 : %s, c2 의 번호 : %d%n",
                       c2.width, c2.height, c2.kind, c2.number);

    c1.width = 50;
    c1.height = 80;
    System.out.printf("c1 의 너비 : %d, c1의 높이 : %d, c1의 모양 : %s, c1 의 번호 : %d%n",
      c1.width, c1.height, c1.kind, c1.number);
    System.out.printf("c2 의 너비 : %d, c2의 높이 : %d, c2의 모양 : %s, c2 의 번호 : %d%n",
      c2.width, c2.height, c2.kind, c2.number);


  }
}
