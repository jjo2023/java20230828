package ch05reference;

public class C10method {

	public static void main(String[] args) {
		int []a= {3,4,5};
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(a));
		
		
		System.out.println(a[0]);
		method1(a);
		
		System.out.println("a메소드호출 후");
		System.out.println(a[0]);

	}
	public static void method1(int[] p) {
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(p));
		System.out.println(p[0]);
		
		p[0]=33;
	}

}
