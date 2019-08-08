package com.semanticsquare.basics.oldprojects;

import java.util.Scanner;

public class PrintName {


    public static void main(String args[]) {
        System.out.print("print your name : ");
        Scanner name = new Scanner(System.in);
        System.out.println("Hello " + name.nextLine());
        name.close();
    }
}