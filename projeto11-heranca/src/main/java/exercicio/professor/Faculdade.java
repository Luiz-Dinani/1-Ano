package exercicio.professor;

import java.util.ArrayList;
import java.util.List;

/*
 * @author aluno
 */
public class Faculdade {

    private String nome;
    private Integer vagas;
    private Professor prof;
    private List<Professor> professores;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.prof = new Professor();
        this.professores = new ArrayList<Professor>();
    }

    public void contratarProfessor(Professor prof) {
        if (vagas > 0) {
            professores.add(prof);
            vagas--;
        }else{
            System.out.println("Sem Vagas!");
        }
    }
    
    public void exibirProfessores(){
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }

}
