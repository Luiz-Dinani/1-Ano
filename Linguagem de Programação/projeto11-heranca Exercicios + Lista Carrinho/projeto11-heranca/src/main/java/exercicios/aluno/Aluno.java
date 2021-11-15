package exercicios.aluno;

public class Aluno {
    protected Integer ra;  
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }
    public Double calcularMedia() {        
        return notaContinuada*0.4+notaSemestral*0.6;        
    }

    @Override
    public String toString() {
        return String.format("RA: %d \nNome: %s \nNota Continuada: %.2f \nNotaSemestral: %.2f \nMédia: %.2f \n", 
        ra, nome, notaContinuada, notaSemestral, calcularMedia());
    }
    
}