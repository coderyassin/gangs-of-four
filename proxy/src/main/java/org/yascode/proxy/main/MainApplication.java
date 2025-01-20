package org.yascode.proxy.main;

import org.yascode.proxy.Image;
import org.yascode.proxy.ImageProxy;

public class MainApplication {

    public static void main(String[] args) {
        Image image = new ImageProxy("image.jpg");
        image.display();
    }
}
