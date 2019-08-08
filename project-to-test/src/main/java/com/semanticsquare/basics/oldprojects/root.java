package com.semanticsquare.basics.oldprojects;

public class root {
    public static void main(String[] args) {
        root obj= new root();
        System.out.println(obj.calculate(25,2));


    }
        public double calculate(int base, int n) {
            return Math.pow(base, 1.0/n);
        }
    }


