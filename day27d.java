package test4;

public class day27d {

	public static void main(String[] args) {
		// 4 define an example of overloading
		AB(3,4);
		AB(3,4,5);
		AB(3,4,5,6);

	}
	public static void AB(int a,int b) {
		System.out.println(a+b);
	}
	public static void AB(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void AB(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}

}

