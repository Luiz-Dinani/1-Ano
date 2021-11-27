package exercicios.aluno;

public class App {
    public static void main(String[] args) {
        AlunoFundamental alFund = new AlunoFundamental("Theo", 01, 7.0, 6.5, 8.0, 10.0);
        AlunoGraduacao alGrad = new AlunoGraduacao("Yan", 02, 8.0, 10.0);
        AlunoPos alPos = new AlunoPos("Luiz", 03, 10.00, 10.00, 10.00);
        Cadastro cadastro = new Cadastro();

        cadastro.adicionarAluno(alFund);        
        cadastro.adicionarAluno(alGrad);
        cadastro.adicionarAluno(alPos);

        cadastro.exibeAlunosFundamental();
        cadastro.exibeAlunosGraduacao();
        cadastro.exibeAlunosPos();
    }
}