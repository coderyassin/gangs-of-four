package org.yascode.structural.proxy.main;

import org.yascode.structural.proxy.Image;
import org.yascode.structural.proxy.ImageProxy;

public class MainApplication {

    public static void main(String[] args) {
        Image image = new ImageProxy("image.jpg");
        image.display();
    }
}
