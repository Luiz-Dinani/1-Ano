package exercicios.aluno;

public class AlunoPos extends Aluno{
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;
    
    public AlunoPos(String nome, Integer ra, Double nota1, Double nota2, Double notaMonografia) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calcularMedia() {
        return (nota1+nota2+notaMonografia)/3;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nRA: %d \nNota1: %.2f \nNota2: %.2f \nNota Monografia: %.2f \nMedia: %.2f", super.getNome(), super.getRa(), nota1, nota2, notaMonografia, calcularMedia());
    }
}
