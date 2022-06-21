package com.company;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public interface algorithmImage {
    String typeOfAlgorithm();

    void openImage(File file) throws IOException;
}
