public class Ex01 {
  public static void main(String[] args){

    Tv tv1 = new Tv();
    System.out.println("tv1.color :" + tv1.color);
    System.out.println("tv1.channel : " + tv1.channel);
    System.out.println("tv1.power : " + tv1.power);
    System.out.println("---------------------");

    tv1.color = "orange";
    tv1.channel = 20;
    tv1.power = false;
    System.out.println("tv1.color :" + tv1.color);
    System.out.println("tv1.channel : " + tv1.channel);
    System.out.println("tv1.power : " + tv1.power);
    System.out.println("---------------------");

    Tv tv2 = new Tv();
    System.out.println("tv2.color :" + tv2.color);
    System.out.println("tv2.channel : " + tv2.channel);
    System.out.println("tv2.power : " + tv2.power);
    System.out.println("---------------------");

    tv2.color = "green";
    tv2.channel = 2;
    tv2.power = false;
    System.out.println("tv2.color :" + tv2.color);
    System.out.println("tv2.channel : " + tv2.channel);
    System.out.println("tv2.power : " + tv2.power);
    System.out.println("========================");

    tv1 = tv2;
    System.out.println("tv1.color :" + tv1.color);
    System.out.println("tv1.channel : " + tv1.channel);
    System.out.println("tv1.power : " + tv1.power);
    System.out.println("---------------------");

    System.out.println("tv2.color :" + tv2.color);
    System.out.println("tv2.channel : " + tv2.channel);
    System.out.println("tv2.power : " + tv2.power);
    System.out.println("---------------------");


    tv1.channelUp();
    System.out.println("tv1.channel : " + tv1.channel);
    System.out.println("tv2.channel : " + tv2.channel);



  }
}

class Tv{

  String color;
  int channel;
  boolean power;

  // 주로 클래스의 멤버변수를 초기화하는 일을 함
  Tv(){
    this.color = "blue";
    this.channel = 5;
    this.power = true;
  }

  public void power(){
    this.power = !this.power;
  }
  public void channelUp(){
    channel++;
  }
  public void channelDown(){
    channel--;
  }
}