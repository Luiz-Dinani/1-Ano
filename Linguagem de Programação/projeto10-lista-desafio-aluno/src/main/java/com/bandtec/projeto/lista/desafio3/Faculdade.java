package com.bandtec.projeto.lista.desafio3;

import java.util.List;
import java.util.ArrayList;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    /*
     * Deve verificar se existe um aluno com o nome informado, caso não exista,
     * retorne false;
     */
    public Boolean existsAlunoPorNome(String nome) {
        if (nome != null) {
            for (Aluno aluno : alunos) {
                if (aluno.getNome().toLowerCase().equals(nome.toLowerCase())) {
                    return true; // Não precisa de uma variavél
                }
            }
        }
        return false;
    }

    /*
     * Deve matricular um aluno na faculdade (inserir na lista), se a lista já
     * possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {
        if (aluno != null) {
            if (!existsAlunoPorNome(aluno.getNome())) {
                alunos.add(aluno);
            }            
        }
    }

    /*
     * Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não
     * existir um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)) {
                aluno.setAtivo(false);
            }
        }
    }

    /*
     * Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        return alunos.size();
    }

    /*
     * Deve retornar a quantidade de alunos matriculados (contidos na lista) que
     * estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        Integer qtdAlunosNoSemestre = 0;
        for (Aluno aluno : alunos) {
            if (aluno.getSemestre().equals(semestre)) {
                qtdAlunosNoSemestre++;
            }
        }
        return qtdAlunosNoSemestre;
    }

    /*
     * Deve retornar a quantidade de alunos com matricula cancelada (contidos na
     * lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer qtdAlunosMatriculaCancelada = 0;
        for (Aluno aluno : alunos) {
            if (!aluno.isAtivo()) {
                qtdAlunosMatriculaCancelada++;
            }
        }
        return qtdAlunosMatriculaCancelada;
    }

    public String getNome() {
        return nome;
    }
}