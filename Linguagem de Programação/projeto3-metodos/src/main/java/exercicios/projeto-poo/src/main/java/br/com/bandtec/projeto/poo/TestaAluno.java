package br.com.bandtec.projeto.poo;
/*
 * @author Aluno
 */

public class TestaAluno {
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();        
        aluno1.ra = 2211045; //Curiosidade: Se colocar o 0 na frente do 2, ele converte o RA para Octal
        aluno1.nome = "Luiz Carlos Dinani Martins Filho";
        aluno1.nota1 = 10.00;
        aluno1.nota2 = 9.50;                       
        aluno1.calcularMedia();        
        aluno1.exibirDadosAluno();
        // System.out.println(aluno1); //Mostra a posição de aluno1 na memória       
                
        Aluno aluno2 = new Aluno();        
        aluno2.ra = 2211999;
        aluno2.nome = "Ednaldo Pereira";
        aluno2.nota1 = 10.00;
        aluno2.nota2 = 10.00;    
        //aluno2.aprovado = false; //Como eu coloquei o Atributo aprovado como Privado, não é possível alterá-lo
        aluno2.calcularMedia();   
        aluno2.exibirDadosAluno();
    }   
}