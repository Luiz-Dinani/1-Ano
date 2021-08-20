package br.com.bandtec.projeto2.nivelamento;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Randomicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Math.random() Funciona igual no JS
        System.out.println("Usando Math.random");
        System.out.println(Math.random());
        System.out.println(Math.random()*10);
        
        //Truque para repetir uma string
        System.out.println("-".repeat(15));
        
        //Random - Classe responsável por gerar randômicos
        Random gerador = new Random();
        System.out.println("Usando só o Integer ele gera valores de \n"
                + Integer.MIN_VALUE + "\naté\n " + Integer.MAX_VALUE);
        System.out.println("Resultado: ");
        System.out.println(gerador.nextInt()); //Gera números de -(2^32) até 2^32
        
        System.out.println("Usando 10 como parâmetro"); //nextInt é uma função da classe Random, 10 é um parâmetro para a função
        System.out.println(gerador.nextInt(10)); //Gera números de 0 até 9
        
        System.out.println("Random Booleano");
        System.out.println(gerador.nextBoolean());
        
        System.out.println("-".repeat(15));
        
        System.out.println("Usando o ThreadLocalRandom.current().nextInt() com -10,10 como parâmetros");
        System.out.println(ThreadLocalRandom.current().nextInt(-10, 10)); //Vai gerar de -10 até 9
    }    
}