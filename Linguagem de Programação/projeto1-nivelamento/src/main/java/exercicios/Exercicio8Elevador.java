package exercicios;

import java.util.Scanner;

/*
 * @author Luiz Dinani
 */
public class Exercicio8Elevador {

    public static void main(String[] args) {
        Scanner lerNumericos = new Scanner(System.in);
        
        System.out.println("Qual o limite de peso do elevador?");
        Double limitePeso = lerNumericos.nextDouble();
        System.out.println("Qual o limite de pessoas no elevador?");
        Integer limitePessoas = lerNumericos.nextInt();
        System.out.println("Qual o peso do passageiro 1?");
        Double peso1 = lerNumericos.nextDouble();
        System.out.println("Qual o peso do passageiro 2?");
        Double peso2 = lerNumericos.nextDouble();
        System.out.println("Qual o peso do passageiro 3?");
        Double peso3 = lerNumericos.nextDouble();
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual"
                + " cabem %d pessoas. \n"
                + "O peso total no elevador é de %.2f, sendo que ele suporta %.2f",
                limitePessoas, (peso1+peso2+peso3), limitePeso));
    }   
}