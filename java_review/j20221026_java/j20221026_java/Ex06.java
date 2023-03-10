import java.util.ArrayList;

class Fruit3 {public String toString(){ return "Fruit"; } }
class Apple3 extends Fruit3 { public String toString(){ return "Apple"; } }
class Grape3 extends Fruit3 { public String toString(){ return "Grape"; } }
class Juice{
  String name;
  Juice(String name) { this.name = name + "Juice"; }
  public String toString() { return this.name; }
}
class Juicer{
  static Juice makeJuice(FruitBox3<? extends Fruit3> box){
    String tmp = "";

    for(Fruit3 fruit: box.getList()){
      tmp += fruit + " ";
    }
    return new Juice(tmp);
  }
}
public class Ex06 {
  public static void main(String[] args){
    FruitBox3<Fruit3> fruitBox = new FruitBox3<>();
    FruitBox3<Apple3> appleBox = new FruitBox3<>();
    FruitBox3<Grape3> grapeBox = new FruitBox3<>();

    fruitBox.add(new Fruit3());
    fruitBox.add(new Apple3());
    fruitBox.add(new Grape3());
    fruitBox.add(new Grape3());

    appleBox.add(new Apple3());
    appleBox.add(new Apple3());

    grapeBox.add(new Grape3());
    grapeBox.add(new Grape3());

    System.out.println(Juicer.makeJuice(fruitBox));
    System.out.println(Juicer.makeJuice(appleBox));
    System.out.println(Juicer.makeJuice(grapeBox));

  }
}
class FruitBox3<T extends Fruit3> extends Box3<T>{ }
class Box3<T>{
  ArrayList<T> list1 = new ArrayList<T>();
  void add(T item){ list1.add(item); }
  T get(int idx){ return list1.get(idx); }
  ArrayList<T> getList(){ return this.list1; }
  int size(){ return list1.size(); }
  public String toString(){ return list1.toString(); }
}