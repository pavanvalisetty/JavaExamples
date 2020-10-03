package ReadingData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		  
		System.out.println("Enter your name");  
		String name=br.readLine();  
		System.out.println("Welcome "+name);  
		for(int i=0;i<5;i++) {
			
			name=br.readLine();  
			int test=br.read();
			System.out.println("Welcome "+name); 
			System.out.println("test "+test); 
		}
	}

}
