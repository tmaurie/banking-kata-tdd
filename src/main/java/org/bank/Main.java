package org.bank;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(100);
        account.deposit(50);
        account.withdraw(50);
        account.printStatement();

    }
}