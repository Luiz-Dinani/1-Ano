package br.com.bandtec.projeto2.nivelamento;

import java.util.Scanner;

/*
 * @author Aluno
 */
public class EstruturasRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exemplo 01: for");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("-".repeat(15));
        
        System.out.println("Exemplo 02: while");
        Integer contador = 1;
        while(contador<10){
            System.out.println(contador);
            contador++;
        }
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Integer numDigitado = input.nextInt();
        
        while(numDigitado != 50){
            System.out.println("Nnhee não gostei, digita outro: ");
            numDigitado = input.nextInt();
        }
        System.out.println("Muito bem, caralho! Gtrandes mentes pensam igual");
        
        System.out.println("-".repeat(15));
        
        System.out.println("Exemplo 03: do while");
               
        Integer numDigitado2;
        
        do {            
            System.out.println("Digigte outro numero, só pa rir kkkkk");
            numDigitado2 = input.nextInt();
        } while (numDigitado2 != 100);
        System.out.println("Muito bom, de novo! Parabéns WAAAAWWWWWW");
  }    
}