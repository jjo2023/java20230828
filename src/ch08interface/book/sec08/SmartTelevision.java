package ch08interface.book.sec08;

public class SmartTelevision implements RemoteControl,Searchable{
    //turnOn() 추상메소드 오버라이딩

    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다");
    }
    //turnOff() 추상메소드 오버라딩

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다.");
    }

    //search() 추상 메소드 오버라이딩

    @Override
    public void search(String url) {
        System.out.println(url+"을 검색합니다");
    }
}
