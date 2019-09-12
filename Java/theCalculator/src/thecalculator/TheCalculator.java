package thecalculator;
import java.io.*;
import java.util.Scanner;
import java.lang.Math; 
import java.text.DecimalFormat;
public class TheCalculator 
{
    public static double addNumbers(double numberOne, double numberTwo)
    {
        return numberOne+numberTwo;
    }
    public static double minusNumbers(double numberOne, double numberTwo)
    {
        return numberOne-numberTwo;
    }
    public static double timesNumbers(double numberOne, double numberTwo)
    {
        return numberOne*numberTwo;
    }
    public static double divideNumbers(double numberOne, double numberTwo)
    {
        return numberOne/numberTwo;
    }
    public static double inputNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        boolean wenttocatch = false;
        double input = 0;
        do
            {
                System.out.print("Enter a number : ");
                if(scanner.hasNextInt())
                {
                    input = scanner.nextDouble();
                    wenttocatch = true;
                }
                else
                {
                    scanner.nextLine();
                    System.out.println("Enter a valid numerical value");
                }
            }while(!wenttocatch);
        return input;
    }
    public static void main(String[] args) 
    {
        boolean loop = true;
        double answer = 0;
        while(loop == true)
        {
            System.out.println("Please enter the first number.");
            DecimalFormat format = new DecimalFormat("##.00");
            double firstNumber = inputNumbers();
            System.out.println("Please enter the second number.");
            double secondNumber = inputNumbers();
            System.out.println("Please enter the function (+, -, * or /).");
            Scanner scanner = new Scanner(System.in);
            char character = scanner.next().charAt(0);
            switch (character) {
                case '+':
                    answer = addNumbers(firstNumber, secondNumber);
                    loop = false;
                    break;
                case '-':
                    answer = minusNumbers(firstNumber, secondNumber);
                    loop = false;
                    break;
                case '*':
                    answer = timesNumbers(firstNumber, secondNumber);
                    loop = false;
                    break;
                case '/':
                    answer = divideNumbers(firstNumber, secondNumber);
                    loop = false;
                    break;
                default:
                    System.out.println("You absolute nitwit, how could you mess this up?");
                    break;
            }
        }
        answer = (Math.round(answer * 100.0)/100.0);
        System.out.println("The answer is " + answer);
    }
}