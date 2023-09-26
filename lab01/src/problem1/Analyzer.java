package problem1;

import java.util.Scanner;

public class Analyzer{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Data data = new Data();
        System.out.print("Enter number (Q to quit): ");
        while(scan.hasNextDouble()){
            System.out.print("Enter number (Q to quit): ");
            data.addValue(scan.nextDouble());
        }
        System.out.println(data.average());
        System.out.println(data.getLargestValue());
        System.out.println(data);
        scan.close();
    }
    
}
