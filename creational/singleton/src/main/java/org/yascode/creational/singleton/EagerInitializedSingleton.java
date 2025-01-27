package org.yascode.creational.singleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        System.out.println("EagerInitializedSingleton created");
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
