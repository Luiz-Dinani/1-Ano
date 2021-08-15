package exercicios;

import java.util.Scanner;

/*
 * @author Luiz Dinani
 */
public class Exercicio6CalculadoraTroco {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {    
        Scanner lerNumericos = new Scanner(System.in);
        
        System.out.println("Insira o valor unitário de um produto:");
        Double valUnitario = lerNumericos.nextDouble();
        
        System.out.println("Insira a quantidade vendida");
        Integer qtdVendida = lerNumericos.nextInt();
        
        System.out.println("Insira o valor pago pelo cliente");
        Double valPagoCliente = lerNumericos.nextDouble();
        
        Double troco = valPagoCliente - (qtdVendida*valUnitario);
        
        if (troco<0) {
            System.out.println("Valor insuficiente, FECHA A LOJA E PEGA O CALOTEIRO!");
        }else{
            System.out.println(String.format("O troco será de R$ %.2f", troco));
        }
    }   
}