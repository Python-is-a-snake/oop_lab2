package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mathAlgorithm implements algorithmImage {

    @Override
    public String typeOfAlgorithm() {
        return "math";
    }

    public void openImage(File file) throws IOException {
        Desktop dt = Desktop.getDesktop();
        dt.open(file);
    }


}
