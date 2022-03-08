package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {
    public static void main(String[] args) {
        //Create class Scanner to take number from input
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Input first integer: ");
        num1 = input.nextInt(); //obtain first number

        System.out.print("Input second integer: ");
        num2 = input.nextInt(); //obtain second number
        //Compare 2 number
        if ( num1 == num2 )
            System.out.printf( "%d == %d\n", num1, num2 );
        if ( num1 != num2 )
            System.out.printf( "%d != %d\n", num1, num2 );
        if ( num1 < num2 )
            System.out.printf( "%d < %d\n", num1, num2 );
        if ( num1 > num2 )
            System.out.printf( "%d > %d\n", num1, num2 );
        if ( num1 <= num2 )
            System.out.printf( "%d <= %d\n", num1, num2 );
        if ( num1 >= num2 )
            System.out.printf( "%d >= %d\n", num1, num2 );
    }
}
