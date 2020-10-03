package LambdaExpressionExample;

import java.util.ArrayList;
import java.util.List;

interface Addable1{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionExampleAddReturn {  
    public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        Addable1 ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable1 ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));  
        
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  
