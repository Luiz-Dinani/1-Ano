package exercicios;
/*
 *
 * @author Luiz Dinani
 */
public class Exercicio19ContadorVariado {
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (Double i = 0.15; i < 5; i=i+0.15) {
            System.out.println(String.format("%.2f", i));
        }
    }   
}