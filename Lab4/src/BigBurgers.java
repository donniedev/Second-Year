import java.util.Scanner;

public class BigBurgers {

	public static void main(String[] args) {
		
		// 30p and sells at 75p. A hamburger costs 40p and sells at 95p. 
		Scanner scanner = new Scanner(System.in);
		int hamburgersAmount;
		int chipsAmount;
		final int hamBuyPrice = 30;
		final int hamSellPrice = 75;
		final int chipsBuyPrice = 40;
		final int chipsSellPrice = 95;
		int hamProfit;
		int chipsProfit;
		
		System.out.println("Enter hamburgers number");
		hamburgersAmount = scanner.nextInt();

		System.out.println("Enter chips number");
		chipsAmount = scanner.nextInt();
		
		hamProfit = (hamburgersAmount * hamSellPrice) - (hamburgersAmount * hamBuyPrice);
		chipsProfit = (chipsAmount * chipsSellPrice) - (chipsAmount * chipsBuyPrice);
		
		System.out.println("Hamburger profit: " + hamProfit);
		System.out.println("Chips profit: " + chipsProfit);
		
		
		
	}

}
