package practise1;

import java.util.Scanner;

public class task01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		for(int i = 0; i < name.length() + 2; i++) {
			if(i == 0 || i == name.length() + 1) System.out.print("+");
			else System.out.print("-");
		}
		System.out.println();
		System.out.print("|");
		System.out.print(name);
		System.out.print("|");
		System.out.println();
		
		for(int i = 0; i < name.length() + 2; i++) {
			if(i == 0 || i == name.length() + 1) System.out.print("+");
			else System.out.print("-");
		}
		in.close();
	}

}
