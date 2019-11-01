/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues;

/**
 *
 * @author l-bishop
 */
public class LinearQueue 
{
    private static int[] intLinearQueue = new int[4];
    
    private int frontPointer = -1;
    
    private int endPointer = -1;
    
    public boolean isEmpty()
    {
        boolean empty = false;
        if(frontPointer == -1 && endPointer == -1)
        {
            empty = true;
        }
        return empty;
    }
    
    public boolean isFull()
    {
        boolean full = false;
        if(endPointer == 3)
        {
            full = true;
        }
        return full;
    }
    
    public void add(int value)
    {
        if(isFull())
        {
            System.out.println("Lol it's full my guy.");
        }
        else
        {
            if(frontPointer == -1)
            {
                frontPointer++;
            }
            endPointer++;
            intLinearQueue[endPointer] = value;
        }
    }
    
    public int peek()
    {
        return intLinearQueue[frontPointer];
    }
    
    public int remove()
    {
        int poppedValue = intLinearQueue[frontPointer];
        intLinearQueue[frontPointer] = 0;
        frontPointer+=1;
        return poppedValue;
    }
}
