package exercicios;

import java.util.Scanner;

/*
 * @author Aluno
 */
public class Exercicio16Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira a Base");
        Integer base = leitor.nextInt();
        
        System.out.println("Insira o Expoente");
        Integer exp = leitor.nextInt();
        
        Integer resultado = base;
        
        for (int i = 1; i < exp; i++) {
            resultado = resultado*base;            
        }
        System.out.println(String.format("%d elevado a %d é igual a %d",
                base, exp, resultado));
    }  
}