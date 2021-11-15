package com.bandtec.projeto11.heranca;
/*
 * @author Luiz Dinani
 */
public class App {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("10", "Luiz");
        AlunoGraduacao aluno2 = new AlunoGraduacao(10.00, 10.00, "20", "Anna");
        
        System.out.println(aluno1);
        System.out.println(("=").repeat(15));
        System.out.println(aluno2);
    
    }   
    
}