package org.yascode.creational.prototype;

public class Circle extends Shape {

    public Circle() {
        this.setType("Circle");
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
        System.out.println("Circle: id = " + this.getId() + ", type = " + this.getType());
    }
}
