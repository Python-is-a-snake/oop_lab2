package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static com.company.loadImages.*;

public class SymbolButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton one;
    JButton two;
    JButton three;

    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        onClick();
        panel.add(one);
        panel.add(two);
        panel.add(three);
        frame.setSize(200, 150);
        frame.setVisible(true);
        onClick();
    }

    public void onClick() {
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");

        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (choise == 1) {
                    algorithmImage m;
                    m = openMath();
                    File f = new File("src/com/algorithm/math/1.jpg");
                    try {
                        m.openImage(f);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                else if(choise==2){
                    algorithmImage g;
                    g = openGraph();
                    File f = new File("src/com/algorithm/graph/1.jpg");
                    try {
                        g.openImage(f);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (choise == 1) {
                    algorithmImage m;
                    m = openMath();
                    File f = new File("src/com/algorithm/math/2.jpg");
                    try {
                        m.openImage(f);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                else if(choise==2){
                    algorithmImage g;
                    g = openGraph();
                    File f = new File("src/com/algorithm/graph/2.jpg");
                    try {
                        g.openImage(f);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (choise == 1) {
                    algorithmImage m;
                    m = openMath();
                    File f = new File("src/com/algorithm/math/3.jpg");
                    try {
                        m.openImage(f);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                else if(choise==2){
                    algorithmImage g;
                    g = openGraph();
                    File f = new File("src/com/algorithm/graph/3.jpg");
                    try {
                        g.openImage(f);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

    }
}