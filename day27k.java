package test4;

public class day27k {

	public static void main(String[] args) {
		//11 .Define a class with abstract method and inherit via norma
		BOAK A=new BOAK();
		A.loan();
		A.save();
		A.DisplayMessage();

	}

}
abstract class WorldBankKk{
	abstract void  save();
	abstract void  loan();
 public void DisplayMessage() {
	 System.out.println("welcome to worldBank");
 }
		
}
class BOAK extends WorldBankKk{

	
	public void save() {
		System.out.println("save method");
		
	}

	public void loan() {
		System.out.println("save method");
		
		
	}
	}
		
	class chaseK extends WorldBankKk{

		
		public void save() {
			System.out.println("save method");
			
		}

		
		public void loan() {
			System.out.println("loan method");
			
			
		}
		} 
