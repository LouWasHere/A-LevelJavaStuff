package decomposition;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class DecompositionJUnitTest {
    
    public DecompositionJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void constructor() {
        Decomposition decomposition = new Decomposition("Head");     
        assertEquals(decomposition.bodyPart(),"Head");   
    }
    
    @Test
    public void validBodyPart() {
        Decomposition decomposition = new Decomposition("Head");     
        assertEquals(decomposition.isValidBodyPart("Head"),true);   
    }
    
     @Test
    public void invalidBodyPart() {
        Decomposition decomposition = new Decomposition("Eye");     
        assertEquals(decomposition.isValidBodyPart("Eye"),false);   
    }
}
