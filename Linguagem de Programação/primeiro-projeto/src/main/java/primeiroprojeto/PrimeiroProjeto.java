package primeiroprojeto;

import java.util.Scanner;

public class PrimeiroProjeto {
    
    public static void main(String[] args) { //Ponto de Entrada do programa, permite que a classe se torne executavel
        
        System.out.println("Ola, Mundo!");
        
        String nome = "Luiz"; //O Tipo string sempre será utilizado para alfanumericos
        String sobrenome = "Dinani";
        
        System.out.println(nome+" "+sobrenome);
        
        //int é chamado de tipo primitivo, o Integer pe camado de class Wrapper. Apesar dos tipos primitivos usarem menos memória, eles têm menos funções, por isso usaremos Class Wrappers
        Integer numeroInteiro = 20;
        Integer numeroInteiro2 = 30;
        Integer numeroInteiro3 = numeroInteiro + numeroInteiro2;
        System.out.println("O numero é: "+numeroInteiro3);
        
        //Para numeros reais com casas decimais usaremos Double
        Double salario = 20000.00;
        System.out.println(salario);
        
        Boolean ligado = true; //Tem que ser true, ele não reconhece 1
        System.out.println("Está ligado? "+ligado);
        
        
        //A classe Scanner permite ler informações diretamente do console. É tipo um input do HTML
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt(); //Obriga o usuario a digitar algo
        
        System.out.println("Sua idade é: " + idade);
        
        System.out.println("Escreva uma cor: ");
        String corDigitada = leitor.nextLine(); //Obriga o usuario a digitar algo, o nexLine aceita espaços, ja o next não
        System.out.println("Você digitou: "+corDigitada);
        
    }   
}
