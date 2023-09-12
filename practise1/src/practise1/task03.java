package practise1;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a >= 95) System.out.println("A");
		else if(a >= 90) System.out.println("A-");
		else if(a >= 85) System.out.println("B+");
		else if(a >= 80) System.out.println("B");
		else if(a >= 75) System.out.println("B-");
		else if(a >= 70) System.out.println("C+");
		else if(a >= 65) System.out.println("C");
		else if(a >= 60) System.out.println("C-");
		else if(a >= 55) System.out.println("D+");
		else if(a >= 50) System.out.println("D");
		else System.out.println("F");
		in.close();
		
	}

}
