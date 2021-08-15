package exercicios;

import java.util.Scanner;

/**
 *
 * @author Luiz Dinani
 */
public class Exercicio7SalarioChico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lerNumericos = new Scanner(System.in);
        
        System.out.println("Insira seu salário bruto");
        Double salBruto = lerNumericos.nextDouble();
        Double inss = salBruto*0.1;
        Double ir = salBruto*0.2;
        
        System.out.println("Quanto custa sua condução só de ida de casa para o trabalho?");
        Double custoCond = lerNumericos.nextDouble();
        Double vt = custoCond*2*22;
        
        Double salLiq = salBruto - inss - ir - vt;
        
        System.out.println(String.format("Seu salário bruto é R$%.2f, tem um total"
                + "de R$%.2f em descontos, então você recebe %.2f", salBruto, 
                (inss + ir + vt), salLiq));
    }
    
}
