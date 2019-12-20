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
        State s0 = new State("s0", null, null, null);
        State s1 = new State("s1", null, null, null);
        State s2 = new State("s2", null, null, null);
        State s3 = new State("s3", null, null, null);
        State s4 = new State("s4", null, null, null);
        
        s0 = new State("s0", s1, s4, s4);
        s1 = new State("s1", s4, s2, s4);
        s2 = new State("s2", s4, s1, s3);
        s3 = new State("s3", s4, s4, s3);
        s4 = new State("s4", s4, s4, s4);
        
        State current = s0;
        State next;
        String inputString = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean accepted = false;
        
        while(accepted == false)
        {
            
            System.out.println("Enter a, b or c.");
            System.out.println("Current State: " + current.name());
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
                    next = current.desA();
                    current = next;
                    break;
                case "b":
                    next = current.desB();
                    current = next;
                    break;
                case "c":
                    next = current.desC();
                    current = next;
                    break;
            }
            
        }
        
    }
    
}
