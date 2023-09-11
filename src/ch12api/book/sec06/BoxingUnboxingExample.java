package ch12api.book.sec06;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        //Boxing
        Integer obj = 100;
        System.out.println("value = " + obj.intValue());

        //Unboxing
        int value = obj;
        System.out.println("value = " + value);

        //연산시 Unboxing
        int result = obj + 100;
        System.out.println("result = " + result);


    }
}
