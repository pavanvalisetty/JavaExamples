package ReadingData;

import java.util.Scanner;

public class StringReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number"+scanner.next());
		System.out.println("Enter number"+scanner.next());
		System.out.println("Enter number"+scanner.next());
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter loop number"+scanner.next());
		}
	}

}
