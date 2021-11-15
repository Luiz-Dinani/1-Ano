package exercicios.aluno;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private Integer totalVagas;
    private Integer vagasDisponiveis;    
    private List<Aluno> alunos;


    public Faculdade(String nome, Integer totalVagas) {
        this.nome = nome;
        this.totalVagas = totalVagas;
        this.vagasDisponiveis = totalVagas;
        this.alunos = new ArrayList<Aluno>();
    }

    public void matricularAluno(Aluno aluno){
        if (aluno != null && vagasDisponiveis>0) {
            alunos.add(aluno);
            System.out.println(aluno.nome + " Cadastrado(a) com sucesso!");
            vagasDisponiveis--;
        }else{
            System.out.println("Sem vagas! Aluno: " +aluno.nome+ " não cadastrado.");
        }
    }

    public void exibirAlunosMatriculados() {
        if (alunos.size() != 0) {
            System.out.println("Alunos Cadastrados: \n");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
            System.out.println("=".repeat(15));
        }else{
            System.out.println("A faculdade "+ nome +" não possui alunos cadastrados");
        }
    }

    public void exibirAlunosPos() {
        if (alunos.size() != 0) {
            System.out.println("Alunos de Pós Graduação: \n");
            for (Aluno aluno : alunos) {
                if (aluno instanceof AlunoPos) {
                    System.out.println(aluno);                    
                }
            }
            System.out.println("=".repeat(15));
        }else{
            System.out.println("A faculdade "+ nome +" não possui alunos cadastrados em pós graduação");
        }       
    }
    
    @Override
    public String toString() {        
        StringBuilder str = new StringBuilder();
        
        str.append(String.format("Nome: %s \nVagas Criadas: %d \nVagas Disponíveis: %d \nAlunos: \n", nome, totalVagas, vagasDisponiveis));

        for (Aluno aluno : alunos) {
            str.append(aluno.toString()+"\n");
        }

        return str.toString();

    }

}