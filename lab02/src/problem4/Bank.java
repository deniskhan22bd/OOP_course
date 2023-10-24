package problem4;

import java.util.Scanner;
import java.util.Vector;

public class Bank {
    private Vector<Account> accounts = new Vector<Account>();

    public Bank(){

    }

    public void addAccount(Account a){
        accounts.add(a);
    }

    public void addAccount(SavingsAccount s){
        accounts.add(s);
    }

    public void addAccount(CheckingAccount c){
        accounts.add(c);
    }

    public void update(){
        Scanner in = new Scanner(System.in);
        for(Account a : accounts){
            System.out.println("Choose option: 1 - deposite, 2 - withdraw");
            int x = in.nextInt();
            if(x == 1){
                System.out.println("Before:" + a);
                System.out.print("Enter the value: ");
                a.deposite(in.nextDouble());
                System.out.println("After: " + a);;
            }
            else if(x == 2){                
                System.out.println("Before:" + a);
                System.out.print("Enter the value: ");
                a.deposite(in.nextDouble());
                System.out.println("After: " + a);;
            }

            if(a.getClass() == SavingsAccount.class){
                SavingsAccount s = (SavingsAccount)a;
                s.addInterest();
                System.out.println("After savings :" + s);
            }
            else if(a.getClass() == CheckingAccount.class){
                CheckingAccount c = (CheckingAccount)a;
                c.deductFEE();
                System.out.println("After deduct :" + c);
            }
        }
        in.close();
    }

    public void openAccount(Account account){
        if(accounts.contains(account)){
            System.out.println("Account exist");
        }
        else{
            accounts.add(account);
            System.out.println("Account created");
        }
    }

    public void closeAccount(Account account){
        if(accounts.contains(account)){
            accounts.remove(account);
            System.out.println("Account closed");
        }
        else{
            System.out.println("Account not found");
        }
    }
}
