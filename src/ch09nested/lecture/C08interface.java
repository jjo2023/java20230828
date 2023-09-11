package ch09nested.lecture;

public class C08interface {

    public static void main(String[] args) {
        class ConcreteClass implements MyClass08.NestedInterface{
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }
        ConcreteClass c = new ConcreteClass();
        c.method2();
    }
}

class MyClass081 implements MyClass08.NestedInterface{
    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}
class MyClass08{
    interface NestedInterface{
        //public fical static field
        //public abstract instance method(**********중요!)

        void method2();
        //private instance method
        //default instance method
        //public static method
        //private static method
    }

    void method1(){
        class ConcreteClass implements NestedInterface{
            public void method2(){
                System.out.println("ConcreteClass.method2");
            }
        }
        ConcreteClass c = new ConcreteClass();
        c.method2();
    }
}

