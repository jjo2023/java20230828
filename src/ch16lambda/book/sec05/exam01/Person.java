package ch16lambda.book.sec05.exam01;

public class Person {
    public void action(Calcuable calcuable){
        double result = calcuable.clac(10,4);
        System.out.println("result = " + result);
    }
}
