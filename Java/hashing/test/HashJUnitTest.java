/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hashing.Hashing;
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
public class HashJUnitTest {
    
    public HashJUnitTest() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Add54() 
    {
        Hashing hashing = new Hashing();
        hashing.Add(54, "Bill");
        assertTrue("Add 54", hashing.Get(54) == "Bill");    
    }
}
