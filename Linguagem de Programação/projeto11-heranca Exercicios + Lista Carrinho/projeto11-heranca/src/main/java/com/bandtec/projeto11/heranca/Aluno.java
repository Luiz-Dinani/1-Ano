package com.bandtec.projeto11.heranca;

/**
 * @author Luiz Dinani
 */
public class Aluno {
    private String ra;
    protected String nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }    
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + '}';
    }
    
}