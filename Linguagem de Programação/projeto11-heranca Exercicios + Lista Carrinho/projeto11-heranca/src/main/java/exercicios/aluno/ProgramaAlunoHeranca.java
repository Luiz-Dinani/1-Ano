package exercicios.aluno;

public class ProgramaAlunoHeranca {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(01, "Luiz", 10.0, 8.5);
        
        System.out.println(String.format("O aluno %s tem média %.2f", aluno1.nome, aluno1.calcularMedia()));
        System.out.println(aluno1);
        
        Aluno aluno2 = new Aluno(02, "Jorge", 7.0, 6.0);
        System.out.println(String.format("O aluno %s tem média %.2f", aluno2.nome, aluno2.calcularMedia()));
        System.out.println(aluno2);

        AlunoPos aluno3 = new AlunoPos(03, "Anna", 10.00, 10.00, 10.00);
        System.out.println(String.format("O aluno de Pós Graduação %s tem média %.2f", aluno3.nome, aluno3.calcularMedia()));
        System.out.println(aluno3);

        Faculdade facul = new Faculdade("BandTec", 2);
        facul.matricularAluno(aluno1);
        facul.matricularAluno(aluno3);
        facul.matricularAluno(aluno2);
        facul.exibirAlunosMatriculados();
        facul.exibirAlunosPos();
        System.out.println(facul);
    }
}