package problem4;

public class Test {
    public static void main(String args[]){
        Bank bank = new Bank();
        Account a1 = new Account(1);
        a1.deposite(100);

        SavingsAccount s1 = new SavingsAccount(2, 5);
        s1.deposite(1000);

        CheckingAccount c1 = new CheckingAccount(3, 5);
        c1.deposite(1000);
        c1.deposite(1000);
        c1.deposite(10);
        c1.deposite(100);


        bank.addAccount(a1);
        bank.addAccount(c1);
        bank.addAccount(s1);

        bank.update();
    }
}
