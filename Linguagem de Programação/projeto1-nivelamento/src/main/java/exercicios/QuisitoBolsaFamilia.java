package exercicios;

import java.util.Scanner;

/*
 * @author Aluno
 */
public class QuisitoBolsaFamilia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Insira quantos filhos de 0 a 3 anos você possui:");
        Scanner qtdFilhos0a3 = new Scanner(System.in);
        
        System.out.println("Insira quantos filhos de 4 a 16 anos você possui:");
        Scanner qtdFilhos4a16 = new Scanner(System.in);
        
        System.out.println("Insira quantos filhos de 17 a 18 anos você possui:");
        Scanner qtdFilhos17a18 = new Scanner(System.in);
        
        Integer qtd0a3 = qtdFilhos0a3.nextInt();
        Integer qtd4a16 = qtdFilhos4a16.nextInt();
        Integer qtd17a18 = qtdFilhos17a18.nextInt();
        
        Integer totalFilhos = qtd0a3 + qtd4a16 + qtd17a18;
        
    }
    
}
