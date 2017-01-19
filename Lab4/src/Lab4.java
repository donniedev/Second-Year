import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String firstName;
		String secondName;
		boolean containsChar = false;
		int charIndex = 0;
		System.out.print("Enter first name ");
		firstName = scanner.next();
		System.out.print("Enter second name ");
		secondName = scanner.next();
		
		
		int	firstNameLength = firstName.length(); 
		int	secondNameLength = secondName.length(); 
	
		
		String initials = "" + firstName.charAt(0) + "."+ secondName.charAt(0);
		
		String lastCharacterFirstName = "" + firstName.charAt(firstNameLength-1);
		String lastCharacterSecondName = "" + secondName.charAt(secondNameLength-1);
		
		for ( int i = 0; i< firstNameLength; i++)
			{
				if (firstName.charAt(i) == 'a')
				{
					containsChar = true;
					charIndex = i;
				}
			}
		System.out.println(firstName.toUpperCase());
		System.out.println(firstNameLength + secondNameLength);
		System.out.println(initials);
		System.out.println("last characters: " + lastCharacterFirstName + lastCharacterSecondName);
		System.out.println("a index in first name " + charIndex);
	}
	
	/*
	 * f.	Display the name in all upper case
g.	Display the length of the Strings
h.	Display the initials of the person
i.	Display the last characters of the first and last name
j.	Display the index position of ‘a’  in the first name

	 * 
	 */

}
