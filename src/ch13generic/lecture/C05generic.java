package ch13generic.lecture;

import java.util.HashMap;

public class C05generic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        MyClass05<String,Integer> o1 = new MyClass05<>();
        MyClass05<Integer,String> o2 = new MyClass05<>();
    }
}
class MyClass05<T,U> {
    private T  field;
    private T field2;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public T getField2() {
        return field2;
    }

    public void setField2(T field2) {
        this.field2 = field2;
    }
}