package exercicios;

import java.util.Scanner;

/*
 * @author Luiz Dinani
 */

public class Exercicio9CalculoMedia {
    public static void main(String[] args) {
        Scanner lerNome = new Scanner(System.in);
        Scanner lerNotas = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = lerNome.nextLine();
        System.out.println("Insira a primeira nota, por favor");
        Double nota1 = lerNotas.nextDouble();
        System.out.println("Insira a segunda nota, por favor");
        Double nota2 = lerNotas.nextDouble();
        Double media = (nota1+nota2)/2;
        
        System.out.println(String.format("Olá, %s! Sua média foi de %.1f", nome,
                media));
    }   
}