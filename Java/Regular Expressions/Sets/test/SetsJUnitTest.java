/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sets.SubSet;

/**
 *
 * @author l-bishop
 */
public class SetsJUnitTest {
    
    public SetsJUnitTest() {
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
    public void union()
    {
        SubSet expectedResult = new SubSet(); 
        expectedResult.addAll( new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10) ));
        SubSet ss = new SubSet(); 
        ss.addAll( new ArrayList<Integer>(Arrays.asList(0,1,3,5,7,9) ));
        SubSet ss2 = new SubSet(); 
        ss2.addAll( new ArrayList<Integer>(Arrays.asList(0,2,4,6,8,10) ));
        assertEquals(ss.union(ss2),expectedResult);
    }
    
    public void intersection()
    {
        SubSet expectedResult = new SubSet(); 
        expectedResult.addAll( new ArrayList<Integer>(Arrays.asList(1, 3) ));
        SubSet ss = new SubSet(); 
        ss.addAll( new ArrayList<Integer>(Arrays.asList(1, 3, 5 ,7 ,9) ));
        SubSet ss2 = new SubSet(); 
        ss2.addAll( new ArrayList<Integer>(Arrays.asList(1, 3, 4,  6 , 8) ));
        assertEquals(ss.intersection(ss2),expectedResult);
    }
    
    public void difference()
    {
        SubSet expectedResult = new SubSet(); 
        expectedResult.addAll( new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 10) ));
        SubSet ss = new SubSet(); 
        ss.addAll( new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8) ));
        SubSet ss2 = new SubSet(); 
        ss2.addAll( new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10) ));
        assertEquals(ss.difference(ss2),expectedResult);
    }
    
    public void isSubSet()
    {
        boolean expectedResult = true;
        SubSet ss = new SubSet(); 
        ss.addAll( new ArrayList<Integer>(Arrays.asList(0,1,3,5,7,9) ));
        SubSet ss2 = new SubSet(); 
        ss2.addAll( new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10) ));
        assertEquals(ss.isSubSet(ss2),expectedResult);
    }
    
    public void isEmpty()
    {
        boolean expectedResult = false;
        SubSet ss = new SubSet(); 
        ss.addAll( new ArrayList<Integer>(Arrays.asList(0,1,3,5,7,9) ));
        assertEquals(ss.isEmpty(),expectedResult);
    }
    
    public void cardinality()
    {
        int expectedResult = 6;
        SubSet ss = new SubSet(); 
        ss.addAll( new ArrayList<Integer>(Arrays.asList(0, 1, 3, 5 ,7 ,9) ));
        assertEquals(ss.Cardinality(),expectedResult);
    }
}
