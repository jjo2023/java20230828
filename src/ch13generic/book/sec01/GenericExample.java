package ch13generic.book.sec01;

public class GenericExample {
    public static void main(String[] args) {
        // Box<String> box1 = new Box<String>();
        Box<String> box1 = new Box<>();
        box1.contnet = "안녕하세요";
        String str = box1.contnet;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.contnet = 100;
        int value = box2.contnet;
        System.out.println(value);

    }
}
