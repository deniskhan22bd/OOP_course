package problem4;

import java.util.Objects;

public class Account {
    protected double balance;
    protected int accNumber;

    public Account(int accNumber){
        balance = 0.0;
        this.accNumber = accNumber;
    }

    public void deposite(double sum){
        balance += sum;
    }

    public void withdraw(double sum){
        balance -= sum;
    }

    public double getBalance(){
        return balance;
    }

    public double getAccountNumber(){
        return accNumber;
    }

    public void transfer(double amount, Account other){
        other.deposite(amount);
        balance -= amount;
    }

    public String toString(){
        return "Account number = " + accNumber + ", balance = " + balance;
    }

    public int hashCode(){
        return Objects.hash(balance, accNumber);
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(o.getClass() != this.getClass()) return false;
        Account a = (Account)o;

        return balance == a.balance && accNumber == a.accNumber;
    }

    public final void print(){
        System.out.println(toString());
    }

}
