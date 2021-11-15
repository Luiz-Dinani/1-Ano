package exercicios.produtora;

public class Ator {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Ator(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }    
    
    public Double getSalario() {
        return qtdHorasTrabalhadas*valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nQtd Horas Trabalhadas: %d \nValor Hora: %.2f \nSalário: %.2f", 
        nome, qtdHorasTrabalhadas, valorHoraTrabalhada, getSalario());
    }
}
