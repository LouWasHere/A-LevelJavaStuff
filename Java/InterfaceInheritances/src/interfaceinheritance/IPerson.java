/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceinheritance;

/**
 *
 * @author dw
 */
public interface IPerson {
    String Name();
    int Age();
                
    default String Gender()
    {
        return "Male";
    }    
}
