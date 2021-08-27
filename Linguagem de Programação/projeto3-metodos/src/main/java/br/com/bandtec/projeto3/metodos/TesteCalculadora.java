package br.com.bandtec.projeto3.metodos;

/*
 * @author Aluno
 */
public class TesteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        calc.somar(2, 3);
        calc.somar(5, 5);
        calc.dividir(5.00, 3.00);
        
        Integer resultadoSubtracao = calc.subtrair(10, 5);
        System.out.println("Resultado = " + resultadoSubtracao);
    }
    
}
