package org.yascode.structural.proxy;

public class RealImage implements Image{
    private String file;

    public RealImage(String file) {
        this.file = file;
        loadImage(file);
    }

    private void loadImage(String file) {
        System.out.println("Loading image: " + file);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + file);
    }
}
