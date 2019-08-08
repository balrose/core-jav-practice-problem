package com.semanticsquare.basics.oldprojects;

public class Quadraticequation {
    public Quadraticequation() {
        super();
    }

    static void findRoots(double a, double b, int c){

            double d = b*b - 4*a*c;

            double root_1 = (-b + Math.sqrt(d))/(2*a);
            double root_2 = (-b - Math.sqrt(d))/(2*a);

            System.out.println("Roots are: (" + root_1 + ", " + root_2);
        }

        public static void main(String[] args) {
            int a = 3;
            int b = -5;
            int c = -6;
            findRoots(a, b, c);
        }
    }


















//first find Discriminant d = b*b - 4ac
 // 12. System.out.printf("Quadratic Equation: %+d x^2 %+dx %+d = 0 " +a ,b,c );// this line is just decolatation