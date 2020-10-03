package charEx;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello world";
		// char empty = '';

		String s = " ";
		String[] strArray = str.split(" ");

		for (String myString : strArray) {

			char[] charArray = myString.toCharArray();
			boolean first = true;
			/*for (char ch : charArray) {

				if (first ) {
					s = s + Character.toUpperCase(ch);
					first = false;
				}else {
					s = s + Character.toString(ch);

				}
			}*/
			 myString = myString.substring(0, 1).toUpperCase() + myString.substring(1);
			 System.out.println(" "+myString);
			s = s + " ";
		}
		System.out.println(" output:"+s);
	}

}
