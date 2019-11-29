/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.math.BigDecimal;

/**
 *
 * @author dw
 */
public interface IVector extends Comparable<IVector>{
    BigDecimal x();
    BigDecimal y();    
  
    static public IVector add(IVector a, IVector b) 
    {
        return new Vector(a.x().add(b.x()) ,a.y().add(b.y()));
    }
    
    static IVector multiply(double scalar, IVector a) {          
        return new Vector(a.x()*scalar,a.y()*scalar);
    }

    static double dotProduct(IVector a, IVector b) {
        return a.x()*b.x()+a.y()*b.y();
    }

    static IVector convexCombination(double scalara, IVector a, double scalarb, IVector b)
    {
        return add(multiply(scalara, a), multiply(scalarb, b));
    }           
    
    @Override
    default int	compareTo(IVector o)
    {
        int equals;
        if (x() == o.x() && y() == o.y() && !(x()==0 && y()==0) )
        {
            equals = 0;
        }
        else
        {
            equals = -1;                   
        }
                
        return equals;        
    }
}
