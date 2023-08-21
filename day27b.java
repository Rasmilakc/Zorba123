package test4;

public class day27b {

	public static void main(String[] args) {
		//2.write a class for singleton pattern
		
		//Database a=new Database();
		Database db1=Database.getInstance();
		db1.getConnetion();
		
	}

} 
class Database {
	
	private static Database dbObject = null;
	Database() {
	}
	
	public static Database getInstance() {
		
		if(dbObject == null) {
			dbObject = new Database();
		}
		// returns you singleton object
		return dbObject;
	}
		
	public void getConnetion() {
		System.out.println("you are connected ");
	}
	
	
	
	
}
