package com.mycompany.projeto12.abstracao;

public class Horista extends Funcionario{
    private Integer qtdHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override //Se não colocar esse método dá erro, pois a classe abstrata obriga suas herdeiras a usar esse método
    public Double calcSalario() {
        return qtdHora*valorHora;
    }

    public Integer getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(Integer qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return String.format("Horista \nqtdHora: %d \nValor Hora: %.2f\n", qtdHora, valorHora);
    }

   
}