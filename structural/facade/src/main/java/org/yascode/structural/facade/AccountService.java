package org.yascode.structural.facade;

public class AccountService {
    public void openAccount(String accountName) {
        System.out.println("Account opened for: " + accountName);
    }

    public void closeAccount(String accountName) {
        System.out.println("Account closed for: " + accountName);
    }
}
