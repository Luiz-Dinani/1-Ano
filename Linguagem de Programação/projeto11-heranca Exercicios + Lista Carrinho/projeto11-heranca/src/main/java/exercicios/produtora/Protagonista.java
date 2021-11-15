package exercicios.produtora;

public class Protagonista extends Ator{
    protected Integer qtdHorasTrabalhadasProtagonista;
    protected Double valorHoraTrabalhadaProtagonista;

    public Protagonista(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada, Integer qtdHorasTrabalhadasProtagonista, Double valorHoraTrabalhadaProtagonista) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario()+qtdHorasTrabalhadasProtagonista*valorHoraTrabalhadaProtagonista;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("\nQtd Horas Protagonista: %d \nVal Hora Protagonista: %.2f \nSalário Total: %.2f \n",
        qtdHorasTrabalhadasProtagonista, valorHoraTrabalhadaProtagonista, getSalario());
 
    }

}