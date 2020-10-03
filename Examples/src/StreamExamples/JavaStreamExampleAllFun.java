package StreamExamples;

import java.util.*;
import java.util.stream.Collectors;  
class Employee
{
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	 int id;
	   String name;
	   int salary;
	
	  Employee(int id,String name,int salary){
		  super();
		  this.id=id;
		  this.name=name;
		  this.salary=salary;
	  }
}
public class JavaStreamExampleAllFun {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        // This is more compact approach for filtering data  
        Float totalPrice = productsList.stream()  
                    .map(product->product.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);  
        // More precise code   
        float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  
        
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(p->p.price));  
        System.out.println(totalPrice3); 
        
        
        // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        System.out.println(productA.price);  
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .min((product1, product2)->   
                product1.price > product2.price ? 1: -1).get();  
        System.out.println(productB.price); 
        
        long count = productsList.stream()  
                .filter(product->product.price<30000)  
                .count();  
    System.out.println(count);  
    
    // Converting product List into Set  
    Set<Float> productPriceList =   
        productsList.stream()  
        .filter(product->product.price < 30000)   // filter product on the base of price  
        .map(product->product.price)  
        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
    System.out.println(productPriceList);  
    
    // Converting Product List into a Map  
    Map<Integer,String> productPriceMap =   
        productsList.stream()  
                    .collect(Collectors.toMap(p->p.id, p->p.name));  
          
    System.out.println(productPriceMap);

    // Sum
   List<Employee> mylist=Arrays.asList(new Employee(1,"ABC",150),new Employee(2,"fgf",150));
   
   
   int total = mylist.stream().collect(
		   Collectors.summingInt(Employee::getSalary));
    
   System.out.println("---------"+total);
   
   List<Employee> emplist = new ArrayList<Employee>();  
   //Sum of Example 1 
   emplist.add(new Employee(1,"HP Laptop",25000));  
   emplist.add(new Employee(1,"HP Laptop",500));  
   
   int sum=emplist.stream()
   .collect(Collectors.summingInt(p->p.salary));
   System.out.println("---------"+sum);
   
   //Sum of Example 2
   int sum1=emplist.stream()
		   .map(p->p.salary)
		   .reduce(0, (mytotal,salary)->mytotal+salary);
		   System.out.println("---------"+sum1);
    } 
  
} 
