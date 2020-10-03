package codingtest;

public class CodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "character"; 
       // int index = firstNonRepeating(str); 
     //   System.out.println(firstNonRepeating(str));
        firstNonRepeating(str);
  
       // System.out.println( index == -1 ? "NA": str.charAt(index)); 
	}

	static final int NO_OF_CHARS = 256; 
    static char count[] = new char[NO_OF_CHARS]; 
  
 
    static void getCharCountArray(String str) 
    { 
        for (int i = 0; i < str.length(); i++) 
            count[str.charAt(i)]++; 
    } 
  
    static String firstNonRepeating(String str) 
    { 
    	String output=null;
        getCharCountArray(str); 
        int index = -1, i; 
  
        for (i = 0; i < str.length(); i++) { 
            if (count[str.charAt(i)] == 1) { 
                index = i; 
                break; 
            } 
        } 
        System.out.println( index == -1 ? "NA": str.charAt(index));
        output = index == -1 ? "NA": Character.toString(str.charAt(index));
        return output; 
    } 
}
