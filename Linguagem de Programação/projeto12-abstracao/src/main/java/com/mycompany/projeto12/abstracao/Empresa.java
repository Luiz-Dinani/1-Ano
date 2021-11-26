package com.mycompany.projeto12.abstracao;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>(); //Como um horista e um vendedor são funcionários também, eles podem entrar na lista
    }

    public void adicionarFunc(Funcionario func) {
        funcionarios.add(func);
        System.out.println(func.getNome()+" Adicionado com Sucesso");
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
    
    public void exibeTotalSalario() {
        Double totalSalario = 0.00;
        for (Funcionario funcionario : funcionarios) {
            totalSalario += funcionario.calcSalario();
        }
        System.out.println(totalSalario);
    }

}