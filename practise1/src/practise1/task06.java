package practise1;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        String reverse = "";
        for(int i = str.length() - 1; i >= 0 ;i--){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
        scan.close();

    }
}
