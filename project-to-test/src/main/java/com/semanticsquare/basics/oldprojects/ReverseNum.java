package com.semanticsquare.basics.oldprojects;

public class ReverseNum {
    public static void main(String[] args) {

        ReverseNum obj = new ReverseNum();
        System.out.println("Reversed Number: "+obj.reverse(456)); // problem is well completelly fine without zero at the end
    }

    public int reverse( int num1){
            int  reversed = 0;
            while(num1 != 0) {
                int digit = num1 % 10;
                reversed = reversed * 10 + digit;
                num1 /= 10;
            }

        return reversed;
    }


}
