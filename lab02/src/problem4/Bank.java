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
        for(Account a : accounts){
            if(a.getClass() == SavingsAccount.class){
                SavingsAccount s = (SavingsAccount)a;
                System.out.println(s);
                s.addInterest();
                System.out.println(s);
            }
            else if(a.getClass() == CheckingAccount.class){
                CheckingAccount c = (CheckingAccount)a;
                System.out.println(c);
                c.deductFEE();
                System.out.println(c);
            }
            else{
                System.out.println(a);
            }
        }

    }
}
