package ch16lambda.book.sec05.exam03;

public class Person {
    public Member getMember1(Creatable1 creatable){
        String id = "winter";
        Member member = creatable.create(id);
        return member;
    }

    public Member getMember2(Createable2 createable){
        String id = "winter";
        String name = "한겨울";
        Member member = createable.create(id, name);
        return member;
    }
}
