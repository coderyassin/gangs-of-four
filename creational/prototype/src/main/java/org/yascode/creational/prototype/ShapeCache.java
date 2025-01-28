package org.yascode.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    // Load initial prototypes into the cache
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }

    // Retrieve a clone of the shape
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return cachedShape.clone();
    }
}
