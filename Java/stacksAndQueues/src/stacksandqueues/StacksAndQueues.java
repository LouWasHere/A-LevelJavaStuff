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
public class StacksAndQueues 
{

    public static void main(String[] args) 
    {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek()+" is at the top of the stack.");
        stack.push(3);
        System.out.println(stack.isFull());
        System.out.println(stack.pop()+" has been popped from the stack.");
        
    }
    
}
