package Assignment_201;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Excercise4 {
    public static void main(String[] args){
        Scanner scanner     = new Scanner(System.in);
        System.out.print("Input Radius: ");
        double radius       = scanner.nextDouble();
        System.out.print("Input Height: ");
        double height       = scanner.nextDouble();
        double surfaceArea  = 2*PI*radius*(radius + height);    //Dien tich toan phan
        double baseArea     = PI*radius*radius;                 //Dien tich day
        double volume       = PI*radius*radius*height;          //The tich

        System.out.println("Surface area = "  + surfaceArea);
        System.out.println("Base area = "     + baseArea);
        System.out.println("Volume = "        + volume);
    }
}