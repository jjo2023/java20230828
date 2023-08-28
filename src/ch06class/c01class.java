package ch06class;

public class c01class {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        System.out.println("system.identityHashCode(o1) = " + System.identityHashCode(o1));

        System.out.println("o1 = " + o1.age);
        o1.age=30;

        System.out.println("o1 = " + o1.age);
        MyClass01 o2 = o1;

    }
}
class MyClass01{
    //instance fields
    //인스턴스가 가져야하는 속성들

    int age;

    String name;


    //instance method
    //인스턴스가 가져야 하는 기능들

}