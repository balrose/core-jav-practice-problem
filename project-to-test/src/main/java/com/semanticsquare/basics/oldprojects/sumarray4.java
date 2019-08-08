package com.semanticsquare.basics.oldprojects;
public class sumarray4 {

    public static void main (String[] args)
    {
        int arr[] = {1010, 20, 30, 40, 50};

        sum(arr);
    }
    public static void sum(int[] arr)
    {
        int sum1=0;

        for(int i=0; i<arr.length; i++) {
            sum1 += arr[i];
        }
        System.out.println(sum1);
    }



}
