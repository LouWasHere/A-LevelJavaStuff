/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dw
 */
public class vectorJUnitTest {          
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void add() 
    {
        assertTrue("add(new Vector(6,9), new Vector(7,3))", IVector.add(new Vector(6,9), new Vector(7,3)).compareTo(new Vector(13.0, 12.0)) == 0);   
    }
    
    @Test
    public void multiply() 
    {
        assertTrue("multiply(5, new Vector(6,9))", IVector.multiply(5, new Vector(6,9)).compareTo(new Vector(30.0, 45.0)) == 0);        
    }
    
    @Test
    public void dotProduct() 
    {
        assertTrue("dotProduct(new Vector(6,9), new Vector(7,3))", IVector.dotProduct(new Vector(6,9), new Vector(7,3)) == 69);         
    }
    
    @Test
    public void convexCombination() 
    {
        assertTrue("convexCombination(0.4, new Vector(6,9), 0.6 ,new Vector(7,3))", IVector.convexCombination(0.4, new Vector(6,9), 0.6 ,new Vector(7,3)).compareTo(new Vector(6.6, 5.4)) == 0);  
    }
}
