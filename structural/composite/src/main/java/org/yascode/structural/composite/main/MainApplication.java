package org.yascode.structural.composite.main;

import org.yascode.structural.composite.Directory;
import org.yascode.structural.composite.File;

public class MainApplication {

    public static void main(String[] args) {
        File file1 = new File("photo1.jpg", 1500);
        File file2 = new File("document.pdf", 2000);
        File file3 = new File("video.mp4", 5000);

        Directory images = new Directory("Images");
        images.add(file1);

        Directory docs = new Directory("Documents");
        docs.add(file2);

        Directory root = new Directory("Root");
        root.add(images);
        root.add(docs);
        root.add(file3);

        System.out.println("File System Details:");
        root.showDetails();

        System.out.println("\nTotal Size: " + root.getSize() + " bytes");
    }
}
