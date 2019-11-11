/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.lang.String;
/**
 *
 * @author dw
 */
public interface IHash {
    void Add(int Key, String Value);
    String Get(int Key);
}
