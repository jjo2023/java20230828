package ch16lambda.book.exercise.p5;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(()-> System.out.println("Ok 버튼을 클릭함") );
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(()-> System.out.println("Cancle 버튼 클릭함"));
        btnCancel.click();
    }
}
