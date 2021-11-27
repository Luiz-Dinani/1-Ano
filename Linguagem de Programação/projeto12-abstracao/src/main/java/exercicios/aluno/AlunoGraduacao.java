package exercicios.aluno;

public class AlunoGraduacao extends Aluno{
    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(String nome, Integer ra, Double nota1, Double nota2) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public Double calcularMedia() {
        return (nota1+nota2)/2;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nRA: %d \nNota1: %.2f \nNota2: %.2f \nMedia: %.2f", super.getNome(), super.getRa(), nota1, nota2, calcularMedia());
    }
}
