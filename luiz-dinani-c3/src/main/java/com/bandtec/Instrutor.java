package com.bandtec;

public class Instrutor {
    protected String nome;
    protected Integer qtdHora;
    protected Double valorHora;

    public Instrutor(String nome, Integer qtdHora, Double valorHora) {
        this.nome = nome;
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    public Double calcularSalario() {
        return qtdHora * valorHora * 4.5;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nQuantidade de Horas: %d \nValor da Hora: R$ %.2f \nSalário: R$ %.2f \n", 
        nome, qtdHora, valorHora, calcularSalario());

    }

}