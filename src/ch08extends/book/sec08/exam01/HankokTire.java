package ch08extends.book.sec08.exam01;

public class HankokTire extends Tire{
    //메소드재정의(오버라이딩)
    @Override
    public void roll(){
        System.out.println("한국타이어가 회전합니다.");
    }
}
