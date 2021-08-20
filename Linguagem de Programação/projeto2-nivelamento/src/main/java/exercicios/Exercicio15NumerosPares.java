package exercicios;

/*
 * @author Aluno
 */
public class Exercicio15NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i = 0;
        while (i<=40) {            
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}