package ch16lambda.lecture;

public class C07methodReference {
    public static void main(String[] args) {
        MyInterface07 o1 = (x,y)->MyClass07.othermethod(x,y);
        MyInterface07 o2 = MyClass07::othermethod;
    }

}
class MyClass07{
    static void othermethod(int x, int y){

    }
}
interface MyInterface07{
    void method(int x, int y);
}
