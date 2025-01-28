package org.yascode.creational.prototype.main;

import org.yascode.creational.prototype.Shape;
import org.yascode.creational.prototype.ShapeCache;

public class MainApplication {

    public static void main(String[] args) {
        // Load the cache with initial prototypes
        ShapeCache.loadCache();

        // Get a Circle prototype and use it
        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedCircle.getType());
        clonedCircle.draw();

        // Get a Rectangle prototype and use it
        Shape clonedRectangle = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedRectangle.getType());
        clonedRectangle.draw();
    }
}
