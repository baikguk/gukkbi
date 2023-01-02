public class Ex09 {
  // (부모타입의 참조변수는 자식객체의 주소를 할당받을 수 있음)
  public static void main(String[] args){

    // class = type = 권한

    Professor prof1 = new Professor("이순신", "p_202201");
    System.out.println("교수이름 : " + prof1.name + ", 교수번호 : " + prof1.profNumber);
    System.out.println(prof1.name);
    System.out.println(prof1.profNumber);
    prof1.go();
    System.out.println("---------------------------");

    // 참조변수가 할당받는 객체의 주소지에 접근했을 때,
    // 참조변수의 type(클래스) 에서 작성한 멤버들이 다 있어야 함
    // 똑같이 있거나 더 많은 경우는 괜찮으나
    // 없거나 모자르면 오류가 발생함
    Person p1 = prof1;

    // 멤버 변수의 경우
    // 부모(Person) 타입의 참조변수 p1 은 자식객체의 주소를 할당 받았으나
    // Person 클래스에서 작성한 멤버변수나 멤버메소드만 사용할 수 있음
    System.out.println(p1.name);
//     System.out.println(p1.profNumber);


    //  자식 타입의 참조변수는 부모객체의 주소를 할당받을 수 없음
    //  자식 타입의 참조변수가 부모객체의 주소를 할당받는 것 처럼 보이는 경우
    //  class = type = 권한  :  부모권한 < 자식권한
    Person p2 = new Professor("글로벌", "p_202202");

    // 참조형 변수의 형변환(casting) - 상속관계에서만 성립됨
    // 권한이 적은 쪽에서 많은 쪽으로 주소를 할당할 때는 명시적 형변환을 해야 함
    //      부모             자식
    //  자식 타입의 참조변수가 부모객체의 주소를 할당받는 것 처럼 보이는 경우
    //  실제로 p2 에는 부모(Person)객체의 주소가 할당된 것이 아니고
    //                 자식(Professor)객체의 주소가 할당되어 있음
    Professor prof2 = (Professor)p2;

    // 권한이 많은 쪽에서 적은 쪽으로 주소를 할당할 때는 명시적 형변환 생략 가능함
    //      자식             부모
    p2 = prof2;


    // 부모타입의 참조변수가 실제로 부모객체의 주소를 할당받은 경우
    Person p3 = new Person("부모님");



    // 아래의 경우, 문법적 오류가 없어서 compile 오류는 발생하지 않으나
    // 이후에 이 code 를 실행하면 실행시에 오류가 발생할 수 있음
    //                                       ㄴ Runtime error
    // Professor 타입의 참조변수 prof3 는 Professor 클래스에서 작성된
    // 멤버들이 있는 주소만 할당받을 수 있는데, p3 가 저장하고 있는 주소는
    // Professor 객체의 주소가 아니라, Person 객체의 주소이므로
    // Runtime Error 가 발생함
    // Professor prof3 = (Professor)p3;



    // p3 가 저장하고 있는 객체의 주소가
    // Professor 객체의 주소인지 Person 객체의 주소인지
    // 미리 확인하고 실행하면 오류를 방지할 수 있음
    // 이 때 사용하는 연산자가 instanceof 연산자임

    // 참조변수 instanceof 클래스이름
    //  ㄴ 참조변수가 클래스(이름)의 객체의 주소를 할당받았는지 확인해 줌

    System.out.println("p3 instanceof Person       : " + (p3 instanceof Person));
    System.out.println("p3 instanceof Professor    : " + (p3 instanceof Professor));
    System.out.println("prof1 instanceof Professor : " + (prof1 instanceof Professor));

    if(p3 instanceof Professor) {
      System.out.println("p3 는 Professor 객체의 주소를 할당 받았음");
      Professor prof3 = (Professor) p3;
    }else{
      System.out.println("p3 는 Professor 객체의 주소를 할당 받지 않았음");
    }

    // 멤버 메소드의 경우
    // 자식타입의 참조변수로 go()를 호출하든지
    System.out.println("-- prof1.go() --");
    prof1.go();
    // 부모타입의 참조변수로 go()를 호출하든지
    // 자식클래스에서 overriding 한 내용이 실행됨
    System.out.println("-- p1.go() --");
    p1.go();

    Student std1 = new Student("글로벌", "s_20220001");
    System.out.println("학생이름 : " + std1.name + ", 학생번호 : " + std1.stdNumber);

  }
}

class Person{
  String name;
  Person(String name){
    this.name = name;
  }
  public void go(){
    System.out.println("사람이 앞으로 달립니다");
  }
}
// Annotation 으로 overriding 이 잘 되었는지 확인하기
class Professor extends Person{
  String profNumber;

  // new Professor("이순신", "p_202201");

  Professor(String name, String profNumber){
    super(name);
    this.profNumber = profNumber;
  }
  @Override
  public void go(){
    System.out.println("교수님이 앞으로 달립니다");
  }
}
class Student extends Person{
  String stdNumber;

  // new Student("글로벌", "s_20220001")

  Student(String name, String stdNumber){
    super(name);
    this.stdNumber = stdNumber;
  }
  @Override
  public void go(){
    System.out.println("학생이 앞으로 달립니다");
  }
}







