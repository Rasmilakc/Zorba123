package test4;

public class day27c {

	public static void main(String[] args) {
		//3. Define two classes with inheritance
		//Student a=new Student("ram", "sharma", 32);
		
		Teacher b=new Teacher("shyam","sharma" ,32,20000);
		System.out.println(b.firstName);
		System.out.println(b.lastName);
		System.out.println(b.age);
		System.out.println(b.salary);
				
				

	}

}
class Student{
	String firstName;
	String lastName;
	int age;
	public Student(String fn,String ln,int ag) {
		this.firstName=fn;
		this.lastName=ln;
		this.age=ag;
	}
	public void displayName() {
		System.out.println(this.firstName+this.lastName);
	}
	
}
class Teacher extends Student{
	int salary;
	public Teacher(String fn,String ln,int ag,int sal) {
		super(fn,ln,ag);
		this.salary=sal;
	}
	public void DisplaySalary() {
		System.out.println(this.salary);
	}
}
