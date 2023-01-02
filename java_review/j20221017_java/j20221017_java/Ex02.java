public class Ex02 {
  public static void main(String[] args){
    Fighter1 f1 = new Fighter1();

    if(f1 instanceof Unit){
      System.out.println("f 는 Unity 클래스의 자손입니다");
    }
    if(f1 instanceof Fightable){
      System.out.println("f 는 Fightable 인터페이스의 자손입니다");
    }
    if(f1 instanceof Movable){
      System.out.println("f 는 Movable 인터페이스의 자손입니다");
    }
    if(f1 instanceof Attackable){
      System.out.println("f 는 Attackable 인터페이스의 자손입니다");
    }
    if(f1 instanceof Object){
      System.out.println("f 는 Object 인터페이스의 자손입니다");
    }




  }
}
