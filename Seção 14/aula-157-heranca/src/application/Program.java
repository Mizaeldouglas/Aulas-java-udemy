package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004,"Ana", 0.0, 0.01);

        // DOWNCSTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            System.out.println("UPDATE");
        }
        System.out.println("_____________________________________________________________________________");

        Account acc01 = new Account(1001, "Alex", 1000.0);
        acc01.withdraw(200.0);
        System.out.println(acc01.getBalance());

        System.out.println("_____________________________________________________________________________");


        Account acc02 = new SavingsAccount(1002,"maria", 1000.0, 0.01);
        acc02.withdraw(200.0);
        System.out.println(acc02.getBalance());

        System.out.println("_____________________________________________________________________________");

        Account acc03 =new BusinessAccount(1003,"Bob", 1000.0,500.0);
        acc03.withdraw(200.0);
        System.out.println(acc03.getBalance());


    }
}


