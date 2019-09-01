package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			String first = scan.next();
			char f = first.charAt(0);
			String l = scan.next();
			double total = 0;
			int items = scan.nextInt();
			for (int j = 0; j < items; j++) {
				int howMany = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				total += price * howMany;
			}
			System.out.println(f + ". " + l + ": " + String.format("%.2f", total));
		}
		scan.close();
	}
}
