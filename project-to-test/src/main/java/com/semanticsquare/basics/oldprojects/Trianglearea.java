package com.semanticsquare.basics.oldprojects;

public class Trianglearea {
    public static void main(String[] args) {


    Trianglearea obj= new Trianglearea();
        System.out.println("Area of triangle is = " +obj.calculateArea(5,25));


}
    public double  calculateArea(float b, float h) {
         float area=0;
       return area+=( b*h)/2;

    }
}



    /* when data need to come from user
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double height = scanner.nextDouble();

        //Area = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}*/