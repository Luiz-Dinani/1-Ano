package exercicios;

import java.util.Scanner;

/*
 * @author Aluno
 */
public class Exercicio1Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pegarNum1 = new Scanner(System.in);
        Scanner pegarNum2 = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        Double num1 = pegarNum1.nextDouble();
       
        System.out.println("Digite um número inteiro, de novo:");
        Double num2 = pegarNum2.nextDouble();
        
        Double soma = num1+num2;
        Double sub = num1-num2;
        Double mult = num1*num2;
        Double div = num1/num2;
        
        System.out.println(String.format("Resultado da Soma: \n%d"
                + "\nResultado da Subtração: \n%d"
                + "\nResultado da Multiplicação: \n%d"
                + "\nResultado da Divisão: \n%.2f", soma.intValue(),
                sub.intValue(),mult.intValue(),div));
    }
    
}
