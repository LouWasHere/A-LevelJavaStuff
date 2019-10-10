/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decomposition;

import java.io.*;

/**
 *
 * @author water
 */
public class Main {
      public static void main(String[] args) {        
        // TODO code application logic here
        Decomposition decomposition;
        
        decomposition = new Decomposition("Head");
        decomposition = new Decomposition(validateDataEntry());        
    }
      
      private static String validateDataEntry()
      {
          BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
          String bodyPart = null;
          
          System.out.println("Enter your body part."); 
          
          try
          {              
              bodyPart = userInput.readLine();
          }
          catch(Exception e)
          {
              System.out.println("User input error");  
          }
          
          return bodyPart;
      }
}
