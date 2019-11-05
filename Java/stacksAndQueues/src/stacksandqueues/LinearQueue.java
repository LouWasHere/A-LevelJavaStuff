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
    
    private int currentSize = 0;
    
    public boolean isEmpty()
    {
        if(currentSize == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isFull()
    {
        if(currentSize == intLinearQueue.length || frontPointer == 4)
        {
            return true;
        }
        else
        {
            return false;
        }
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
            currentSize++;
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
    
    public int pointerValue(String pointer)
    {
        if(pointer.equals("front"))
        {
            return frontPointer;
        }
        if(pointer.equals("end"))
        {
            return endPointer;
        }
        else
        {
            return 0;
        }
    }
}
