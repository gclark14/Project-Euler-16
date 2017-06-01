/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler16java;

import java.math.BigInteger;

/**
 *
 * @author gabriel
 */
public class PDS {
    
    BigInteger prod = new BigInteger("2");
    BigInteger sum = new BigInteger("0");
    final BigInteger TWO = new BigInteger("2");
    
    public void cubeIt(){
        for(int i = 0;i < 999; i++){
            prod = prod.multiply(TWO);
        }
    }

    public void addIt(){
        String s = prod.toString();
        for(int i = 0; i < s.length(); i++){
            BigInteger addend = new BigInteger(Character.toString(s.charAt(i)));
            sum = sum.add(addend);
        }
        System.out.println("sum: " + sum.toString());
    }
}
