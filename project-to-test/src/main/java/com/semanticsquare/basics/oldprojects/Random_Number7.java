package com.semanticsquare.basics.oldprojects;

import java.util.Random;

public class Random_Number7 {

    public int Randomnum() {
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {

            int randomNum = rand.nextInt(100);// bound give capability to define the range
            if ((randomNum % 2 != 0) && (i % 2 != 0)) {

                sum += randomNum;
                System.out.println(randomNum);

            } else if ((randomNum % 2 == 0) && (i % 2 == 0)) {

                sum += randomNum;
                System.out.println(randomNum);

            }

        }
            System.out.println("sum is:" + sum);
            return sum;
        }


        public static void main (String[]args){
            Random_Number7 obj = new Random_Number7();
            System.out.println(obj.Randomnum());

        }
    }


