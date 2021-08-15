package exercicios;

import java.util.Scanner;

/*
 * @author Luiz Dinani
 */
public class Exercicio4Calorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lerNome = new Scanner(System.in);
        Scanner lerTempo = new Scanner(System.in);
        
        System.out.println("Escreva seu nome");
        String  nome = lerNome.nextLine();
        
        System.out.println("Quanto tempo (em minutos) você fez de Aquecimento?");
        Integer tempoAquec = lerTempo.nextInt();
        System.out.println("Quanto tempo (em minutos) você fez de Aeróbico?");
        Integer tempoAerob = lerTempo.nextInt();
        System.out.println("Quanto tempo (em minutos) você fez de Musculação?");
        Integer tempoMusc = lerTempo.nextInt();
        
        Integer calAquec = tempoAquec*12;
        Integer calAerob = tempoAerob*20;
        Integer calMusc = tempoMusc*25;
        
        System.out.println(String.format("Olá, %s! Você fez um total de %d minutos "
                + "de exercício e perdeu cerca de %d calorias, parabéns!", nome,
                (tempoAquec+tempoAerob+tempoMusc),(calAquec+calAerob+calMusc)));
    }   
}