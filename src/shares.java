import java.text.DecimalFormat;


public class shares 
{
	public static void main(String[] args){
		//number of shares purchased, price, commission
		int share = 1000;
		double buyPrice, sellPrice, commission, costBuy, costSell, profit;
		DecimalFormat df = new DecimalFormat("#.###");
		
		commission = 0.02;
		buyPrice = 32.87;
		sellPrice = 33.92;
		
		costBuy = share*buyPrice;
		costBuy += costBuy*commission;
		//number of shares sold, price, commission
		costSell = share*sellPrice;
		costSell -= costSell*commission;
		
		//profit
		profit = costSell - costBuy;
		
		//output
		System.out.println("Amount paid: " + buyPrice*share);
		System.out.println("Commission paid: " + commission*buyPrice*share);
		System.out.println("Amount earned from sale: " + sellPrice*share);
		System.out.println("Commission paid: " + commission*sellPrice*share);
		System.out.println("Profit: " + df.format(profit));
		
	}
}
