package exercicio.professor;

/*
 * @author aluno
 */

public class Coordenador extends Professor{
    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(Integer codigo, String nome, Integer qtdHoras, Double valorHora, Integer qtdHorasCoord, Double valorHoraCoord, String curso) {
        super(codigo, nome, qtdHoras, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    
    @Override
    public Double calcularSalario() {
        return super.calcularSalario()+qtdHorasCoord*valorHoraCoord*4.5; //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }

    public void setQtdHorasCoord(Integer qtdHorasCoord) {
        this.qtdHorasCoord = qtdHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("Código: %d \nNome: %s \nCurso: %s \nqtdHoras: %d \n"
                + "valHora: %.2f \n\nqtdHorasCoord: %d \n valHoraCoord: %.2f ", 
                super.codigo, super.nome, curso,super.qtdHoras, super.valorHora, qtdHorasCoord, valorHoraCoord);
    }   
}