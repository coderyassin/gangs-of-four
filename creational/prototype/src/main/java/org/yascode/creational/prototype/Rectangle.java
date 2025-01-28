package org.yascode.creational.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        this.setType("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
        System.out.println("Rectangle: id = " + this.getId() + ", type = " + this.getType());
    }
}
