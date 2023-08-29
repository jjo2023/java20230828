package ch08extends.lecture;

public class C04etends {
    public static void main(String[] args) {
        MySubClass041 o1 = new MySubClass041();
        o1.method1();
        o1.method2();

        MySubClass042 o2 = new MySubClass042();
        o2.method1();
        o2.method3();
    }

}

class  Myclass04{
    void method1(){
        System.out.println("Myclass04.method1");
    }
}
class MySubClass041 extends Myclass04{
    private int age;
    void method2(){
        System.out.println("MySubClass041.method2");
    }
}
class MySubClass042 extends Myclass04{
    private String model;
    void method3(){
        System.out.println("MySubClass042.method3");
    }
}