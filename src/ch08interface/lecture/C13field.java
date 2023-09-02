package ch08interface.lecture;

public class C13field {
    public static void main(String[] args) {
        System.out.println(MmyInterface13.VALUE);
        System.out.println(MmyInterface13.name);
        System.out.println(MmyInterface13.HOME_ADDESS);
    }
}

interface MmyInterface13{
    int VALUE = 30; //public static final
    public static final String name ="java";
    String HOME_ADDESS = "seoul";
}