
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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);

       // String operacao;
        //int control = 0;
       // Double resultado = 0.0;
        

        //System.out.println("Digite a operação que deseja efetuar:");
        //operacao = teclado.nextLine();
        
       
        //if (operacao.equals("+")) {
           // Calculadora soma = new Calculadora();
           // resultado.valueOf(operacao) = soma.adicao();
           // control++;

        //}
        
        //if (operacao.equals("-")) {
            //Calculadora subtracao1 = new Calculadora();
            //subtracao1.subtracao();
            //control++;

        //}
        
        // if (operacao.equals("*")) {
           // Calculadora multipli = new Calculadora();
           // multipli.multiplicacao();
           // control++;

       // }
         
          //if (operacao.equals("/")) {
            //Calculadora div = new Calculadora();
            //div.divisao();
            //control++;

        //}
        //if (control == 0) {
            //System.out.println("Operação inválida, tente Novamente com seguites operadores: + , - , * , / !");
        //}

         Scanner input = new Scanner(System.in);
       	int numero;
        int numero1;
        Double valorTotal = 0.0;
        
            System.out.println(" Digite: \n 1 para realizar uma adição \n 2 para realizar uma subtração \n 3 para realizar uma multiplicação \n 4 para realizar uma divisão \n");
            numero = input.nextInt();
            
		switch (numero) {
		case 1:
			Calculadora soma = new Calculadora();
			valorTotal = soma.adicao();
                        break;
    
		case 2:
			Calculadora sub = new Calculadora();
			valorTotal = sub.subtracao();
			break;
		case 3:
			Calculadora multi = new Calculadora();
			valorTotal = multi.multiplicacao();
			break;
		case 4:
        		Calculadora divi = new Calculadora();
			valorTotal = divi.divisao();
                	
                }
              
        System.out.println(" \n Digite: \n 1 para número em decimal \n 2 para binário \n 3 para hexadecimal \n 4 para octal \n");
            numero1 = input.nextInt();
            
		switch (numero1) {
		case 1:
			System.out.println("Resultado em decimal: \n" + valorTotal);
			break;
		case 2:
			CalculaBinario valorTotal1 = new CalculaBinario();
                        valorTotal1.binario(valorTotal);
			break;
		case 3:
                        hexaDecimal valorTotal2 = new hexaDecimal();
                        valorTotal2.hexadecimal(valorTotal);
			break;
		case 4:
        		octal valorTotal3 = new octal();
                        valorTotal3.octal(valorTotal);
			break;
			}
    }
    }
    

