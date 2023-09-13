package practise1;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int balance = in.nextInt();
        int interest = in.nextInt();
        System.out.print("Current balance = "); System.out.println(balance);
        System.out.print("Interest = "); System.out.println(interest);
        balance = balance + (balance * interest / 100);
        System.out.print("New balance = "); System.out.println(balance);
        in.close();
    }
}
