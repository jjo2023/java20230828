package ch09nested.lecture;

public class C04access {
    //static member는 instance member에 접근할 수 없다.
    int instanceField;
    static int staticField;
    static class StaticNestedClass{
        void method1(){
            //System.out.println(instanseField); //x
            System.out.println(staticField);
        }
    }
    class InnnerClass{
        void method1(){
            System.out.println(instanceField);
            System.out.println(staticField);
        }

    }
}
