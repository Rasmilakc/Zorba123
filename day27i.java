package test4;

import java.io.FileWriter;
import java.io.IOException;

public class day27i {

	public static void main(String[] args) {
		// 9. write a program to write a text file
		String fileName="example.txt";
		try {
			FileWriter writer=new FileWriter(fileName);
			
			//write into the file
			writer.write("Hello");
			writer.write("\n");
			writer.write("i am learning judo");
			writer.write("\n");
			writer.write("I am learning sql");
			writer.write("\n");
	        writer.write("I am learning  ruby");
			writer.write("\n");
			writer.close();
			System.out.println("data successfully written and file is closed");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}


		

	}


