package ch09nested.book.sec02.exam02;

public class A {
    //인스턴스 멤버 클래스

    class B{
        //인스턴스 필드
        int field1 = 1;

        //정적 필드(자바17부터 허용)
        static int field2 =2;

        //생성자
        B(){
            System.out.println("B-생성자 실행");
        }
        //인스턴스 메소드
        void method1(){
            System.out.println("B-method1 실행");
        }

        //정적 메소드(자바17부터 허용)
        static void method2(){
            System.out.println("B-mothod2 실행");
        }
        //인스턴스 메소드
        void useB(){
            //B 객체 생성 및 인스턴스 필드 및 메소드 사용
            B b = new B();
            System.out.println(b.field1);
            b.method1();

            //B 클래스의 정적 필드및 메소드 사용
            System.out.println(b.field1);
            B.method2();
        }
    }
}
