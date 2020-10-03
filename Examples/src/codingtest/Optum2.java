package codingtest;

public class Optum2 {

	static int wordcount(String sentence)  
    {  
      int count=0;  
  
        char ch[]= new char[sentence.length()];     
        for(int i=0;i<sentence.length();i++)  
        {  
            ch[i]= sentence.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
  public static void main(String[] args) {  
      String string ="he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass.Done-done?";  
     System.out.println(wordcount(string));   
} 
}
