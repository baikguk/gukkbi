public class Ex07 {
  public static void main(String[] args){
    // Card  한 벌 생성하기
    Deck d1 = new Deck();

    // Card 섞기 전에 제일 위에 있는 Card 한 장 뽑기
    Card card1 = d1.pick(0);
    System.out.println(card1);

    // Card 섞은 후에 제일 위에 있는 Card 한 장 뽑기
    d1.shuffle();
    card1 = d1.pick(0);
    System.out.println(card1);

  }
}
class Card{
  // 카드 무늬의 개수
  static final int KIND_MAX = 4;

  // 무늬별 카드 개수
  static final int NUM_MAX = 13;

  static final int SPADE   = 4;
  static final int DIAMOND = 3;
  static final int HEART   = 2;
  static final int CLOVER  = 1;

  public String toString2(){
    String[] kinds = {"","CLOVER", "HEART", "DIAMOND", "SPADE"};
    String numbers = "0123456789XJQK";
    return String.format("kind : %s, number : %c%n",
                         kinds[this.kind], numbers.charAt(this.number));
  }

  int kind;
  int number;

  Card(){
    this(SPADE, 1);
  }
  Card(int kind, int number){
    this.kind = kind;
    this.number = number;
  }
  public String toString(){
    String[] kinds = {"","CLOVER", "HEART", "DIAMOND", "SPADE"};
    String numbers = "0123456789XJQK";
    return String.format("kind : %s, number : %c%n",
                          kinds[this.kind], numbers.charAt(this.number));
  }
}

class Deck{
  // 카드 개수
  final int CARD_NUM = 52;
  Card[] arrCard = new Card[CARD_NUM];

  // 기본 생성자에서 arrCard 초기화하기
  Deck(){
    int i = 0;
    // for(int c = Card.KIND_MAX; c > 0 ; c--) {
    for(int c = 1; c <= Card.KIND_MAX ; c++) {
      for (int n = 0; n < Card.NUM_MAX; n++) {
        arrCard[i++] =  new Card(c, n+1);
      } // inner for
    } // outer for

  } // 기본 생성자

  // 지정한 위치(index)에 있는 카드 하나 꺼내기
  Card pick(int index){
    return arrCard[index];
  }

  // Deck 에서 임의의 Card 하나 선택하기
  Card pick(){
    int index = (int)(Math.random() * CARD_NUM);
    return pick(index);
  }

  // 카드의 순서 섞기
  void shuffle(){
    for(int i =0 ; i < arrCard.length; i++){
      int idx = (int)(Math.random() * CARD_NUM);
      // swapping
      Card card = arrCard[i];
      arrCard[i] = arrCard[idx];
      arrCard[idx] = card;
    }
  }




}
