package com.semanticsquare.basics.oldprojects;

public class Gcd {
    public static void main(String[] args) {

        Gcd obj= new Gcd();
        System.out.println("GCD of two numbers is :"+obj.calculateGcd(7,55));

    }

    public int calculateGcd(int n1 , int n2 ){
       int gcd=0;
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        return  gcd;
    }

}


