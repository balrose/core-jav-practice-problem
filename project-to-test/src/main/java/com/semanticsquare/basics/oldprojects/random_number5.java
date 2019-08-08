package com.semanticsquare.basics.oldprojects;

import java.util.Random;

public class random_number5 {
    public static void main(String[] args) {
        random_number5 obj = new random_number5();
        obj.Randomnum1();

    }

    public void Randomnum1() {
        int sum = 0;
        Random rd = new Random(); // creating Random object
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10); // storing random integers in an array

            System.out.println(arr[i]); // printing each array element
            sum = sum +arr [i];
        }

        System.out.println("sum= " + sum);
    }
}



