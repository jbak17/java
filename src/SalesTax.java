import java.text.DecimalFormat;
import java.util.Scanner;


public class SalesTax {
	public static void main(String[] args){
		//constants
		final double FEDERAL = 0.05;
		final double STATE = 0.03;
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		//variables
		double federal, state, purchase_amount, tax_total;
		
		//get user input, prompt user for purchase amount
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the purchase price:");
		purchase_amount = keyboard.nextDouble();
		
		//perform calculation
		federal = purchase_amount*FEDERAL;
		state = purchase_amount*STATE;
		tax_total = federal + state;
		
		//output
		System.out.println("Purchase amount: $" + purchase_amount);
		System.out.println("Federal tax: $" + df.format(federal));
		System.out.println("City tax: $" + df.format(state));
		System.out.println("Total tax: $" + df.format(tax_total));
		System.out.println("Total cost: $" + df.format(purchase_amount + tax_total));
	}
}
