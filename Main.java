package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static com.company.configureButtons.configureButtons;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("Ви бажаєте дізнатись про алгоритми,чи про сортування ?");
        System.out.println("Напишіть 1 для алгоритмів,2 для сортування");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        if (choose == 1) {
            //factory pattern
            configureButtons();
            //Facade pattern
            new loadImages();
            loadImages.loadImages();
        }
        else if(choose==2){
            //Iterator and state pattern
new sorter();
sorter.sorter();
        }
    }
}
