package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

/*
 * @author Aluno
 */
public class Condicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Operadores Lógicos
        == (Para textos, no lugar de usar == é melhor usar .equals()
        != (!variavel.equals() faz a mesma coisa)
        >
        <
        >=
        <=
        &&
        ||
        */
        System.out.println("Digite um dia da semana");
        Scanner lerDia = new Scanner(System.in);
        Integer dia = lerDia.nextInt();
    
      /* Esse é o switch case, ele serve pra substituir cadeias de if-elseif. 
        Essa era a cadeia anterior:
        
        if (dia.equals(1)) {
            System.out.println("Domingo");
        }else if (dia.equals(2)) {
            System.out.println("Segunda");
        }else if (dia.equals(3)) {
            System.out.println("Terça");
        }else if (dia.equals(4)) {
            System.out.println("Quarta");
        }else if (dia.equals(5)) {
            System.out.println("Quinta");
        }else if (dia.equals(6)) {
            System.out.println("Sexta");
        }else if (dia.equals(7)) {
            System.out.println("Sábado");
        }else{
            System.out.println("Número inválido");
        }
    }
    */
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
    
}
