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
        
        System.out.println("\n");
        
        LinearQueue linearQueue = new LinearQueue();
        System.out.println(linearQueue.isEmpty());
        linearQueue.add(1);
        linearQueue.add(2);
        System.out.println(linearQueue.isEmpty());
        linearQueue.add(3);
        linearQueue.remove();
        linearQueue.add(4);
        System.out.println(linearQueue.isFull());
        linearQueue.add(5);
        System.out.println(linearQueue.isFull());
        linearQueue.remove();
        linearQueue.remove();
        linearQueue.remove();
        System.out.println(linearQueue.isEmpty());
        
        
    }
    
}
