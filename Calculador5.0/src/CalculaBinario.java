/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class CalculaBinario extends Calculadora{
    
    public void binario (Double resultado){
        System.out.println(Integer.toBinaryString(Double.valueOf(resultado).intValue()));
    }
}
