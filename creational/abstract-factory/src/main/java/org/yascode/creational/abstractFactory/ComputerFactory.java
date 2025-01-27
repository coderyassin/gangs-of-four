package org.yascode.creational.abstractFactory;

public class ComputerFactory {
    public static Computer createComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
