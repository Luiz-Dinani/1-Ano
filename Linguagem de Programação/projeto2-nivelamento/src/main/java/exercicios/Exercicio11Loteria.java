package exercicios;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Aluno
 */
public class Exercicio11Loteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        
        Integer chute = gerador.nextInt(11);
        
        System.out.println("Digite um número de 0 a 10");
        Integer numUser = leitor.nextInt();
        
        Integer tentativas = 0;
        
        while(chute != numUser){
            chute = gerador.nextInt(11);
            System.out.println("Número sorteado: " + chute);
            tentativas++;
        }
        if (tentativas<=3) {
            System.out.println("Você é MUITO sortudo");
        }else if (tentativas>=4 && tentativas<=10) {
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        System.out.println("Você precisou de: " + tentativas + " tentativas");
    }
    
}
