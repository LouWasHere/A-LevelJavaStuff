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
public class CircularQueue 
{
    private static int[] intCircularQueue = new int[4];
    
    private int frontPointer = -1;
    
    private int endPointer = -1;
    
    private int currentSize = 0;
    
    public boolean isEmpty()
    {
        boolean empty = false;
        if((endPointer == -1 && frontPointer == -1))
        {
            empty = true;
        }
        return empty;
    } 
    
    public boolean isFull()
    {
        boolean full = false;
        if(frontPointer - endPointer == 1 || frontPointer - endPointer == -3)
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
                frontPointer = 0;
            }
            if(endPointer == -1 || endPointer == intCircularQueue.length -1)
            {
                endPointer = 0;
            }
            else
            {
                endPointer++;
            }
            intCircularQueue[endPointer] = value;
            currentSize++;
        }
    }
    
    public int peek()
    {
        return intCircularQueue[frontPointer];
    }
    
    public void remove()
    {
        intCircularQueue[frontPointer] = 0;
        if(frontPointer == intCircularQueue.length -1)
        {
           frontPointer = 0; 
        }
        else
        {
            frontPointer++;
        }
        currentSize--;
        if(intCircularQueue[frontPointer] == 0)
        {
            frontPointer = -1;
            endPointer = -1;
        }
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
    
    public int returnSize()
    {
        return currentSize;
    }
}
