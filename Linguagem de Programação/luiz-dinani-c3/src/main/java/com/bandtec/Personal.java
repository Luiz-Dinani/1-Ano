package com.bandtec;

public class Personal extends Instrutor {
    private Integer qtdHoraPersonal;
    private Double valorHoraPersonal;

    public Personal(String nome, Integer qtdHora, Double valorHora, Integer qtdHoraPersonal, Double valorHoraPersonal) {
        super(nome, qtdHora, valorHora);
        this.qtdHoraPersonal = qtdHoraPersonal;
        this.valorHoraPersonal = valorHoraPersonal;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + (qtdHoraPersonal * valorHoraPersonal * 4.5);
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s \nQuantidade de Horas: %d \nValor da Hora: R$ %.2f \nQuantidade de Horas Personal: %d"
                        + "\nValor da Hora Personal: R$ %.2f \nSalário Total: R$ %.2f \n",
                nome, qtdHora, valorHora, qtdHoraPersonal, valorHoraPersonal, calcularSalario());
    }
}