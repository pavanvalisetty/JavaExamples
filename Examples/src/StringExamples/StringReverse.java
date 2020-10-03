package StringExamples;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="i.like.this.program.very.much";
		
		char ch[]=s.toCharArray();
		String[] words = s.split("[.]");
		String total="";
		
		for(int i = words.length;i > 0;i--) {
			total=total+words[i-1]+".";
		}
		System.out.println(""+total);
		}

}
