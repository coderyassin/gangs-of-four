package org.yascode.structural.facade;

public class BankFacade {
    private AccountService accountService;
    private TransactionService transactionService;
    private NotificationService notificationService;

    public BankFacade() {
        this.accountService = new AccountService();
        this.transactionService = new TransactionService();
        this.notificationService = new NotificationService();
    }

    public void openAccount(String accountName) {
        accountService.openAccount(accountName);
        notificationService.sendNotification("Account opened successfully for: " + accountName);
    }

    public void closeAccount(String accountName) {
        accountService.closeAccount(accountName);
        notificationService.sendNotification("Account closed successfully for: " + accountName);
    }

    public void transferFunds(String fromAccount, String toAccount, double amount) {
        transactionService.transfer(fromAccount, toAccount, amount);
        notificationService.sendNotification(
                "Transfer of $" + amount + " from " + fromAccount + " to " + toAccount + " completed."
        );
    }
}
