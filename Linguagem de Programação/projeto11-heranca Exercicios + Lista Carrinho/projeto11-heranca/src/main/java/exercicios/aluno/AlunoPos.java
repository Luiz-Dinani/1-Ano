package exercicios.aluno;

public class AlunoPos extends Aluno {
    private Double notaMonografia;
    public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
        super(ra, nome, notaContinuada, notaSemestral);        
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calcularMedia() {        
        return (notaContinuada+notaSemestral+notaMonografia)/3;
    }

    @Override
    public String toString() {        
        return super.toString();
    }
}
