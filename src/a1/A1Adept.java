package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		String[] options = new String[count];
		
		double[] prices = new double[count];

		
		for (int i = 0; i < count; i++) {
			options[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		int customers = scan.nextInt();
		String[] names = new String[customers];
		double[] totals = new double[customers];
		for (int i = 0; i < customers; i++) {
			names[i] = scan.next() + " " + scan.next();
			int items = scan.nextInt();
			for (int j = 0; j < items; j++) {
				int howMany = scan.nextInt();
				String item = scan.next();
				for (int q = 0; q < options.length; q++) {
					if (item.equals(options[q])) {
						totals[i] += (howMany * prices[q]);
						break;
					}
				}
			}
		}
		double biggestPrice = totals[0];
		double smallestPrice = totals[0];
		String biggestSpender = names[0];
		String smallestSpender = names[0];
		double sum = 0;
		for (int i = 1; i < totals.length; i++) {
			if (totals[i] > biggestPrice) {
				biggestPrice = totals[i];
				biggestSpender = names[i];
			}
		}
		for (int i = 1; i < totals.length; i++) {
			if (totals[i] < smallestPrice) {
				smallestPrice = totals[i];
				smallestSpender = names[i];
			}
			
		}
		for (int i = 0; i < totals.length; i++) {
			sum += totals[i];
		}
		double average = sum / totals.length;
		
		System.out.println("Biggest: " + biggestSpender + " ("
				+ String.format("%.2f", biggestPrice) + ")" + 
				"\n" + "Smallest: " + smallestSpender + " (" + 
				String.format("%.2f", smallestPrice) + ")" + 
				"\n" + "Average: " + String.format("%.2f", average));
	}
}
