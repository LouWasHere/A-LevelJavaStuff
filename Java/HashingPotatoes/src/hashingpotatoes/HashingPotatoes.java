/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashingpotatoes;

import java.util.*;

public class HashingPotatoes
{
    ArrayList<Integer> values = new ArrayList<>();
    ArrayList<Integer> encodedValues = new ArrayList<>();
    ArrayList[] hashValues = new ArrayList[11];
    
    public void setValues(int i1,int i2,int i3,int i4,int i5)
    {
        values.add(i1);
        values.add(i2);
        values.add(i3);
        values.add(i4);
        values.add(i5);
    }
    
    public void createArrayOfArrayLists()
    {
        for (int i = 0; i <= 10; i++)
        {
            hashValues[i] = new ArrayList<>();
        }
    }
    
    public void encodeAndStore()
    {
        for(int i = 0; i <= values.size()-1; i++)
        {
            encodedValues.add(values.get(i) % 11);
        }
    }
    
    public void setEverythingIntoHashTable()
    {
        for (int i = 0; i <= values.size()-1; i++)
        {
            hashValues[encodedValues.get(i)].add(values.get(i));
        }
    }
    

}
