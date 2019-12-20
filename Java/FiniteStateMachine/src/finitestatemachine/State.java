/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finitestatemachine;

class State 
{
    private State desA;
    private State desB;
    private State desC;
    private String name;
    
    public State(String name, State destinationA, State destinationB, State destinationC)
    {
        desA = destinationA;
        desB = destinationB;
        desC = destinationC;
        this.name = name;
    }
    
    public State desA()
    {
        return desA;
    }
    public State desB()
    {
        return desB;
    }
    public State desC()
    {
        return desC;
    }
    public String name()
    {
        return name;
    }
}
