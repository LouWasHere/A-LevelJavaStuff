/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

/**
 *
 * @author dw
 */
public class Vectors {      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println(IVector.add(new Vector(6,9), new Vector(7,3)).x());
        System.out.println(IVector.add(new Vector(6,9), new Vector(7,3)).y());

    }    
}
