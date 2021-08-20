package exercicios;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Aluno
 */
public class Exercicio17Sorteio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        
        System.out.println("Escolha um número de 1 a 100");
        Integer numEscolhido = leitor.nextInt();
        
        Integer sorteiosTotal = 0;
        Integer sorteiosPares = 0;
        Integer sorteiosImpares = 0;
        Boolean primeiraVez = true;
        Integer posPrimeiraVez = 0;
        
        for (int i = 0; i < 200; i++) {
            Integer chute = gerador.nextInt(101);
            sorteiosTotal++;
            if (chute == numEscolhido && primeiraVez) {
                posPrimeiraVez = sorteiosTotal;
                primeiraVez = false;
            }
            if (chute%2 == 0) {
                sorteiosPares++;
            }else{
                sorteiosImpares++;
            }
        }
        System.out.println(String.format("Seu número apareceu pela primeira vez no"
                + " sorteio número %d \nForam sorteados %d números pares e %d impares", 
                posPrimeiraVez, sorteiosPares, sorteiosImpares));
    }
    
}
