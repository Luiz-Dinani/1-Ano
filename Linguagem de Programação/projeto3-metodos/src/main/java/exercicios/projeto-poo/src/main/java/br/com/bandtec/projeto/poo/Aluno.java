package br.com.bandtec.projeto.poo;
/*
 * @author Aluno
 */
public class Aluno {
    Integer ra;
    String nome;
    Double nota1;
    Double nota2;   
    Double media;
    private Boolean aprovado; //Com o private, o usuario da classe main não consegue alterar o aprovado, mesmo usando 
                              //aluno.aprovado=true
    
    void calcularMedia(){
        media = (nota1+nota2)/2;
        aprovado = media >= 6; //media>=6 retorna True ou False        
    }   
    void exibirDadosAluno(){
        String exibicao = "RA: %d \nNome: %s \nNota1: %.2f \nNota2: %.2f \nSituação: %b";
        System.out.println("=".repeat(15));
        System.out.println(String.format(exibicao, ra, nome, nota1, nota2,
                aprovado ? "Aprovado" : "Reprovado"));
        System.out.println("=".repeat(15));
        
    }
}