/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finitestatemachine;

import java.util.*;
 
public class FiniteStateMachines
{
 
    private enum State
    {
        State(String... in) 
        {
            inputs = Arrays.asList(in);
            explicit = true;
        }
        
        State s0 = new State("a", "b", "c");
        State nextState(String input, State current) 
        {
            if (inputs.contains(input)) 
            {
                switch(input)
                {
                    case "a":
                        return current.adest;
                    case "b":
                        return current.bdest;
                    case "c":
                        return current.cdest;
                }
            }
            else
            {
                return current;
            }
        }
        final List<String> inputs;
        final static Map<String, State> map = new HashMap<>();
        final boolean explicit;
    }
 
    public static void main(String[] args) 
    {
        while(true)
        {
        Scanner sc = new Scanner(System.in);
        State state = State.s0;
 
            System.out.println(state.inputs);
            System.out.print("> ");
            state = state.nextState(sc.nextLine().trim(), state);
        }
    }
}