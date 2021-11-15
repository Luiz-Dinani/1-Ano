package exercicios.consultoria;

public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;


    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada, Integer qtdHorasTrabalhadasMobile, Double valorHoraTrabalhadaMobile) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public Double getSalario() {        
        return super.getSalario() + qtdHorasTrabalhadasMobile*valorHoraTrabalhadaMobile;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("\nQtd Horas Mobile: %d \nVal Horas Mobile: %.2f \nSalário Total: %.2f"
        , qtdHorasTrabalhadasMobile, valorHoraTrabalhadaMobile, getSalario());
    }
}
