package codingtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RemoveComments {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		String s=null;
		// TODO Auto-generated method stub

	/*FileInputStream fis = new FileInputStream("C:\\Users\\Paavan\\eclipse-workspace\\Java_Examples\\src\\com\\codingtest\\SubSetEven.java");
	 ObjectInputStream ois= new ObjectInputStream(fis);
	 
	 
	 while((s=ois.readLine())!=null) {
		 System.out.println(s);
	 }*/
	String pattern = "(/\\*((.|\n)*?)\\*/)|/.*";
	//String pattern1="(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)";
	 File f = new File("C:\\\\Users\\\\Paavan\\\\eclipse-workspace\\\\Java_Examples\\\\src\\\\com\\\\codingtest\\\\test.c");
	 BufferedReader bf = new BufferedReader(new FileReader(f));
	 while((s=bf.readLine())!=null) {
		
		 //String myString = s.replaceAll(pattern, "");
		 s=s.replaceAll("//*", "");
		 s=s.replaceAll("\\*", "");
		 System.out.println(s);
		 
	 }
	}

}
