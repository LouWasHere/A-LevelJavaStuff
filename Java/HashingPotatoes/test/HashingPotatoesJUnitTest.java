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
import hashingpotatoes.HashingPotatoes;

/**
 *
 * @author l-bishop
 */
public class HashingPotatoesJUnitTest 
{
    
    HashingPotatoes hash;
    
    public HashingPotatoesJUnitTest() 
    {
        hash = new HashingPotatoes();
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        
    }
    
    @Before
    public void setUp() 
    {
        
    }
    
    @After
    public void tearDown() 
    {
        
    }

    @Test
    public void setValues()
    {
        hash.setValues(78,55,34,19,29);
        assertTrue(hash.returnValues(0) == 78);
        assertTrue(hash.returnValues(1) == 55);
        assertTrue(hash.returnValues(2) == 34);
        assertTrue(hash.returnValues(3) == 19);
        assertTrue(hash.returnValues(4) == 29);
    }
    
    @Test
    public void encodeAndStore()
    {
        hash.setValues(78,55,34,19,29);
        assertTrue(hash.returnValues(0) == 78);
        assertTrue(hash.returnValues(1) == 55);
        assertTrue(hash.returnValues(2) == 34);
        assertTrue(hash.returnValues(3) == 19);
        assertTrue(hash.returnValues(4) == 29);
        hash.encodeAndStore();
        assertTrue(hash.returnEncodedValues(0) == 1);
        assertTrue(hash.returnEncodedValues(1) == 0);
        assertTrue(hash.returnEncodedValues(2) == 1);
        assertTrue(hash.returnEncodedValues(3) == 8);
        assertTrue(hash.returnEncodedValues(4) == 7);
    }
    
    @Test
    public void setEverythingIntoHashTable()
    {
        hash.setValues(78,55,34,19,29);
        assertTrue(hash.returnValues(0) == 78);
        assertTrue(hash.returnValues(1) == 55);
        assertTrue(hash.returnValues(2) == 34);
        assertTrue(hash.returnValues(3) == 19);
        assertTrue(hash.returnValues(4) == 29);
        hash.encodeAndStore();
        assertTrue(hash.returnEncodedValues(0) == 1);
        assertTrue(hash.returnEncodedValues(1) == 0);
        assertTrue(hash.returnEncodedValues(2) == 1);
        assertTrue(hash.returnEncodedValues(3) == 8);
        assertTrue(hash.returnEncodedValues(4) == 7);
        hash.setEverythingIntoHashTable();
        assertTrue(hash.returnHashTable(0).size() == 1);
        assertTrue(hash.returnHashTable(1).size() == 2);
        assertTrue(hash.returnHashTable(2).isEmpty());
        assertTrue(hash.returnHashTable(3).isEmpty());
        assertTrue(hash.returnHashTable(4).isEmpty());
        assertTrue(hash.returnHashTable(5).isEmpty());
        assertTrue(hash.returnHashTable(6).isEmpty());
        assertTrue(hash.returnHashTable(7).size() == 1);
        assertTrue(hash.returnHashTable(8).size() == 1);
        assertTrue(hash.returnHashTable(9).isEmpty());
        assertTrue(hash.returnHashTable(10).isEmpty());

    }
}
