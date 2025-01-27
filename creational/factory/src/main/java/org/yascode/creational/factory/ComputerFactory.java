package org.yascode.creational.factory;

public class ComputerFactory {
    public static Computer createComputer(String type, String ram, String hdd, String cpu) {
        return switch(type) {
            case "PC" -> new PC(ram, hdd, cpu);
            case "Server" -> new Server(ram, hdd, cpu);
            default -> null;
        };
    }
}
