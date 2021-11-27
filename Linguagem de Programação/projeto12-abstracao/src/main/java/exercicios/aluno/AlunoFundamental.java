package exercicios.aluno;

public class AlunoFundamental extends Aluno{
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;

    public AlunoFundamental(String nome, Integer ra, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    @Override
    public Double calcularMedia() {
        return (nota1+nota2+nota3+nota4)/4;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nRA: %d \nNota1: %.2f \nNota2: %.2f \nNota3: %.2f \nNota4: %.2f \nMedia: %.2f", super.getNome(), super.getRa(), nota1, nota2, nota3, nota4, calcularMedia());
    }
}
