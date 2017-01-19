import javax.swing.JOptionPane;

public class Lab4JOption {

	public static void main(String[] args) {

		String firstName = JOptionPane.showInputDialog("Enter first name");
		String lasttName = JOptionPane.showInputDialog("Enter last name");		
		
		String tempAge = JOptionPane.showInputDialog("Enter age");
		
		int age = Integer.parseInt(tempAge);
		
				

	}

}
