package ch07extends.book.sec06.package2;

import ch07extends.book.sec06.package1.A;

public class D extends A {
    //생성자 선언
    public D(){
        //A() 생성자 호출
        super();
    }

    //메소드 선언
    public void method(){
        //A필드값 변경
        this.field = "value";
        //A메소드 호출
        this.method();
    }

    //메소드 선언
//    public void method2(){
//        A a = new A();
//        a.field = "value";
//        a.method();
//    }
}
