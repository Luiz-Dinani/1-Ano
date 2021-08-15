package exercicios;
import java.util.Scanner;
/*
 * @author Luiz Dinani
 */
public class Exercicio10Idade {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lerNome = new Scanner(System.in);
        Scanner lerAnoNasc = new Scanner(System.in);
        Scanner lerFuturo = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = lerNome.nextLine();
        
        System.out.println(String.format("Olá, %s! Qual o ano do seu nascimento?",
                nome));
        Integer anoNasc = lerAnoNasc.nextInt();
        
        if (anoNasc>=2030) {
            System.out.println("Mano, como tão as coisas aí no futuro?");
            String futuro = lerFuturo.nextLine();
            System.out.println("Foda, valeu aí pela info!");
        }else{
        System.out.println(String.format("Em 2030 você terá %d anos", 2030-anoNasc));
        }
    }   
}