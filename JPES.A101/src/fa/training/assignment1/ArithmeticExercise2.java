package fa.training.assignment1;

import java.util.Scanner; //import class Scanner

public class ArithmeticExercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Create Scanner class to obtain number input

        System.out.print("Input first number: ");
        int firstNum = scanner.nextInt(); //obtain first number
        System.out.print("Input second number: ");
        int secondNum = scanner.nextInt(); //obtain second number

        //Math Calculation
        int addition = firstNum + secondNum;
        System.out.println(firstNum +" + "+ secondNum + " = "+ addition);

        int subtraction = firstNum - secondNum;
        System.out.println(firstNum +" - "+ secondNum + " = "+ subtraction);

        int multiplication = firstNum * secondNum;
        System.out.println(firstNum +" * "+ secondNum + " = "+ multiplication);

        int division = firstNum / secondNum;
        System.out.println(firstNum +" / "+ secondNum + " = "+ division);

        int residual = firstNum % secondNum;
        System.out.println(firstNum +" % "+ secondNum + " = "+ residual);
    }
}
