package br.com.bandtec.projeto2.nivelamento;

import static java.lang.Math.round;

/**
 *
 * @author Aluno
 */
public class Numericos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double numero = 3.4;
        
        System.out.println("Arredondamento normal: " + round(numero));
        System.out.println("Arredondando para cima: " + Math.ceil(numero));
        System.out.println("Arredondando para baixo: " + Math.floor(numero));
    }
    
}
