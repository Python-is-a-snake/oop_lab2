package com.company;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.Channel;
import java.util.Scanner;

public class loadImages {
    public static int choise;

    static void loadImages() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("please choose type of algorithm:1-math,2-graph");
        algorithmImage g = null;
        algorithmImage m = null;
        choise = in.nextInt();
        if (choise == 2) {
            g = openGraph();
            File f = new File("src/com/algorithm/graph/1.jpg");
            g.openImage(f);
        } else if (choise == 1) {
            m = openMath();
            File f = new File("src/com/algorithm/math/1.jpg");
            m.openImage(f);
        }
    }

    static algorithmImage openGraph() {
        algorithmImage okGraph = ImageFromGraph();
        String path = okGraph.typeOfAlgorithm();
        System.out.println(path);
        return okGraph;
    }

    static algorithmImage openMath() {
        algorithmImage okMath = ImageFromMath();
        String path = okMath.typeOfAlgorithm();
        System.out.println(path);
        return okMath;
    }


    static algorithmImage ImageFromGraph() {
        return new graphAlgorithm();
    }

    static algorithmImage ImageFromMath() {
        return new mathAlgorithm();
    }


}
