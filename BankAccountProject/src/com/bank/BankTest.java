package com.bank;

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();

        // Deposit Test
        acc1.deposit(500, "checking");
        acc1.deposit(1000, "savings");
        acc1.getBalance();

        acc2.deposit(300, "checking");
        acc2.getBalance();

        acc3.deposit(700, "savings");
        acc3.getBalance();

        // Withdrawal Test
        acc1.withdraw(200, "checking");
        acc2.withdraw(1000, "savings"); // should display insufficient funds
        acc3.withdraw(100, "savings");

        acc1.getBalance();
        acc2.getBalance();
        acc3.getBalance();

        // Static Test
        System.out.println("Total Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in System: $" + BankAccount.getTotalMoney());
    }
}

