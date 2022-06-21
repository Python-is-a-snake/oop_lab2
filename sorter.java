package com.company;

import java.util.Scanner;

public class sorter {
   public static int ch;
    public static void sorter(){
        Scanner in = new Scanner(System.in);
        System.out.println("please choose type of data:1-double,2-int");
        ch = in.nextInt();
        if(ch==1){
        doubleSort d=new doubleSort();
        System.out.println("please write down 5 double numbers");
        for(int i=0;i<5;i++){
            d.array[i]=in.nextDouble();
        }
        d.sorting();
        String res= d.sortedString();
        System.out.println("result"+res);
        }
        else if(ch==2){
            intSort d=new intSort();
            System.out.println("please write down 5 double numbers");
            for(int i=0;i<5;i++){
                d.array[i]=in.nextInt();
            }
            d.sorting();
            String res= d.sortedString();
            System.out.println("result"+res);
    }
}}
