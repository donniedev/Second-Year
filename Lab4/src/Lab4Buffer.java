import java.util.Scanner;

public class Lab4Buffer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = scanner.next();
		
		
		 StringBuffer sBuffer = new StringBuffer(name);
		 System.out.println(name);

	}

}
