import java.util.ArrayList;
import java.util.HashMap;

/*
  Generics : 객체를 생성할 때 해당 객체 내부에서 사용하는 객체를 지정함
*/

class Fruit {
  public String toString(){ return "Fruit"; }
}
class Apple extends Fruit {
  public String toString(){ return "Apple"; }
}
class Grape extends Fruit {
  public String toString(){ return "Grape"; }
}
class Car {
  public String toString(){ return "Car"; }
}
public class Ex04 {
  public static void main(String[] args){
    Box<Fruit> fruitBox = new Box<Fruit>();
    Box<Apple> appleBox = new Box<Apple>();
    Box<Grape> grapeBox = new Box<Grape>();
    Box<Car>     carBox = new Box<Car>();

    // type parameter 에 자신 type 의 객체를 전달할 수도 있고
    // 자식 type 의 객체를 전달할 수도 있음
    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());

    appleBox.add(new Apple());
    // appleBox.add(new Fruit());
    // appleBox.add(new Grape());

    grapeBox.add(new Grape());
    // grapeBox.add(new Fruit());
    // grapeBox.add(new Apple());

    carBox.add(new Car());
    // carBox.add(new Fruit());
    // carBox.add(new Apple());
    // carBox.add(new Grape());

    System.out.println(fruitBox.toString());
    System.out.println(appleBox);
    System.out.println(grapeBox);
    System.out.println(carBox);

  }
}

// <K, V> : type parameter
// <T> : type parameter
class Box<T>{
  // Box<K, V>
  // HashMap<K, V> map1 = new HashMap<K, V>();
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