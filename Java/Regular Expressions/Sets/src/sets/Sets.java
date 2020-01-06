/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dw
 */
public class Sets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SubSet ss = new SubSet(); 
        ss.addAll( new ArrayList<Integer>(Arrays.asList(0,1,3) ));
        System.out.println(ss);
        System.out.println(ss.Cardinality());
    }   
}
