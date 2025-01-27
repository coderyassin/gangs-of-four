package org.yascode.structural.proxy;

public class ImageProxy implements Image {
    private RealImage realImage;
    private String file;

    public ImageProxy(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(file);
        }
        realImage.display();
    }
}
