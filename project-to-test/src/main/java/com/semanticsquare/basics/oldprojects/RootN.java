package com.semanticsquare.basics.oldprojects;

public class RootN {


        public static void main(String[] args) {
            System.out.println(calculate(25,2));

        }


        public static double calculate(int base, int n) {
            return Math.pow(base, 1.0/n);
        }
}




