package com.harsh.Basic;

import java.util.Scanner;

// Volume Of Prism
public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base length: ");
        double bl = sc.nextDouble();
        System.out.println("Enter base breadth: ");
        double bb = sc.nextDouble();
        System.out.println("Enter the prism height");
        double h = sc.nextDouble();

        System.out.println("Volume: "+(bl*bb)*h);
    }
}
