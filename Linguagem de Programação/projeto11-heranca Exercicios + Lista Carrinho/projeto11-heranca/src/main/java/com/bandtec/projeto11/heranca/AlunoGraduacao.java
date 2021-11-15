package com.bandtec.projeto11.heranca;

/*
 * @author Luiz Dinani
 */

public class AlunoGraduacao extends Aluno{ //AlunoGraducao herda Aluno

    private Double notaContinuada;
    private Double notaIntegrada;
    
    public AlunoGraduacao(Double notaContinuada, Double notaIntegrada, String ra, String nome) {
        super(ra, nome); //O construtor da classe Aluno exige essas variáveis
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        //String nome = this.nome; //Dá pra pegar pelo this só usando o , pq nome foi herdado de Aluno e é Protected
        //String ra = this.getRa(); //Não dá pra pegar só usando o . pq o RA é Private        
        //String nome = super.nome //Super refere-se à superclasse Aluno, nesse caso é a msm coisa que usar super
        //String ra = super.getRa()
        
        return String.format("RA: %s \nNome: %s \nNota Continuada: %.2f \nNota Integrada: %.2f", 
                super.getRa(), super.nome, notaContinuada, notaIntegrada);
    }   
}