import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit4{
  String name;
  int weight;
  Fruit4(String name, int weight){
    this.name = name;
    this.weight = weight;
  }
  public String toString() { return this.name + " : " + this.weight; }
}
class Apple4 extends Fruit4{
  // There is no default constructor available in 'Fruit4'
  Apple4(String name, int weight){
    super(name, weight);
  }
}
class Grape4 extends Fruit4{
  // There is no default constructor available in 'Fruit4'
  Grape4(String name, int weight){
    super(name, weight);
  }
}
class AppleSort implements Comparator<Apple4> {
  @Override
  public int compare(Apple4 o1, Apple4 o2) {
    // 내림차순
    // return o2.weight - o1.weight;
    // 오름차순
    return o1.weight - o2.weight;
  }
}
class GrapeSort implements Comparator<Grape4> {
  @Override
  public int compare(Grape4 o1, Grape4 o2) {
    // 오름차순
    // return o1.weight - o2.weight;
    // 내림차순
    return o2.weight - o1.weight;
  }
}
class FruitSort implements Comparator<Fruit4> {
  @Override
  public int compare(Fruit4 o1, Fruit4 o2) {
    // 오름차순
    // return o1.weight - o2.weight;
    // 내림차순
    return o2.weight - o1.weight;
  }
}

public class Ex07 {
  public static void main(String[] args){
    FruitBox4<Apple4> appleBox = new FruitBox4<Apple4>();
    FruitBox4<Grape4> grapeBox = new FruitBox4<Grape4>();

    appleBox.add(new Apple4("redApple", 300));
    appleBox.add(new Apple4("greenApple", 100));
    appleBox.add(new Apple4("greenApple", 200));

    grapeBox.add(new Grape4("greenGrape", 400));
    grapeBox.add(new Grape4("yellowGrape", 300));
    grapeBox.add(new Grape4("redGrape", 200));

    System.out.println("appleBox : \n" +  appleBox);
    System.out.println("grapeBox : \n" +  grapeBox);


    System.out.println("-------- 정 렬 후 (AppleSort[오름차순] / GrapeSort[내림차순]) ----------");
    Collections.sort(appleBox.getList(), new AppleSort());
    System.out.println("appleBox : \n" +  appleBox);

    Collections.sort(grapeBox.getList(), new GrapeSort());
    System.out.println("grapeBox : \n" +  grapeBox);

    System.out.println("-------- 정 렬 후 (FruitSort[내림차순]) ----------");
    Collections.sort(appleBox.getList(), new FruitSort());
    System.out.println("appleBox : \n" +  appleBox);

    Collections.sort(grapeBox.getList(), new FruitSort());
    System.out.println("grapeBox : \n" +  grapeBox);



  }
}
class FruitBox4<T extends Fruit4> extends Box4<T>{ }
class Box4<T>{
  ArrayList<T> list1 = new ArrayList<T>();
  void add(T item){ list1.add(item); }
  T get(int idx){ return list1.get(idx); }
  ArrayList<T> getList(){ return this.list1; }
  int size(){ return list1.size(); }
  public String toString(){ return list1.toString(); }
}