/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashingpotatoes;

/**
 *
 * @author l-bishop
 */
public class Main
{
    public static void main(String[] args)
    {
        HashingPotatoes hash = new HashingPotatoes();
        hash.setValues(78,55,34,19,29);
        hash.createArrayOfArrayLists();
        hash.encodeAndStore();
        hash.setEverythingIntoHashTable();
        
    }
}
