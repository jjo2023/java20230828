package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regular expression : 정규식(=정규표현식)
        //문자열의 패턴을 나타내는 기호들

        //문자
        System.out.println("x".matches("x")); //true
        System.out.println("a".matches("a")); //true
        System.out.println("a".matches("x")); //false

        //문자들
        System.out.println("xyz".matches("xyz")); //true
        System.out.println("xxx".matches("xxx")); //true
        System.out.println("xxx".matches("x")); //false

        // 수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); //true
        System.out.println("aaa.".matches("a{3}")); //true
        System.out.println("aa.".matches("a{3}")); //false
        System.out.println("aaa.".matches("a{1,3}")); //true
        System.out.println("aa.".matches("a{1,3}")); //true
        System.out.println("a.".matches("a{1,3}")); //true

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));

        System.out.println("dodog".matches("do{1,3}g")); //false

        // 그룹 : ()
        System.out.println("dodog".matches("(do){1,3}g")); //true
        System.out.println("dododog".matches("(do){1,3}g")); //true
        System.out.println("dog".matches("(do){1,3}g")); //true

        // 수량 :
        System.out.println("dog".matches("do{1,}g")); //true
        System.out.println("doog".matches("do{1,}g")); //true
        System.out.println("dooog".matches("do{1,}g")); //true
        System.out.println("doooog".matches("do{1,}g")); //true
        System.out.println("dooooooog".matches("do{1,}g")); //true
                                               // o가 한개 이상이면 true!

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g")); //true
        System.out.println("dog".matches("do?g")); //true
        System.out.println("doog".matches("do?g")); //false
                                          // ? 앞의 패턴이 없거나 한번

        // * : 0번 이상
        System.out.println("dg".matches("do*g")); //true
        System.out.println("dog".matches("do*g")); //true
        System.out.println("doog".matches("do*g")); //true
        System.out.println("dooog".matches("do*g")); //true
        System.out.println("doooog".matches("do*g")); //true

        // + : 1번 이상
        System.out.println("dg".matches("do+g")); //false
        System.out.println("dog".matches("do+g")); //true
        System.out.println("doog".matches("do+g")); //true
        System.out.println("dooog".matches("do+g")); //true
        System.out.println("doooog".matches("do+g")); //true

        //문자 분류(Character classes)
        System.out.println("dog".matches("d[oi]g"));
        System.out.println("dig".matches("d[oi]g"));
        System.out.println("dag".matches("d[oi]g"));

        System.out.println("dog".matches("d[^oi]g"));
        System.out.println("dig".matches("d[^oi]g"));
        System.out.println("dag".matches("d[^oi]g"));

        System.out.println("dag".matches("d[a-z]g"));
        System.out.println("dbg".matches("d[a-z]g"));
        System.out.println("dcg".matches("d[a-z]g"));
        System.out.println("dzg".matches("d[a-z]g"));

        System.out.println("dag".matches("d[a-cx-y]g"));
        System.out.println("dbg".matches("d[a-cx-y]g"));
        System.out.println("dcg".matches("d[a-cx-y]g"));
        System.out.println("ddg".matches("d[a-cx-y]g"));
        System.out.println("deg".matches("d[a-cx-y]g"));
        System.out.println("dfg".matches("d[a-cx-y]g"));
        System.out.println("dxg".matches("d[a-cx-y]g"));
        System.out.println("dyg".matches("d[a-cx-y]g"));
        System.out.println("dzg".matches("d[a-cx-y]g"));
                                              //a-c까지, x-y까지..d,e,f는 false


        //문자 분류 기호
        System.out.println("0".matches("[0-9]"));
        System.out.println("7".matches("[0-9]"));
        System.out.println("0".matches("\\d"));
        System.out.println("7".matches("\\d"));

        System.out.println("a".matches("[a-zA-Z_0-9]"));
        System.out.println("_".matches("\\w"));
        System.out.println("8".matches("\\w"));

        // 예제 자바 변수명 작성 규칙
        // : 숫자로 시작하면 안되고, 영문 대소문자, _, $, 숫자(앞에만 안오면 됨)
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern)); //true
        System.out.println("_".matches(pattern));
        System.out.println("$".matches(pattern));
        System.out.println("4".matches(pattern));

        // 전화번호 패턴
        String pattern2 = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("010-9999-9999".matches(pattern2));
        System.out.println("02-9999-9999".matches(pattern2));
        System.out.println("02-999-9999".matches(pattern2));
        System.out.println("01099998888".matches(pattern2));
        System.out.println("0212345678".matches(pattern2));
        System.out.println("021234567".matches(pattern2));

        //모든 문자 :                        ????????
        System.out.println("".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));
        System.out.println(".".matches("."));

        // . : \.
        System.out.println("".matches("\\."));
        System.out.println("a".matches("\\."));
        System.out.println("3".matches("\\."));
        System.out.println("+".matches("\\."));
        System.out.println(".".matches("\\."));

        // 이메일 패턴
        // 영문소문자, 숫자 여러개 @ 영문소문자, 숫자여러개. 영문소문자, 숫자여러개
        // 예시 :  john23@google3.co2m
        String pattern3 = "[a-z0-9] + @[a-z0-9] + \\.[a-z0-9]+";
        System.out.println("john23@google3.co2m".matches(pattern3));

        //or : |
        System.out.println("ksfdogksf".matches(".*dog.*"));
        System.out.println("djfcatdsj".matches(".*cat.*"));
        System.out.println("fdfsdogddsds".matches(".*(dog|cat.*)"));
        System.out.println("fdfsdocatgddsds".matches(".*(dog|cat.*)"));
                                                        // .*


    }
}
