package StreamExamples;

import java.util.*;  
import java.util.stream.Collectors;
import java.util.stream.Stream;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}  
    
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);
        
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);   
        
        HashMap<String,Product> myMap = new HashMap<String,Product>();
        myMap.put("10",new Product(1,"HP Laptop",25000f));
        myMap.put("20",new Product(2,"Dell Laptop",30000f));
        myMap.put("30",new Product(3,"Lenevo Laptop",28000f));
        
        myMap.entrySet().stream().filter(ele->ele.getValue().getPrice()>25000f).collect(Collectors.toList());
       // myMap.entrySet().stream().map(Product::getName).collect(Collectors.toList());
        
    } 
   
}  
 