package ait.bank;

import ait.bank.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {
        BankAccount acc0 = new BankAccount(1000, "Peter", "Bank#1", 101, 100);
        System.out.println(acc0.getBalance());
        System.out.println(acc0.getAccount());
        acc0.display("  Mr:");
        acc0.deposit(500);
        System.out.println(acc0.getBalance());
        System.out.println(acc0.withdrow(200));
        System.out.println(acc0.getBalance());
        BankAccount acc1=new BankAccount(2000, "Jhon", "Bank#1",101);
        acc1.display("  Mr:");
        BankAccount acc2=new BankAccount(3000 , "Bank#2",201,1_000_000);
        acc2.display();
        BankAccount acc3=new BankAccount(4000 , "Bank#2",201);
        acc3.display();
    }
}
