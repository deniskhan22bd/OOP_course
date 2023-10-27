import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String args[]){
        StringTokenizer tokenizer;
        Scanner in = new Scanner(System.in);
        tokenizer = new StringTokenizer(in.nextLine());
        while(tokenizer.hasMoreTokens()){
            StringTokenizer tokenizer2 = new StringTokenizer(tokenizer.nextToken(), "+-*/", true);
            while(tokenizer2.hasMoreTokens()){
                System.out.println(tokenizer2.nextToken());
            }
        }
        in.close();
    }
}
