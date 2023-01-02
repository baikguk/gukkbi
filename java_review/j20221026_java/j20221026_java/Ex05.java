import java.util.ArrayList;

interface Eatable{ }
class Fruit2 implements Eatable {
  public String toString(){ return "Fruit"; }
}
class Apple2 extends Fruit2 {
  public String toString(){ return "Apple"; }
}
class Grape2 extends Fruit2 {
  public String toString(){ return "Grape"; }
}
class Car2 {
  public String toString(){ return "Car"; }
}

class FruitBox<T extends Fruit2 & Eatable> extends Box2<T> {

}
public class Ex05 {
  public static void main(String[] args){
    FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
    FruitBox<Apple2> appleBox = new FruitBox<Apple2>();
    FruitBox<Grape2> grapeBox = new FruitBox<Grape2>();
    Box2<Car2> carBox = new Box2<Car2>();

    // type parameter 에 자신 type 의 객체를 전달할 수도 있고
    // 자식 type 의 객체를 전달할 수도 있음
    fruitBox.add(new Fruit2());
    fruitBox.add(new Apple2());
    fruitBox.add(new Grape2());
    // fruitBox.add(new Car2());
    fruitBox.add(new Grape2());

    appleBox.add(new Apple2());
    appleBox.add(new Apple2());
    grapeBox.add(new Grape2());
    grapeBox.add(new Grape2());
    carBox.add(new Car2());
    carBox.add(new Car2());

    System.out.println(fruitBox);
    System.out.println(appleBox);
    System.out.println(grapeBox);
    System.out.println(carBox);


  }
}

class Box2<T>{
  ArrayList<T> list1 = new ArrayList<T>();
  void add(T item){
    list1.add(item);
  }
  T get(int idx){
    return list1.get(idx);
  }
  int size(){
    return list1.size();
  }
  @Override
  public String toString(){
    return list1.toString();
  }
}
