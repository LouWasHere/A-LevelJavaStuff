/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.math.*;
import java.math.BigDecimal;
/**
 *
 * @author dw
 */
public class Vector implements IVector
{
    BigDecimal x;
    BigDecimal y;
    public Vector(BigDecimal x, BigDecimal y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public BigDecimal x() 
    {
        return this.x;
    }
    
    @Override
    public BigDecimal y() 
    {
        return this.y;
    }    
    
}
