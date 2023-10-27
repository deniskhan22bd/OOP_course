import java.util.*;
public class Modified
{
    public static void main(String[] args){
        double leftOperand = 0, result = 0, rightOperand = 0;
        String leftString, operator, rightString;
        StringTokenizer tokenizer;
        Scanner in = new Scanner(System.in);
        tokenizer = new StringTokenizer(in.nextLine());
        try{
            StringTokenizer tokenizer2;
            while(tokenizer.hasMoreTokens()){
                tokenizer2 = new StringTokenizer(tokenizer.nextToken(), "+-*/", true);
                leftString   = tokenizer2.nextToken();
                operator     = tokenizer2.nextToken();
                rightString  = tokenizer2.nextToken();
                
                try{
                    leftOperand  = Double.parseDouble(leftString);
                }
                catch(NumberFormatException nfe){
                    System.out.println("Left operand is not a number");
                    throw new NumberFormatException();
                }

                try{
                    rightOperand = Double.parseDouble(rightString);
                }
                catch(NumberFormatException nfe){
                    System.out.println("Right operand is not a number");
                    throw new NumberFormatException();
                }

                if (operator.equals("+"))
                    result = leftOperand + rightOperand;
                else if(operator.equals("-")){
                    result = leftOperand - rightOperand;
                }
                else if(operator.equals("*")){
                    result = leftOperand * rightOperand;
                }
                else if(operator.equals("/")){
                    result = leftOperand / rightOperand;
                }
                else
                    result = 0.0;

                System.out.println("Result: " + result);
            }
        }

        catch (NoSuchElementException nsee){
            System.out.println("Invalid syntax");
        }
        catch(NumberFormatException nfe){
            System.out.println("Result: " + result);
        }
        in.close();

   }
}
