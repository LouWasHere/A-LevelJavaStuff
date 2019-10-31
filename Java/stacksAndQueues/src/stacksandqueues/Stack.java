/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues;

import java.util.ArrayList;

public class Stack 
{
    private static int[] intStack = new int[3];
    
    private int pointer = -1;
    
    public boolean isEmpty()
    {
        boolean empty = false;
        if(pointer == -1)
        {
            empty = true;
        }
        return empty;
    }
    
    public boolean isFull()
    {
        boolean full = false;
        if(pointer == 2)
        {
            full = true;
        }
        return full;
    }
    
    public void push(int value)
    {
        pointer+=1;
        intStack[pointer] = value;
    }
    
    public int peek()
    {
        return intStack[pointer];
    }
    
    public int pop()
    {
        int poppedValue = intStack[pointer];
        intStack[pointer] = 0;
        pointer-=1;
        return poppedValue;
    }
    
}
