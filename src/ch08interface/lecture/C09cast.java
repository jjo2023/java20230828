package ch08interface.lecture;

public class C09cast {
    public static void main(String[] args) {
        CharSequence c="java";

        String s = (String) c; //ok
        Object o = (Object) c; //ok

        System.out.println("프로그램 종료");
    }
}
