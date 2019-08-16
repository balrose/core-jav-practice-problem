package com.semanticsquare.basics.oldprojects;

public class PrimeNumber {
    public static void main(String[] args) {
        int  m;
        m=55;
        boolean b = isPrime(m);
        System.out.println(b);

    }
    public static boolean isPrime(int num){

        if ( num > 2 && num%2 == 0 ) {
            System.out.println(num+ " : is not prime");
            return false;
        }

        int  top = (int)Math.sqrt(num) + 1; //remember the algorithm was i <= sqrt(number)
        for(int i = 3; i < top; i+=2){


            if(num % i == 0){
                System.out.println(num + " : is not prime");
                return false;
            }
        }
        System.out.println(num +" : is a prime number ");
        return true;
    }
}


