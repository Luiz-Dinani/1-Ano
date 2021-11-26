package com.mycompany.projeto12.abstracao;

public class Pessoa {
    //Atributo de Instância
    private String nome;

    //Atributo de Classe - Significa que é comum à todos os objetos da classe
    private static Integer idadeMinimaVoto = 16;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Integer getIdadeMinimaVoto() {
        return idadeMinimaVoto;
    }

    public static void setIdadeMinimaVoto(Integer idadeMinimaVoto) {
        Pessoa.idadeMinimaVoto = idadeMinimaVoto;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \n Idade Minima Voto: %d", nome, idadeMinimaVoto);
    }

}