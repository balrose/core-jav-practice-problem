package com.semanticsquare.basics.oldprojects;

import java.util.Scanner;

public class Odd_Even {

        public static void main(String[] args) {
            detemine();
        }

        public static int detemine() {
            int n;
            Scanner S= new Scanner(System.in);
            System.out.print("Enter number n: ");
             n= S.nextInt();

                if (n % 2 == 0) {
                    System.out.println("This nuber is even");
                } else {
                    System.out.println("This number is odd");
                }

                S.close();
            return n;
        }
        }
/*
public class Odd_Even {

        public static void main(String[] args) {
            detemine(6);
        }

        public static int detemine( int n) {

          //  Scanner S= new Scanner(System.in);
            //System.out.print("Enter number n: ");
            // n= S.nextInt();

                if (n % 2 == 0) {
                    System.out.println("This number is even");
                } else {
                    System.out.println("This number is odd");
                }


            return n;
        }
        }
*/

