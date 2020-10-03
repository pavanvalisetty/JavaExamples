package codingtest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IndentationProgram {

	public static int SPACES = 0;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

        Scanner jfile = new Scanner(new File("C:\\Users\\Paavan\\eclipse-workspace\\Java_Examples\\src\\com\\codingtest\\indentation.txt"));
        while (jfile.hasNextLine()) {
            String text = jfile.nextLine();
            if (text.contains("}")) {
                SPACES -= 4;
            }
            for (int i = 0; i < SPACES; i++) {
                System.out.print(" ");
            }
            printLine(text);
            if (text.contains("{")) {
                SPACES += 4;
            }
        }
	}
	public static void printLine(String text) {
        Scanner data = new Scanner(text);
        while (data.hasNext()) {
            System.out.print(data.next());
        }
        System.out.println();
    }
}
