package ch16lambda.lecture;

import java.util.Arrays;
import java.util.List;

public class C04parameter {
    public static void main(String[] args) {
        //파라미터 하나일 때
        MyInterface04 o1 = (int x)-> {};
        MyInterface04 o2 = (x)->{};
        MyInterface04 o3 = x->{}; //파라미터 하나면 둥근 괄호도 생략 가능

        List<String> list = List.of("java","spring","css","html");
        list.forEach(e-> System.out.println(e));

        int[] arr = {10,20,40,100,200,300};
        Arrays.stream(arr).forEach(e-> System.out.println(e));
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
    }
}
interface MyInterface04{
    void method(int X);
}
