/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class octal extends Calculadora{
    public void octal(Double resultado){
        System.out.println(Integer.toOctalString(Double.valueOf(resultado).intValue()));
    }
    
}
