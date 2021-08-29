package br.com.bandtec.projeto3.metodos;

/*
 * @author Aluno
 */

public class Calculadora {
    void somar(Integer primeiroNumero, Integer segundoNumero){
        System.out.println(String.format("Resultado = %d", 
                (primeiroNumero+segundoNumero)));
    }
    
    Integer subtrair(Integer primeiroNumero, Integer segundoNumero){
        //System.out.println(String.format("Resultado = %d", 
          //      (primeiroNumero-segundoNumero)));
        return primeiroNumero-segundoNumero; //Devolve um resultado para quem chamar a função
    }
    
    void multiplicar(Integer primeiroNumero, Integer segundoNumero){
        System.out.println(String.format("Resultado = %d", 
                (primeiroNumero*segundoNumero)));
    }
    
    void dividir(Double primeiroNumero, Double segundoNumero){
        System.out.println(String.format("Resultado = %.2f", 
                (primeiroNumero/segundoNumero)));
    }
}
