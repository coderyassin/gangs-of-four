package org.yascode.creational.factory.main;

import org.yascode.creational.factory.Computer;
import org.yascode.creational.factory.ComputerFactory;

public class MainApplication {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer("PC","16 GB","512 GB","2.4 GHz");
        Computer server = ComputerFactory.createComputer("Server", "64 GB", "1 TB", "3.9 GHz");

        System.out.println(pc);
        System.out.println(server);
    }
}
