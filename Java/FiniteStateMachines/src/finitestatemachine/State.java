/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finitestatemachine;

import java.util.Arrays;

/**
 *
 * @author l-bishop
 */
public class State 
{
    State(String... in) 
        {
            inputs = Arrays.asList(in);
            explicit = true;
        }
    public void nextState(String input, FiniteStateMachines.State current) 
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
}
