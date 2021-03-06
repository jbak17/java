import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args){
        //variables
        Scanner keyboard = new Scanner(System.in);
        int i, months, year_current = 1;
        double rainfall = 0.0,  average;

        //ask user for number of years
        System.out.println("Please enter the number of years:");
        int years = keyboard.nextInt();
        if (years < 1){
        	System.out.println("Number of years less than one. Program will exit...");
        	System.exit(0);
        }
        
        months = years*12;
        //while loop to count years 
    	System.out.println("Enter monthly rainfall (mm):");
        while (years != 0){
        	
        	//inner for loop ask for number of centimeters for that month
        	for (i=1; i<=12; i++){
        		System.out.printf("Year %d month %d: ", year_current, i);
        		double user_input = keyboard.nextDouble();
        		while (user_input < 0){
        			System.out.println("Invalid: Enter 0 or greater: ");
        			user_input = keyboard.nextDouble();
        		}
        		rainfall += user_input;
        	}
        	
        	year_current += 1;
        	years -= 1;
        }
        average = rainfall/months;
        //display outputs
        System.out.printf("Number of months: %d\n", months);
        System.out.printf("Total rainfall: %.1f centimetres\n", rainfall);
        System.out.printf("Average rainfall: %f centimetres\n", average);
    }
}
