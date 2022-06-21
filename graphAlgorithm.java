package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class graphAlgorithm implements algorithmImage{

    @Override
    public String typeOfAlgorithm() {
        return "graph";
    }

    @Override
    public void openImage(File file) throws IOException {
        Desktop dt = Desktop.getDesktop();
        dt.open(file);
    }
}
