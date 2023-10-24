package problem4;

import java.util.Objects;

public class CheckingAccount extends Account{
    private int totalNumOfTransactions;
    private final int FREE_TRANSACTIONS = 3;
    private double commission = 0.02;
    private int curNumOfTransactions;


    public CheckingAccount(int accNumber){
        super(accNumber);
    }

    public CheckingAccount(int accNumber, double commission){
        super(accNumber);
        this.commission = commission;
    }

    public void deductFEE(){
        if(curNumOfTransactions > FREE_TRANSACTIONS){
            balance -= (curNumOfTransactions - FREE_TRANSACTIONS) * commission;
            curNumOfTransactions = 3;
        }
    }

    private void addTransactions(){
        totalNumOfTransactions++;
        curNumOfTransactions++;
    }

    public void deposite(double sum){
        super.deposite(sum);
        addTransactions();
    }

    public void withdraw(double sum){
        super.withdraw(sum);
        addTransactions();
    }

    public void transfer(double sum, Account other){
        super.transfer(sum, other);
        addTransactions();
    }

    public String toString(){
        return super.toString() + " total number of transactions = " + totalNumOfTransactions;
    }

    public int hashCode(){
        return Objects.hash(totalNumOfTransactions, FREE_TRANSACTIONS, commission, accNumber, balance);    
    }

    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        CheckingAccount s = (CheckingAccount)o;
        return totalNumOfTransactions == s.totalNumOfTransactions && commission == s.commission;
    }
}
