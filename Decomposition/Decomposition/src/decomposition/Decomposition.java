/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decomposition;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author water
 */
public class Decomposition {
    private ArrayList<String> bodyParts = new ArrayList<String>(Arrays.asList(new String[]{"Head","Arm","Leg","Foot"}));
    private String bodyPart;
    private String message;
    /**
     * @param args the command line arguments
     */      
    private Decomposition()
    {
        //A private constructor so that the class can only be instantied by the overloaded constructor
        //This does not get called implicitly
        message = "Oh dear I seem to have lost my: ";
    }
    
    public boolean isValidBodyPart(String bodyPart)
    {
          return bodyParts.contains(bodyPart);
    }
    
    public Decomposition(String bodyPart)
    {     
        this();// Chained call to the default construtor
        this.bodyPart = bodyPart;      
        System.out.println(message + bodyPart);                
    }
            
    public String bodyPart()
    {// An accessor property to the private member variable readonly
        return bodyPart;                
    }    
}
