package org.yascode.creational.abstractFactory.main;

import org.yascode.creational.abstractFactory.Computer;
import org.yascode.creational.abstractFactory.ComputerFactory;
import org.yascode.creational.abstractFactory.PCFactory;
import org.yascode.creational.abstractFactory.ServerFactory;

public class MainApplication {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputer(new PCFactory("16 GB", "512 GB", "2.4 GHz"));
        Computer server = ComputerFactory.createComputer(new ServerFactory("64 GB", "1 TB", "3.9 GHz"));

        System.out.println(pc);
        System.out.println(server);
    }
}
