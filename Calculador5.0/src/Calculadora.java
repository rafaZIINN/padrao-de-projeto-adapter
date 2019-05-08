
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Calculadora {
    public Double adicao() {
        Scanner teclado = new Scanner(System.in);
        double numero1;
        double numero2;
        double valorTotal;

        System.out.println("Digite um número: \n");
        numero1 = teclado.nextDouble();
        
        System.out.println("Digite um número:");
        numero2 = teclado.nextDouble();
        
        valorTotal = numero1 + numero2;
        System.out.println("A Soma é : " + valorTotal);
        
        return valorTotal;

    }
     public Double divisao(){
        Scanner teclado = new Scanner(System.in);
        double numero1;
        double numero2;
        double valorTotal;

        System.out.println("Digite um número: \n");
        numero1 = teclado.nextDouble();
        
        System.out.println("Digite um número:");
        numero2 = teclado.nextDouble();
        
        valorTotal = numero1 / numero2;
        System.out.println("A Divisão é : " + valorTotal);
        return valorTotal;
    }
     public Double subtracao(){
        Scanner teclado = new Scanner(System.in);
        double numero1;
        double numero2;
        double valorTotal;

        System.out.println("Digite um número: \n");
        numero1 = teclado.nextDouble();
        
        System.out.println("Digite um número:");
        numero2 = teclado.nextDouble();
        
        valorTotal = numero1 - numero2;
        System.out.println("A Subtração é : " + valorTotal);
        
        return valorTotal;

    }
    
      public Double multiplicacao(){
         Scanner teclado = new Scanner(System.in);
        double numero1;
        double numero2;
        double valorTotal;

        System.out.println("Digite um número: \n");
        numero1 = teclado.nextDouble();
        
        System.out.println("Digite um número:");
        numero2 = teclado.nextDouble();
        
        valorTotal = numero1 * numero2;
        System.out.println("A Multiplicação é : " + valorTotal);
        
        return valorTotal;
    }
     
}
