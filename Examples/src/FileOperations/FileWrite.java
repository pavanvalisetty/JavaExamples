package FileOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileWrite {

	 public static void main(String args[])throws Exception{ 
		 
		 // File Write 
		  Student s1 =new Student(211,"ravi",22);//creating object  
		  //writing object into file  
		  FileOutputStream f=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(f);  
		  out.writeObject(s1);  
		  out.flush();  
		  
		  out.close();  
		  f.close();  
		  System.out.println("success");  
		  
	 
	 ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
	  Student s=(Student)in.readObject();  
	  System.out.println(s.id+" "+s.name+" "+s.age);  
	  in.close();  
	 }
}
class Student implements Serializable{  
	 int id;  
	 String name;  
	 transient int age;//Now it will not be serialized  
	 public Student(int id, String name,int age) {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	 }  
	}  
interface MyInterface{
	
	public abstract void test();
	public default void myTest() {
		
	}
		
	
}