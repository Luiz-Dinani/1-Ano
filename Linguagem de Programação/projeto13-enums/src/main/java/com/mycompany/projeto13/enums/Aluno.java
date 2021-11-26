package com.mycompany.projeto13.enums;

/*
 * @author aluno
 */
public class Aluno {
    private String nome;
    private LocalizacaoEnums localizacao; //Enums podem estar em atributos também

    public Aluno(String nome, LocalizacaoEnums localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }   

}