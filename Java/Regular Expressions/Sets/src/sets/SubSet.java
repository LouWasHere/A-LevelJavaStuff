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
public class SubSet extends HashSet<Integer>
{    
    public SubSet()
    {
        super();        
    }
    
    public int Cardinality()
    {
        return this.size();                      
    }
    
    public SubSet union(SubSet ss)
    {
        SubSet thisSet = new SubSet();
        thisSet.addAll(this);
        thisSet.removeAll(ss);
        thisSet.addAll(ss);
        return thisSet;       
    }
    
    public SubSet intersection(SubSet ss)
    {
        SubSet thisSet = new SubSet();
        thisSet.addAll(this);
        thisSet.retainAll(ss);
        return thisSet;
    }
    
    public SubSet difference(SubSet ss)
    {
        SubSet thisSet = new SubSet();
        thisSet.addAll(this);
        thisSet.removeAll(ss);
        return thisSet;
    }
    
    public boolean isSubSet(SubSet ss)
    {
        SubSet thisSet = new SubSet();
        thisSet.addAll(this);
        return thisSet.containsAll(ss);
    }
    
    public boolean isEmpty()
    {
        return this.isEmpty();
    }
}
