import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO String Case Operation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scan.nextLine();
		scan.close();
		SortString string = new SortString(input);
		System.out.println("String: " + string.sortStrings());
		
	}

}

