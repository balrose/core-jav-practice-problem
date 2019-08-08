package com.semanticsquare.basics.oldprojects;

import java.util.Random;

public class Random_Number6 {
    public static void main(String[] args) {
        Random_Number6 obj = new Random_Number6();
        obj.Randomnum();
    }

    public void Randomnum() {
        int sum=0;
        Random rd = new Random(); // creating Random object
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10); // storing random integers in an array
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]); // printing each array element
                sum+=sum+i;
            }

        }
        System.out.println("sum= " + sum);
    }
}

