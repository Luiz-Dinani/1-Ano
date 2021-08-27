package br.com.bandtec.projeto3.metodos;

/*
 * @author Aluno
 */
public class TestarUtilitaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utilitaria util = new Utilitaria(); //Criando um objeto da classe que 
        //a gente criou. Pra funcionar o arquivo Utilitaria.java TEM QUE ESTAR NO MESMO PROJETO que este arquivo
        System.out.println("Iala, o cara usa print normal kkkkk");
        util.exibirLinha();
        util.exibirNome();
        util.exibirNomeDecorado();
    }
    
}
