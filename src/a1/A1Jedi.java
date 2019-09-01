package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		String[] options = new String[count];
		
		double[] prices = new double[count];
		int[] purchased = new int[count];
		
		for (int i = 0; i < count; i++) {
			options[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		int customers = scan.nextInt();
		
		String[] names = new String[customers];
		
		double[] totals = new double[customers];
		
		int[] whoBought = new int[count];
		
		boolean[] alreadyBought = new boolean[count];
		
		for (int i = 0; i < customers; i++) {
			names[i] = scan.next() + " " + scan.next();
			int items = scan.nextInt();
			for (int w = 0; w < count; w++) {
				alreadyBought[w] = false;
			}
			for (int j = 0; j < items; j++) {
				int howMany = scan.nextInt();
				String item = scan.next();
				for (int q = 0; q < options.length; q++) {
					if (item.equals(options[q])) {
						purchased[q] += howMany;
						if (!alreadyBought[q]) {
						whoBought[q]++;
						alreadyBought[q] = true;
						}
					}
				}
			}
		}
		for (int i = 0; i < count; i++) {
			if (whoBought[i] == 0) {
				System.out.println("No customers bought " 
				+ options[i]);
			} else {
				System.out.println(whoBought[i] + 
				" customers bought " + purchased[i] +
				" " + options[i]);
			}
		}
		
	}
}
