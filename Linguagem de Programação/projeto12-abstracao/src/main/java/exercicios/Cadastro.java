package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Aluno> alunos;

    public Cadastro() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno alunoAdd) {
        alunos.add(alunoAdd);
    }

    public void exibeAlunosFundamental() {
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoFundamental) {
                System.out.println(aluno);                
            }
        }
    }

    public void exibeAlunosGraduacao() {
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoGraduacao) {
                System.out.println(aluno);                
            }
        }
    }

    public void exibeAlunosPos() {
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoPos) {
                System.out.println(aluno);                
            }
        }
    }
}