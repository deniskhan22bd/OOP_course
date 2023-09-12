package practise1;

import java.util.Scanner;

public class task02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Area : "); System.out.println(a * a);
		System.out.println("Perimeter : "); System.out.println(a * 4);
		System.out.println("Diagonal : "); System.out.println(Math.sqrt(2) * a);
		in.close();
	}
}
