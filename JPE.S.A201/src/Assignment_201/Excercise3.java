package Assignment_201;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create scanner class to obtain number input

        System.out.print("Input first number: ");
        int num1    = scanner.nextInt(); //obtain first number
        System.out.print("Input second number: ");
        int num2   = scanner.nextInt(); //obtain second number
        System.out.print("Input third number: ");
        int num3   = scanner.nextInt(); //obtain third number
        System.out.print("Input fourth number: ");
        int num4   = scanner.nextInt(); //obtain fourth number
        System.out.print("Input fifth number: ");
        int num5   = scanner.nextInt(); //obtain fourth number

        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum is "+ sum);

    }
}