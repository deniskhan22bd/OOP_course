package problem4;

import java.util.Objects;

public class SavingsAccount extends Account{
    public double interestRate;

    public SavingsAccount(int accNumber, double interestRate){
        super(accNumber);
        this.interestRate = interestRate;
    }
    
    public void addInterest(){
        super.deposite(balance * interestRate / 100);
    }

    public String toString(){
        return super.toString() + ", interest = " + interestRate;
    }

    public int hashCode(){
        return Objects.hash(interestRate, balance, accNumber);
    }

    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        return interestRate == ((SavingsAccount)o).interestRate;
    }

}
