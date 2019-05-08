/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class hexaDecimal extends Calculadora {
    
    public void hexadecimal (Double resultado){
        System.out.println(Integer.toHexString(Double.valueOf(resultado).intValue()));
        
    }
}
