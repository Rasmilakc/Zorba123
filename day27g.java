package test4;

public class day27g {

	public static void main(String[] args) {
		// 7.Define a example for exceptional handling cia try catch up
		System.out.println("hello");
		System.out.println(5/0);
		System.out.println("bye");
		
	
		
		System.out.println("hello");
		try {	
			int divideByZero = 5/0;
			System.out.println("Rest of code in try block");
			System.out.println("Rest of code in try block2");
			System.out.println("Rest of code in try block3");
			System.out.println("Rest of code in try block4");
			
		}
		catch(ArithmeticException e) {
				
			System.out.println(e.getMessage());
		}
		
		     System.out.println("bye");
		
	}

}
