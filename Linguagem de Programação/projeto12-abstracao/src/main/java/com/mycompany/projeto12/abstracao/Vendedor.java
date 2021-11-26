package com.mycompany.projeto12.abstracao;

public class Vendedor extends Funcionario{
    private Double vendas;
    private Double taxa;

    
    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return vendas*taxa;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
   
    @Override
    public String toString() {
        return String.format("CPF: %s \nNome: %s \nVendas: %.2f \nTaxa: %.2f %%", super.getCpf(), super.getNome(), vendas, taxa*100);
    }
}