package test4;

import java.util.HashMap;

public class day27j {

	public static void main(String[] args) {
		// 10.Define a Hashmap and loop throgh it
		HashMap<String,Integer>students=new HashMap<>();
		students.put("rasmila", 33);
		students.put("sajan", 45);
		students.put("surakshya", 25);
		students.put("ronika", 25);
		students.put("payal", 27);
		System.out.println(students);
		
		//for loop
		for(String a:students.keySet()) {
			System.out.println(a);
		}
		
		for(Integer b:students.values()) {
			System.out.println(b);
		}	
		
		
		

	}

}
