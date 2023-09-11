package ch12api.book.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-Z][a-zA-z0-9]{7,11}";

        boolean isMatch = id.matches(regExp);
        boolean isMatch2 = Pattern.matches(regExp, id);
        if(isMatch){
            System.out.println("ID로 사용 할 수 있습니다.");
        }else {
            System.out.println("ID로 사용 할 수 없습니다.");
        }
    }
}
