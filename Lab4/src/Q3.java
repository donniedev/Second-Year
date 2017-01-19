import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int anArray[] = new int[3];
		int minutes;
		int hours;
		int sum;
/*
		for (int index : anArray) {
			
		    System.out.println("Enter hours :");
			anArray[index] = scanner.nextInt();
			System.out.println("Enter minutes :");
			anArray[index] = scanner.nextInt();
			System.out.println("Enter seconds :");
			anArray[index] = scanner.nextInt();
			System.out.println(index);
		}  */
		
			 System.out.println("Enter hours :");
				anArray[0] = scanner.nextInt();
				System.out.println("Enter minutes :");
				anArray[1] = scanner.nextInt();
				System.out.println("Enter seconds :");
				anArray[2] = scanner.nextInt();
			
		hours = anArray[0] * 60 * 60;		
		minutes = (anArray[1] * 60)  + anArray[2];
		
		System.out.println( "Amount of seconds" + (minutes + hours));
		//System.out.println( "Amount of seconds" + minutes + hours);// jak jest tak to potraktuje to jako stringa
		
		
        
	}

}
