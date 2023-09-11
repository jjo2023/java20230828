package ch12api.lecture;

public class C07equals {
    public static void main(String[] args) {
        Myclass07 o1 = new Myclass07("박지성");
        Myclass07 o2 = new Myclass07("박지성");
        Myclass07 o3 = new Myclass07("김민재");

        System.out.println(o1==o2);//false
        System.out.println(o1.equals(o2));//true

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1.equals(o3)); //false
        System.out.println(o1.hashCode());
        System.out.println(o3.hashCode());
    }
}
class Myclass07{
    private String name;
    public Myclass07(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        Myclass07 o = (Myclass07) obj;
        return this.name.equals(o.name);
    }
}