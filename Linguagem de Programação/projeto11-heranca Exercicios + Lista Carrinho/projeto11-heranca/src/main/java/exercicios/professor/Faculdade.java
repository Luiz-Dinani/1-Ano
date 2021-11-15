package exercicios.professor;

import java.util.ArrayList;
import java.util.List;

/*
 * @author aluno
 */
public class Faculdade {

    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        new Professor();
        this.professores = new ArrayList<Professor>();
    }

    public void contratarProfessor(Professor prof) {
        if (vagas > 0) {
            professores.add(prof);
            System.out.println(prof.nome + " contratado(a)");
            vagas--;
        }else{
            System.out.println("Sem Vagas!");
        }
    }
    
    public void exibirProfessores(){
        for (Professor professor : professores) {
            System.out.println("\n"+professor);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(String.format("Nome: %s \nVagas: %d \nProfessores:\n", nome,vagas));

        for (Professor professor : professores) {
            str.append("\n"+professor);
        }        
        return str.toString();
    }    
}