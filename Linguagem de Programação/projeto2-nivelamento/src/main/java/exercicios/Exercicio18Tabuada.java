package exercicios;

import java.util.Scanner;

/*
 * @author Luiz Dinani
 */
public class Exercicio18Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        Integer numUser = leitor.nextInt();
        
        System.out.println(String.format("Tabuada do %d:", numUser));
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", numUser, i, numUser*i));
        }
    }
    
}
