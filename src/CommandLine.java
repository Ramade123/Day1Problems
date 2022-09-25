import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args) {
	System.out.println("Enter a string : ");
	var scanner = new Scanner(System.in);
	String inputstring = scanner.nextLine();
	System.out.println("String read from console is : \n" + inputstring);

	}

}
