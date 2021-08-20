package exercicios;

import java.util.Random;

/*
 * @author Aluno
 */
public class Exercicio12Acumulador {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Random gerador = new Random();
        Integer chute;
        Integer tentativas = 0;
        do {            
            chute = gerador.nextInt();
            System.out.println(chute);
            tentativas++;
        } while (chute != 0);
        System.out.println("Para achar o 0, você precisou de "+tentativas+" tentativas");
    }
}