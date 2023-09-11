package ch09nested.book.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOK = new Button();

        //Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬클래스)
        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Ok버튼을 클릭했습니다");
            }
        }

        //Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOK.setClickListener(new OkListener());

        //Ok버튼 클릭하기
        btnOK.click();

        //------------------------------------------------

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }
        //Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new CancelListener());

        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
