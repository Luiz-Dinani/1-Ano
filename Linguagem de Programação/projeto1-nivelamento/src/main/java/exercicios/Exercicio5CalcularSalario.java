package exercicios;

import java.util.Scanner;

/*
 *
 * @author Luiz Dinani
 */
public class Exercicio5CalcularSalario {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner ler_salario_e_roubo = new Scanner(System.in);
        
        System.out.println("Digite seu salário");
        Double salario = ler_salario_e_roubo.nextDouble();
        
        System.out.println("Digite o roubo (em %)");
        Double roubo = salario * (ler_salario_e_roubo.nextDouble()/100);
        
        Double salario_liquido = salario - roubo;
        
        System.out.println(String.format("Como o seu salário é R$ %.2f e você foi"
                + " roubado em %.2f, o seu salário líquido é de %.2f", salario,
                roubo, salario_liquido));
    }
}