package javalearning;

import java.util.Scanner;

public class Prinpowerbill {

	public static Scanner S;
	public static double billpay;

	public static void main(String args[]) {
		System.out.println("enter the no of units");
		S = new Scanner(System.in);
		float unit = S.nextFloat();

		if (unit < 100) {
			billpay = (double) (unit * 2.50);
			System.out.println((billpay));
		}

		if (unit > 100 & unit < 500) {
			billpay = (unit - 100) * 3;
			System.out.println((100 * 2.5) + (billpay));
		}

		if (unit >= 500) {
			billpay = (unit - 500) * 4.5;
			System.out.println(((100 * 2.5) + (400 * 3.0) + billpay));
		}

	}
}