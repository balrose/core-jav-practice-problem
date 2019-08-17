package com.semanticsquare.basics.oldprojects;


public class Factorial10 {


        public static double factorial(double n)
        {
          
        	
            if (n <=0) {
                return n+1;
            }
            for(int i=0;i<=n;i--);
            return factorial(n - 1)*n;
        }

        public static void main(String args[])
        {
            int n = 0;
            double d =n;
            System.out.println( factorial(d));
        }
}
