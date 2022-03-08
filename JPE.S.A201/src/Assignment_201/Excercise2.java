package Assignment_201;

import java.util.Scanner; //import class scanner

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create scanner class to obtain number input

        System.out.print("Input first number: ");
        int firstNum    = scanner.nextInt(); //obtain first number
        System.out.print("Input second number: ");
        int secondNum   = scanner.nextInt(); //obtain second number
        System.out.print("Input third number: ");
        int thirdNum   = scanner.nextInt(); //obtain third number
        System.out.print("Input fourth number: ");
        int fourthNum   = scanner.nextInt(); //obtain fourth number
        if(firstNum == secondNum && secondNum == thirdNum && thirdNum == fourthNum)
        {
            System.out.println("Numbers are equal");
        }
        else
        {
            System.out.println("Numbers are not equal!");
        }
    }
}