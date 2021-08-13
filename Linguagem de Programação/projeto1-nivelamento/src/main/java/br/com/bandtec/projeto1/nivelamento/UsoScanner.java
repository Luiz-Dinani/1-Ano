package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

/*
 * @author Aluno
 */
public class UsoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Uma classe é como se fosse a planta de um condomínio, ou seja, tem suas próprias regras
        //Um objeto obedece as regras da planta, é como se ele fosse um apartamento
        
        //O leitor representa um objeto (ou instância) do tipo Scanner
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt(); //O .nextInt() converte de txt pra nº
        
        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();
        
        System.out.println(String.format("Nome digitado: %s \n Idade: %d Altura: "
                + "%.2f", nome, idade,altura));
    }
    
}
