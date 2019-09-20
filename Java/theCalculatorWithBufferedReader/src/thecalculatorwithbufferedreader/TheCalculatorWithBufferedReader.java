package thecalculatorwithbufferedreader;
import java.io.*;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;   
public class TheCalculatorWithBufferedReader 
{
    public static boolean isNumeric(String strNum) 
    {
        try 
        {
            double d = Double.parseDouble(strNum);
        } 
        catch (NumberFormatException | NullPointerException nfe)
        {
            return false;
        }
        return true;
    }
    
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
        double answer = 0;
        try
        {
            answer = numberOne/numberTwo;
        }
        catch (Exception e)
        {
            System.out.println("You dingus, you tried to divide by zero or something, didn't you.");
        }
        return answer;
    }
    
    public static double inputNumbers()
    {
        boolean isNumeric = true;
        String inputString = null;
        double inputDouble;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(isNumeric == false)
        {
            try
            {
                System.out.println("Please enter a valid interger.");
                inputString = br.readLine();
            }
            catch (IOException e)
            {
                System.out.println("Error: " + e);
            }
            if(isNumeric(inputString) == false)
            {
                System.out.println("Doofus. That wasn't a number, was it?");
            }
            else
            {
                isNumeric = true;
            }
        }
        inputDouble = Double.parseDouble(inputString);
        return inputDouble;
    }
    
    public static void main(String[] args) throws IOException 
    {
        boolean loop = true;
        double answer = 0;
        while(loop == true)
        {
            //User sets the numeric variables, calling the inputNumbers() function.
            System.out.println("Please enter the first number.");
            double firstNumber = inputNumbers();
            System.out.println("Please enter the second number.");
            double secondNumber = inputNumbers();
            System.out.println("Please enter the function (+, -, * or /).");
            //User sets the function of the calculator.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            char character = (char)br.read();
            switch (character) 
            {
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
        System.out.println("The answer is " + answer);
    }
}