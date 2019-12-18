/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finitestatemachine;

class State 
{
    State desA;
    State desB;
    State desC;
    
    public State(State destinationA, State destinationB, State destinationC)
    {
        desA = destinationA;
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
}
