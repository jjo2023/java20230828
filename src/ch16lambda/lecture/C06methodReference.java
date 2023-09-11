package ch16lambda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> C06methodReference.somemethod(a);

        //메소드참조(method reference)
        MyInterface06 o2 = C06methodReference::somemethod;
    }

    public static void somemethod(int x){

    }
}
interface MyInterface06{
    void method(int a);
}
