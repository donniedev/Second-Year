import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		
		int anArray[] = new int[3];
		double inputSeconds;
		double minutes;
		int hours;
		int sum;
		
		//double time = 200.3456;
		//DecimalFormat df = new DecimalFormat("#.##");      
		//time = Double.valueOf(df.format(time));
		
		
	
			 System.out.println("Enter seconds :");
			inputSeconds = scanner.nextDouble();
			
			minutes = inputSeconds / 60;
			DecimalFormat df1 = new DecimalFormat("#.0"); 
			double cos = Double.valueOf(df1.format(minutes));
		
			
			
			
			
			//hours = inputSeconds / 60 / 60;
		//System.out.println( "Hours " + hours );
		System.out.println( "Minutes " + cos );
		//System.out.println( "Amount of seconds" + minutes + hours);// jak jest tak to potraktuje to jako stringa

	}

}
