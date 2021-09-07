package com.javadsa;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 12.33811f;
        //here we used placeholder "%". and "%.1f" represents that rounf of the float value to 1 digit
        System.out.printf("%.1f", a);
        System.out.println();
        System.out.println("pie normal: " + Math.PI);
        System.out.printf("pie formatted: %.3f " , Math.PI);
    }
}
