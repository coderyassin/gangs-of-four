package org.yascode.creational.builder.main;

import org.yascode.creational.builder.Computer;

public class MainApplication {

    public static void main(String[] args) {
        // computer is an immutable object
        Computer computer = Computer.builder("16 GB", "500 GB", "2.9 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
