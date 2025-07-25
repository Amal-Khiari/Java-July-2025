package com.bank;

import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts = 0;
    private static double totalMoney = 0;
    private String accountNumber;

    // CONSTRUCTOR
    public BankAccount() {
        this.accountNumber = generateAccountNumber();
        accounts++;
    }

    // PRIVATE METHOD → Ninja Bonus 2
    private String generateAccountNumber() {
        Random rand = new Random();
        StringBuilder accNum = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accNum.append(rand.nextInt(10));
        }
        return accNum.toString();
    }

    // GETTERS
    public double getCheckingBalance() { return checkingBalance; }
    public double getSavingsBalance() { return savingsBalance; }
    public static int getAccounts() { return accounts; }
    public static double getTotalMoney() { return totalMoney; }
    public String getAccountNumber() { return accountNumber; }

    // DEPOSIT METHOD
    public void deposit(double amount, String type) {
        if (type.equals("checking")) {
            checkingBalance += amount;
        } else if (type.equals("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    // WITHDRAW METHOD
    public void withdraw(double amount, String type) {
        if (type.equals("checking") && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalMoney -= amount;
        } else if (type.equals("savings") && savingsBalance >= amount) {
            savingsBalance -= amount;
            totalMoney -= amount;
        } else {
            System.out.println("Insufficient funds in " + type + " account.");
        }
    }

    // DISPLAY BALANCE
    public void getBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Checking: $" + checkingBalance);
        System.out.println("Savings: $" + savingsBalance);
    }
}
