package ch08interface.lecture;

public class C15exercise {
    MyInterface15 field;

    public static void main(String[] args) {
        C15exercise o1 = new C15exercise();
        //확인문제 3 - 보기 1
        o1.field = new MyClass151();
        o1.field = new Myclass152();

        //확인문제 3 -보기2
        method(new Myclass152());
        method(new MyClass151());

        //확인문제 3 - 보기3
        MyInterface15[] arr = new MyInterface15[3];
        arr[0] = new MyClass151();
        arr[1] = new Myclass152();
    }
    public static void method(MyInterface15 param){

    }

}

interface MyInterface15{

}
class MyClass151 implements MyInterface15{

}
class Myclass152 implements MyInterface15{

}
