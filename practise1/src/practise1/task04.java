package practise1;

import java.util.Scanner;

public class task04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double D = (b * b) - 4 * a * c;
		D = Math.sqrt(D);
		double x1 = (-b - D) / 2 * a;
		double x2 = (-b + D) / 2 * a;
		System.out.print("x1, x2 = ");
		System.out.print(x1); System.out.print(", ");
		System.out.print(x2);
		in.close();
		
	}

}
