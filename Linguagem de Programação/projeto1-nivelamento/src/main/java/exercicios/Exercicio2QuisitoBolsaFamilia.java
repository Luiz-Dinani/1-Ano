package exercicios;

import java.util.Scanner;

/*
 * @author Aluno
 */
public class Exercicio2QuisitoBolsaFamilia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner qtdFilhos0a3 = new Scanner(System.in);
        
        Scanner qtdFilhos4a16 = new Scanner(System.in);
        
        Scanner qtdFilhos17a18 = new Scanner(System.in);
         
        System.out.println("Insira quantos filhos de 0 a 3 anos você possui:");
        Double qtd0a3 = qtdFilhos0a3.nextDouble();
        
        System.out.println("Insira quantos filhos de 4 a 16 anos você possui:");        
        Double qtd4a16 = qtdFilhos4a16.nextDouble();
        
        System.out.println("Insira quantos filhos de 17 a 18 anos você possui:");
        Double qtd17a18 = qtdFilhos17a18.nextDouble();       
        
        Double totalFilhos = qtd0a3 + qtd4a16 + qtd17a18;
        
        Double beneficio0a3 = 25.12*qtd0a3;
        Double beneficio4a16 = 15.88*qtd4a16;
        Double beneficio17a18 = 12.44*qtd17a18;
        
        Double totalBolsa = beneficio0a3 + beneficio4a16 + beneficio17a18;
        
        System.out.println(String.format("Você tem um total de %.0f filhos e vai"
                + " receber R$%.2f de bolsa", totalFilhos, totalBolsa));
    }
}