/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversepolishsolver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import jdk.nashorn.internal.objects.NativeString;
/**
 *
 * @author l-bishop
 */
public class ReversePolishSolver
{

    public static void main(String[] args) 
    {
        Stack<String> s = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = null;
        System.out.println("Please enter the Reverse Polish Expression with NO SPACES!");
        try
        {
            inputString = br.readLine();
        }
        catch (IOException e)
        {
            System.err.println(e);
        }
        while(inputString.length()>0) 
        {
            int op1 = 0;
            int op2 = 0;
            if(inputString.substring(0, 1).equals("+") || inputString.substring(0, 1).equals("-") || inputString.substring(0, 1).equals("*") || inputString.substring(0, 1).equals("/"))
            {
                switch(inputString.substring(0, 1))
                {
                    case "+":
                        
                        break;
                    case "-":
                        
                        break;
                }
            }
            s.add(inputString.substring(0, 1));
            inputString = inputString.substring(1);
        }
        System.out.println(s);

    }
    
}
