package javaExample;

import java.util.Scanner;

public class SwitchExp {
	public static void main(String args[]) {
		Scanner SC = new Scanner(System.in);
		System.out.println(" 1.Add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("Enter first number");
		int a = SC.nextInt();
		System.out.println("Enter second number");
		int b = SC.nextInt();
		System.out.println("Enter your choice ");
		int CH = SC.nextInt();
		switch (2) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(5 - 10);
			break;
		case 3:
			System.out.println(10 * 5);
			break;
		case 4:
			System.out.println(10 / 5);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
