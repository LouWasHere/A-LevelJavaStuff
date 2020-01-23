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
/**
 *
 * @author l-bishop
 */
public class ReversePolishSolver
{

    public static void main(String[] args) 
    {
        Stack<Character> s = new Stack();
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
        for (char c : inputString.toCharArray()) 
        {
            s.push(c);
        }
    }
    
}
