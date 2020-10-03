package codingtest;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "noon";
		String output=null;
		boolean unique=true;
		for (int i = 0; i < S.length(); i++) {
			unique = true;
			for (int j = 0; j < S.length(); j++) {
				if (i != j && S.charAt(i) == S.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(S.charAt(i));
				output=Character.toString(S.charAt(i));
				break;
			}
		}
		if(!unique) {
			System.out.println("NA");
			output="NA";
		}
		
		//return output;
	}
}
