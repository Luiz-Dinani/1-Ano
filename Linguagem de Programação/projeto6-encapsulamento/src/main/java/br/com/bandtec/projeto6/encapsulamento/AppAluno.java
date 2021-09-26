package br.com.bandtec.projeto6.encapsulamento;
/*
 * @author aluno
 */
public class AppAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Versão 1
//        Aluno aluninho = new Aluno();
//        Não dá mais pra editar essas vars pq agr elas são privadas        
//        aluninho.ra = "02211045";
//        aluninho.nome = "Luiz";
//        aluninho.curso = "CCO";
//        aluninho.nota1 = 9.50;
//        aluninho.nota2 = 10.00;

        //Versão 2
//          aluninho.setRa("02211045"); //Agora a gente consegue alterar o RA pq
//                                      //estamos chamando uma função da classe que
//                                      //tem acesso às variáveis privadas, a classe Aluno
//          aluninho.setNome("Luiz");
//          aluninho.setCurso("02211045");
//          aluninho.setNota1(10.00);
//          aluninho.setNota2(10.00);
//          
//        System.out.println("RA: " + aluninho.getRa());
//        System.out.println("Nome: " + aluninho.getNome());
//        System.out.println("Curso: " + aluninho.getCurso());
//        System.out.println("Nota1: " + aluninho.getNota1());
//        System.out.println("Nota2: " + aluninho.getNota2());        
//        System.out.println("Média: " + (aluninho.getNota1()+aluninho.getNota2())/2);

        //Versão 3
        //Usando o construtor, eu não preciso daquele monte de set
        Aluno aluno2 = new Aluno("123", "Jorge Mariano", "ADS");
        Aluno aluno3 = new Aluno("12345", "Glaciete Jardim Zago", "CCO", 10.00, 9.00);
        
        System.out.println(aluno2);
    }   
}