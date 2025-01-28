package org.yascode.structural.facade;

public class MainApplication {

    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();

        bankFacade.openAccount("YasCode");
        bankFacade.transferFunds("YasCode", "Yassin", 200.0);
        bankFacade.closeAccount("YasCode");
    }
}
