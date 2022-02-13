package com.bandtec;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nome;
    private Integer vagas;
    private List<Instrutor> instrutores;

    public Academia(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.instrutores = new ArrayList<>();
    }

    public void contratarInstrutor(Instrutor instrutor) {
        if (instrutores.size() < vagas) {
            instrutores.add(instrutor);
            System.out.println("Instrutor " + instrutor.nome + " contratado com sucesso! \n");
        } else {
            System.out.println("A academia " + nome + " não possui vagas disponíveis \n");
        }
    }

    public void exibirInstrutores() {
        if (!instrutores.isEmpty()) {
            System.out.println("Instrutores: ");
            for (Instrutor instrutor : instrutores) {
                System.out.println(instrutor);
            }
        } else {
            System.out.println("A academia " + nome + " não possui instrutores \n");
        }
    }

    public void exibePersonalTrainers() {
        if (!instrutores.isEmpty()) {
            System.out.println("Personal Trainers: ");
            for (Instrutor instrutor : instrutores) {
                if (instrutor instanceof Personal) {
                    System.out.println(instrutor); // Esse instrutor é um personal, por isso vai usar o toString do
                                                   // Personal
                }
            }
        } else {
            System.out.println("A academia " + nome + " não possui instrutores \n");
        }
    }

    public void exibeFolhaDePagamento() {
        Double totalSalario = 0.00;
        System.out.println("Folha de Pagamento: ");
        for (Instrutor instrutor : instrutores) {
            System.out.println(
                    String.format("Nome: %s \nSalário: R$ %.2f \n", instrutor.nome, instrutor.calcularSalario()));
            totalSalario += instrutor.calcularSalario();
        }

        System.out.println(String.format("Total de Funcionários: %d \nTotal a ser pago: R$ %.2f \n", instrutores.size(),
                totalSalario));
    }

    public Instrutor buscarInstrutor(String nome) {
        if (!instrutores.isEmpty()) {
            for (Instrutor instrutor : instrutores) {
                if (instrutor.nome.equalsIgnoreCase(nome)) {
                    return instrutor;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nMáximo de Vagas: %d \nVagas Restantes: %d", nome, vagas,
                (vagas - instrutores.size()));
    }
}