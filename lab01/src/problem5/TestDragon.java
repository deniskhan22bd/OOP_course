package problem5;

import java.util.Scanner;

public class TestDragon {
    public static void main(String[] args){
        Dragon dragon = new Dragon();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name and gender(B or G) to add in vector (Q to break:)");
        while(true){
            char gender = scan.next().charAt(0);
            if(gender == 'Q') break;
            if(gender == 'B') dragon.kidnap(new Person(Gender.Boy));
            else dragon.kidnap(new Person(Gender.Girl));
        }
        //System.out.println(dragon.getPerson());
        if(dragon.willDragonEatOrNot() == true) System.out.println("No persons, all escaped");
        else System.out.println("Yesssssssssssssss, He will eat");
        scan.close();
    }
}
