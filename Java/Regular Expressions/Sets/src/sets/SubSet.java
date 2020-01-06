/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.util.HashSet;

/**
 *
 * @author dw
 */
public class SubSet extends HashSet<Integer>{    
    public SubSet()
    {
        super();        
    }
    
    public Integer Cardinality()
    {
        return this.size();                      
    }
}
