package ch12api.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i =3;
        Integer j = Integer.valueOf(i);
        Object k = j;

        int l =5;
        Integer m = l;
        Object n =m;

        Object o =7;

        //int p = 0; //xx
        Integer q = (Integer) o; //위험!!
        int r = q;


        int s = 30; //4byte
        long t = s; //8byte

        Integer u =300;
        //Long v = u; //??

        float w = 3.14f; //4byte
        double x = w; //8byte

        Float y = 3.14f;
        //Double z = y; //xx

    }
}
