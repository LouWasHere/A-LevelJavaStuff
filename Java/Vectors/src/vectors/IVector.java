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
    double x();
    double y();    
  
    static public IVector add(IVector a, IVector b) 
    {
//        return new Vector(a.x().add(b.x()) ,a.y().add(b.y()));
    }
    
    static IVector multiply(BigDecimal scalar, IVector a) {          
        return new Vector(a.x().multiply(scalar),a.y().multiply(scalar));
    }

    static BigDecimal dotProduct(IVector a, IVector b) {
        return(a.x().multiply(b.x())).multiply(a.y().multiply(b.y()));
    }

    static IVector convexCombination(BigDecimal scalara, IVector a, BigDecimal scalarb, IVector b)
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
