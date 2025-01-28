package org.yascode.structural.facade;

public class TransactionService {
    public void transfer(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferring $" + amount + " from " + fromAccount + " to " + toAccount);
    }
}
