/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finitestatemachine;

import java.io.*;

public class FiniteStateMachine 
{

    public static void main(String[] args) 
    {
        State s0 = new State(null, null, null);
        State s1 = new State(null, null, null);
        State s2 = new State(null, null, null);
        State s3 = new State(null, null, null);
        State s4 = new State(null, null, null);
        
        s0 = new State(s1, s4, s4);
        s1 = new State(s4, s2, s4);
        s2 = new State(s4, s1, s3);
        s3 = new State(s4, s4, s3);
        s4 = new State(s4, s4, s4);
        
        State current = s0;
        State next;
        String inputString = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean accepted = false;
        
        while(accepted = false)
        {
            
            System.out.println("Enter a, b or c.");
            try
            {
                inputString = br.readLine();
            }
            catch (IOException e)
            {
                System.err.println(e);
            }
            switch(inputString)
            {
                case "a":
                    next = current.desA;
                case "b":
                    next = current.desB;
                case "c":
                    next = current.desC;
            }
        }
        
    }
    
}
