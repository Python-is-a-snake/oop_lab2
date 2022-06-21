package com.company;

import java.util.Arrays;

public class doubleSort implements sort{

    public double[] array={0,0,0,0,0};

    @Override
    public double[] doubleToSort() {
        return array;
    }

    @Override
    public int[] intToSort() {
        return new int[0];
    }

    @Override
    public void sorting() {
        boolean isSorted = false;
        double buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
    }

    @Override
    public String sortedString() {
        return Arrays.toString(array);
    }
}
