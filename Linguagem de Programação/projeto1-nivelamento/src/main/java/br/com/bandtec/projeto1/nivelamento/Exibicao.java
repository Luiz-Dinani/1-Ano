/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto1.nivelamento;

/**
 *
 * @author Aluno
 */
public class Exibicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Para exibição no console usaremos o sout
        IMPORTANTE: Toda exibição no print é um texto. Ex: print(15) -> "15"
         */

 /*
            Atalho para 
                Clonar linha = shift+ctrl+seta(cima ou baixo)
                Para selecionar várias palvras iguais = ctrl+J
                Para renomear uma classe = colocar cursor no nome da classe + ctrl+R
         */
        System.out.println("Luiz");
        System.out.println(12);
        System.out.println(12 + 42);
        System.out.println(true);

        Integer numero = 10;

        System.out.println(numero + 40);
        /*
            Operadores aritméticos básicos
        +
        -
        *
        /
        
            Incremento e Decremento
        ++
        --
        +=1
        -=1
         */

        String nome = "Paulo";
        Integer idade = 50;
        Double credito = 200.0; //Precisa colocar o .0 no Doule
        String frase = "Nome: " + nome + "\n" + "Idade: " + idade + "\t" + "Crédito: " + credito; //O \n quebra a linha na exibição e o \t dá um tab
        System.out.println(frase);
        
        Double passagens = credito/4.40;
        System.out.println(passagens.intValue()); //O .intValue() pega só a casa inteira
    }
}
